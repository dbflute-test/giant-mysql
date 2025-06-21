
-- =======================================================================================
--                                                                        絞り込み+日付ソート
--                                                                        ================
-- ---------------------------------------------------------
--                                                   前提確認
--                                                   -------
-- ソートなしで範囲条件 => 遅い
select count(*)
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 50 
+----------+
| count(*) |
+----------+
|    50000 |
+----------+
1 row in set (0.02 sec)

-- ソートありで範囲条件 => 遅い
select count(*)
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 50 
 order by ref.INDEX_DATETIME asc
+----------+
| count(*) |
+----------+
|    50000 |
+----------+
1 row in set (2.77 sec)

-- ソートありで等値条件 => 速い (件数少ないから)
-- o 範囲条件のパターンと論理的に比較してピンポイント複合インデックスが効果あるかを分析する
select count(*)
  from GIANT_REF ref
 where ref.INDEX_INTEGER = 1 
 order by ref.INDEX_DATETIME asc
+----------+
| count(*) |
+----------+
|     1000 |
+----------+
1 row in set (0.00 sec)


-- ---------------------------------------------------------
--                               ピンポイント複合インデックスなし
--                               ---------------------------
-- ascのまま => Using MRR; Using filesort
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 50
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+-------+----------------------------+----------------------------+---------+------+--------+----------+--------------------------------------------------+
| id | select_type | table | partitions | type  | possible_keys              | key                        | key_len | ref  | rows   | filtered | Extra                                            |
+----+-------------+-------+------------+-------+----------------------------+----------------------------+---------+------+--------+----------+--------------------------------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER | IX_GIANT_REF_INDEX_INTEGER | 4       | NULL | 104988 |   100.00 | Using index condition; Using MRR; Using filesort |
+----+-------------+-------+------------+-------+----------------------------+----------------------------+---------+------+--------+----------+--------------------------------------------------+
1 row in set, 1 warning (0.01 sec)

-- descにしてみた => 変わらず
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 50
 order by ref.INDEX_DATETIME desc
+----+-------------+-------+------------+-------+----------------------------+----------------------------+---------+------+--------+----------+--------------------------------------------------+
| id | select_type | table | partitions | type  | possible_keys              | key                        | key_len | ref  | rows   | filtered | Extra                                            |
+----+-------------+-------+------------+-------+----------------------------+----------------------------+---------+------+--------+----------+--------------------------------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER | IX_GIANT_REF_INDEX_INTEGER | 4       | NULL | 104988 |   100.00 | Using index condition; Using MRR; Using filesort |
+----+-------------+-------+------------+-------+----------------------------+----------------------------+---------+------+--------+----------+--------------------------------------------------+
1 row in set, 1 warning (0.00 sec)

-- 等値条件にしてみた => 件数少ないけどUsing filesort
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER = 1
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+------+----------------------------+----------------------------+---------+-------+------+----------+----------------+
| id | select_type | table | partitions | type | possible_keys              | key                        | key_len | ref   | rows | filtered | Extra          |
+----+-------------+-------+------------+------+----------------------------+----------------------------+---------+-------+------+----------+----------------+
|  1 | SIMPLE      | ref   | NULL       | ref  | IX_GIANT_REF_INDEX_INTEGER | IX_GIANT_REF_INDEX_INTEGER | 4       | const | 1000 |   100.00 | Using filesort |
+----+-------------+-------+------------+------+----------------------------+----------------------------+---------+-------+------+----------+----------------+
1 row in set, 1 warning (0.00 sec)


-- ---------------------------------------------------------
--                          ピンポイント複合インデックス貼ってみた
--                          --------------------------------
-- ascのピンポイント複合インデックスを貼ってみる
create index IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC on GIANT_REF (INDEX_INTEGER, INDEX_DATETIME)


-- ascのまま => ピンポイント複合インデックスは使われてるけど、Using MRR; Using filesort
-- o 件数が多すぎてUsing MRRが必要になってfilesortが必要？MRRとfilesortの関連性は？
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 50
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------+----------------------------------------------------+---------+------+--------+----------+--------------------------------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                 | key                                                | key_len | ref  | rows   | filtered | Extra                                            |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------+----------------------------------------------------+---------+------+--------+----------+--------------------------------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER,IX_RESEARCH_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | 4       | NULL | 100652 |   100.00 | Using index condition; Using MRR; Using filesort |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------+----------------------------------------------------+---------+------+--------+----------+--------------------------------------------------+
1 row in set, 1 warning (0.00 sec)

-- もっと絞ってみた => ピンポイント複合インデックスが使われなくなった!? Using MRRは消えたが、Using filesortが残る
-- o 件数が減ったことでMRRする必要はなくなったけどfilesortが必要？ (よくわからないので要調査)
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 5
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------+----------------------------+---------+------+------+----------+---------------------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                 | key                        | key_len | ref  | rows | filtered | Extra                                 |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------+----------------------------+---------+------+------+----------+---------------------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER,IX_RESEARCH_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_GIANT_REF_INDEX_INTEGER | 4       | NULL | 5000 |   100.00 | Using index condition; Using filesort |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------+----------------------------+---------+------+------+----------+---------------------------------------+
1 row in set, 1 warning (0.00 sec)

-- 等値条件にしてみた => ピンポイント複合インデックスが使われてる、Using filesort消えた！
-- o 元々等値条件のときに Using filesort あったので効果ある
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER = 1
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+------+-------------------------------------------------------------------------------+----------------------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                                                                 | key                                                | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+-------------------------------------------------------------------------------+----------------------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | ref   | NULL       | ref  | IX_GIANT_REF_INDEX_INTEGER,IX_RESEARCH_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | 4       | const | 1000 |   100.00 | NULL  |
+----+-------------+-------+------------+------+-------------------------------------------------------------------------------+----------------------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.00 sec)

-- 等値条件のdesc => 複合インデックスが使われた、Backward index scan
-- o Backwardするけど効果ありそう
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER = 1
 order by ref.INDEX_DATETIME desc
+----+-------------+-------+------------+------+-------------------------------------------------------------------------------+----------------------------------------------------+---------+-------+------+----------+---------------------+
| id | select_type | table | partitions | type | possible_keys                                                                 | key                                                | key_len | ref   | rows | filtered | Extra               |
+----+-------------+-------+------------+------+-------------------------------------------------------------------------------+----------------------------------------------------+---------+-------+------+----------+---------------------+
|  1 | SIMPLE      | ref   | NULL       | ref  | IX_GIANT_REF_INDEX_INTEGER,IX_RESEARCH_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | 4       | const | 1000 |   100.00 | Backward index scan |
+----+-------------+-------+------------+------+-------------------------------------------------------------------------------+----------------------------------------------------+---------+-------+------+----------+---------------------+
1 row in set, 1 warning (0.00 sec)


-- 元に戻すときはこれ
drop index IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC on GIANT_REF



-- ---------------------------------------------------------
--                              等値条件でも大量レコードのパターン
--                              ----------------------------
-- _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
-- ここの検証、FK付け直しが発生してめっちゃ時間掛かるので気軽にやり直せないので要注意
-- _/_/_/_/_/_/_/_/_/_/

-- 等値条件でも大量レコード (ピンポイント複合インデックスなし) => 遅い
select count(*)
  from GIANT_REF ref
 where ref.ZONE_MEMBER_ID = 1
 order by ref.INDEX_DATETIME asc
+----------+
| count(*) |
+----------+
|   500815 |
+----------+
1 row in set (3.78 sec)

-- 等値条件でも大量レコード (ピンポイント複合インデックスなし) => Using filesort
explain
select *
  from GIANT_REF ref
 where ref.ZONE_MEMBER_ID = 1
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+------+--------------------------+--------------------------+---------+-------+---------+----------+----------------+
| id | select_type | table | partitions | type | possible_keys            | key                      | key_len | ref   | rows    | filtered | Extra          |
+----+-------------+-------+------------+------+--------------------------+--------------------------+---------+-------+---------+----------+----------------+
|  1 | SIMPLE      | ref   | NULL       | ref  | FK_GIANT_REF_ZONE_MEMBER | FK_GIANT_REF_ZONE_MEMBER | 4       | const | 1024530 |   100.00 | Using filesort |
+----+-------------+-------+------------+------+--------------------------+--------------------------+---------+-------+---------+----------+----------------+
1 row in set, 1 warning (0.01 sec)

-- ascのピンポイント複合インデックスを貼ってみる
create index IX_RESEARCH_GIANT_REF_ZONE_MEMBER_ID_INDEX_DATETIME_ASC on GIANT_REF (ZONE_MEMBER_ID, INDEX_DATETIME)

-- 等値条件でも大量レコード (ピンポイント複合インデックス貼ってみた) => ピンポイント複合インデックスが使われてる、Using filesortない！
-- o 等値条件なら大量レコードになってもピンポイント複合インデックスの効果はあると言えそう
explain
select *
  from GIANT_REF ref
 where ref.ZONE_MEMBER_ID = 1
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+------+---------------------------------------------------------+---------------------------------------------------------+---------+-------+---------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                                           | key                                                     | key_len | ref   | rows    | filtered | Extra |
+----+-------------+-------+------------+------+---------------------------------------------------------+---------------------------------------------------------+---------+-------+---------+----------+-------+
|  1 | SIMPLE      | ref   | NULL       | ref  | IX_RESEARCH_GIANT_REF_ZONE_MEMBER_ID_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_REF_ZONE_MEMBER_ID_INDEX_DATETIME_ASC | 4       | const | 1064018 |   100.00 | NULL  |
+----+-------------+-------+------------+------+---------------------------------------------------------+---------------------------------------------------------+---------+-------+---------+----------+-------+
1 row in set, 1 warning (0.01 sec)

-- 等値条件でも大量レコード (ピンポイント複合インデックス貼ってみた) => 速い
select count(*)
  from GIANT_REF ref
 where ref.ZONE_MEMBER_ID = 1
 order by ref.INDEX_DATETIME asc
 +----------+
| count(*) |
+----------+
|   500815 |
+----------+
1 row in set (0.10 sec)

-- count(*)じゃなくて*で検索 (さすがにlimit) => これでも速い
select *
  from GIANT_REF ref
 where ref.ZONE_MEMBER_ID = 1
 order by ref.INDEX_DATETIME asc
 limit 10000
...
10000 rows in set (0.21 sec)


-- 元に戻そう...と思ったら needed in a foreign key constraint で消せない!?
-- FKを削除してからdropしてFK付けるじゃないと消せないのでちょっと面倒 (めちゃ時間掛かる)
alter table GIANT_REF drop foreign key FK_GIANT_REF_ZONE_MEMBER

-- 要はFK対応ののインデックスになっちゃってるっぽい (元のFKインデックスはあるのかな？)
drop index IX_RESEARCH_GIANT_REF_ZONE_MEMBER_ID_INDEX_DATETIME_ASC on GIANT_REF

-- これめっちゃ時間掛かる (1 hour 20 min 26.17 sec)
alter table GIANT_REF add constraint FK_GIANT_REF_ZONE_MEMBER
	foreign key (ZONE_MEMBER_ID) references MEMBER (MEMBER_ID)




 
-- =======================================================================================
--                                                                       join検索+日付ソート
--                                                                       =================
-- ---------------------------------------------------------
--                                                   前提確認
--                                                   -------
-- ソートなしでカウント検索 => 速い
select count(*)
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER < 50
+----------+
| count(*) |
+----------+
|    50619 |
+----------+
1 row in set (0.08 sec)

-- ソートありでカウント検索 => 遅い
select count(*)
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER < 50
 order by ref.INDEX_DATETIME asc
+----------+
| count(*) |
+----------+
|    50619 |
+----------+
1 row in set (2.70 sec)

-- 等値条件でソートありでカウント検索 => 速い (件数少ない)
select count(*)
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER = 1
 order by ref.INDEX_DATETIME asc
+----------+
| count(*) |
+----------+
|     1000 |
+----------+
1 row in set (0.06 sec)



-- ---------------------------------------------------------
--                                         特定インデックスなし
--                                         -----------------
-- 範囲検索してascソート => Using temporary; Using filesort
-- o REF側のGIANT_ID_INTEGERの複合インデックスが使われてるけど、二番目カラムは使われないのでそこに意味ない
-- o joinなしに比べて、Using temporaryが追加されていてより重い？
explain
select gi.INDEX_INTEGER, ref.INDEX_DATETIME
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER < 50
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+-------+----------------------------------------+----------------------------------------+---------+-----------------------+-------+----------+-----------------------------------------------------------+
| id | select_type | table | partitions | type  | possible_keys                          | key                                    | key_len | ref                   | rows  | filtered | Extra                                                     |
+----+-------------+-------+------------+-------+----------------------------------------+----------------------------------------+---------+-----------------------+-------+----------+-----------------------------------------------------------+
|  1 | SIMPLE      | gi    | NULL       | range | PRIMARY,IX_GIANT_INDEX_INTEGER         | IX_GIANT_INDEX_INTEGER                 | 4       | NULL                  | 31240 |   100.00 | Using where; Using index; Using temporary; Using filesort |
|  1 | SIMPLE      | ref   | NULL       | ref   | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 8       | maihamadb.gi.GIANT_ID |     3 |   100.00 | NULL                                                      |
+----+-------------+-------+------------+-------+----------------------------------------+----------------------------------------+---------+-----------------------+-------+----------+-----------------------------------------------------------+
2 rows in set, 1 warning (0.00 sec)
 

-- 等値条件してascソート => 変わらずUsing temporary; Using filesort
-- o REF側のGIANT_ID_INTEGERの複合インデックスが使われてるけど、二番目カラムは使われないのでそこに意味ない
-- o とにかくjoinがでかいか？
explain
select gi.INDEX_INTEGER, ref.INDEX_DATETIME
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER = 1
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+------+----------------------------------------+----------------------------------------+---------+-----------------------+------+----------+----------------------------------------------+
| id | select_type | table | partitions | type | possible_keys                          | key                                    | key_len | ref                   | rows | filtered | Extra                                        |
+----+-------------+-------+------------+------+----------------------------------------+----------------------------------------+---------+-----------------------+------+----------+----------------------------------------------+
|  1 | SIMPLE      | gi    | NULL       | ref  | PRIMARY,IX_GIANT_INDEX_INTEGER         | IX_GIANT_INDEX_INTEGER                 | 4       | const                 |  300 |   100.00 | Using index; Using temporary; Using filesort |
|  1 | SIMPLE      | ref   | NULL       | ref  | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 8       | maihamadb.gi.GIANT_ID |    3 |   100.00 | NULL                                         |
+----+-------------+-------+------------+------+----------------------------------------+----------------------------------------+---------+-----------------------+------+----------+----------------------------------------------+
2 rows in set, 1 warning (0.00 sec)



 -- ---------------------------------------------------------
--                                    複合インデックス貼ってみた
--                                    ----------------------
-- ascの複合インデックスを貼ってみる
create index IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC on GIANT_REF (GIANT_ID, INDEX_DATETIME)


-- ソートありでカウント検索 => 速くなってる！
select count(*)
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER < 50
 order by ref.INDEX_DATETIME asc
+----------+
| count(*) |
+----------+
|    50619 |
+----------+
1 row in set (0.07 sec)

-- 範囲検索してascソート => gi側は変わらずUsing temporary; Using filesortだけどref側で複合インデックス使われてる
-- o ref側にUsing indexが追加されいて、マシになったっぽい
-- o ただ、とにかくjoinがでかいか？ (別問題)
explain
select gi.INDEX_INTEGER, ref.INDEX_DATETIME
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER < 50
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+-------+------------------------------------------------------------------------------------------+---------------------------------------------------+---------+-----------------------+-------+----------+-----------------------------------------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                            | key                                               | key_len | ref                   | rows  | filtered | Extra                                                     |
+----+-------------+-------+------------+-------+------------------------------------------------------------------------------------------+---------------------------------------------------+---------+-----------------------+-------+----------+-----------------------------------------------------------+
|  1 | SIMPLE      | gi    | NULL       | range | PRIMARY,IX_GIANT_INDEX_INTEGER                                                           | IX_GIANT_INDEX_INTEGER                            | 4       | NULL                  | 31240 |   100.00 | Using where; Using index; Using temporary; Using filesort |
|  1 | SIMPLE      | ref   | NULL       | ref   | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER,IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC | 8       | maihamadb.gi.GIANT_ID |     3 |   100.00 | Using index                                               |
+----+-------------+-------+------------+-------+------------------------------------------------------------------------------------------+---------------------------------------------------+---------+-----------------------+-------+----------+-----------------------------------------------------------+
2 rows in set, 1 warning (0.00 sec)

-- 等値条件してascソート => gi側は変わらずUsing temporary; Using filesortだけどref側で複合インデックス使われてる
-- o ref側にUsing indexが追加されいて、マシになったっぽい
-- o ただ、とにかくjoinがでかいか？ (別問題)
explain
select gi.INDEX_INTEGER, ref.INDEX_DATETIME
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER = 1
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+------+------------------------------------------------------------------------------------------+---------------------------------------------------+---------+-----------------------+------+----------+----------------------------------------------+
| id | select_type | table | partitions | type | possible_keys                                                                            | key                                               | key_len | ref                   | rows | filtered | Extra                                        |
+----+-------------+-------+------------+------+------------------------------------------------------------------------------------------+---------------------------------------------------+---------+-----------------------+------+----------+----------------------------------------------+
|  1 | SIMPLE      | gi    | NULL       | ref  | PRIMARY,IX_GIANT_INDEX_INTEGER                                                           | IX_GIANT_INDEX_INTEGER                            | 4       | const                 |  300 |   100.00 | Using index; Using temporary; Using filesort |
|  1 | SIMPLE      | ref   | NULL       | ref  | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER,IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC | 8       | maihamadb.gi.GIANT_ID |    3 |   100.00 | Using index                                  |
+----+-------------+-------+------------+------+------------------------------------------------------------------------------------------+---------------------------------------------------+---------+-----------------------+------+----------+----------------------------------------------+
2 rows in set, 1 warning (0.00 sec)

-- 一応desc => 変わらずUsing indexで良いのかな
explain
select gi.INDEX_INTEGER, ref.INDEX_DATETIME
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER = 1
 order by ref.INDEX_DATETIME desc
+----+-------------+-------+------------+------+------------------------------------------------------------------------------------------+---------------------------------------------------+---------+-----------------------+------+----------+----------------------------------------------+
| id | select_type | table | partitions | type | possible_keys                                                                            | key                                               | key_len | ref                   | rows | filtered | Extra                                        |
+----+-------------+-------+------------+------+------------------------------------------------------------------------------------------+---------------------------------------------------+---------+-----------------------+------+----------+----------------------------------------------+
|  1 | SIMPLE      | gi    | NULL       | ref  | PRIMARY,IX_GIANT_INDEX_INTEGER                                                           | IX_GIANT_INDEX_INTEGER                            | 4       | const                 |  300 |   100.00 | Using index; Using temporary; Using filesort |
|  1 | SIMPLE      | ref   | NULL       | ref  | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER,IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC | 8       | maihamadb.gi.GIANT_ID |    3 |   100.00 | Using index                                  |
+----+-------------+-------+------------+------+------------------------------------------------------------------------------------------+---------------------------------------------------+---------+-----------------------+------+----------+----------------------------------------------+
2 rows in set, 1 warning (0.01 sec)

-- さっき遅かった検索がdescでも速くなっているのでdescでも問題ない
select count(*)
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER < 50
 order by ref.INDEX_DATETIME desc
+----------+
| count(*) |
+----------+
|    50619 |
+----------+
1 row in set (0.05 sec)



-- 元に戻そう
drop index IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC on GIANT_REF
 
 
 -- 途端に遅くなる (つまり複合インデックスは効果がある証拠)
select count(*)
  from GIANT_REF ref
    inner join GIANT gi on ref.GIANT_ID = gi.GIANT_ID
 where gi.INDEX_INTEGER < 50
 order by ref.INDEX_DATETIME desc
 +----------+
| count(*) |
+----------+
|    50619 |
+----------+
1 row in set (3.52 sec)





















 


-- =======================================================================================
--                                                                    番外: 等値条件+日付範囲
--                                                                    ====================
-- _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
-- order by用に作ったピンポイント複合インデックスは絞り込みでも使えるか？
-- _/_/_/_/

explain
select *
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
   and dfloc.INDEX_DATETIME between '2024-01-01 12:34:56' and '2024-01-24 12:34:56'
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------------------+--------------------------------------------+---------+------+------+----------+-----------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                             | key                                        | key_len | ref  | rows | filtered | Extra                 |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------------------+--------------------------------------------+---------+------+------+----------+-----------------------+
|  1 | SIMPLE      | dfloc | NULL       | range | IX_GIANT_INDEX_INTEGER,IX_GIANT_INDEX_DATETIME,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC | IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC | 9       | NULL |    1 |   100.00 | Using index condition |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------------------+--------------------------------------------+---------+------+------+----------+-----------------------+
1 row in set, 1 warning (0.07 sec)

↑Using index にはならないのかな？

create index IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC on GIANT (INDEX_INTEGER, INDEX_DATETIME)

explain
select *
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
   and dfloc.INDEX_DATETIME between '2024-01-01 12:34:56' and '2024-01-24 12:34:56'
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------------------------------------------------------------+--------------------------------------------+---------+------+------+----------+-----------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                                                                       | key                                        | key_len | ref  | rows | filtered | Extra                 |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------------------------------------------------------------+--------------------------------------------+---------+------+------+----------+-----------------------+
|  1 | SIMPLE      | dfloc | NULL       | range | IX_GIANT_INDEX_INTEGER,IX_GIANT_INDEX_DATETIME,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC | 9       | NULL |    1 |   100.00 | Using index condition |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------------------------------------------------------------+--------------------------------------------+---------+------+------+----------+-----------------------+
1 row in set, 1 warning (0.00 sec)

↑ascのINDEXがあっても変わらない。


explain
select INDEX_INTEGER, INDEX_DATETIME
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
   and dfloc.INDEX_DATETIME between '2024-01-01 12:34:56' and '2024-01-24 12:34:56'
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------------------------------------------------------------+--------------------------------------------+---------+------+------+----------+--------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                                                                       | key                                        | key_len | ref  | rows | filtered | Extra                    |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------------------------------------------------------------+--------------------------------------------+---------+------+------+----------+--------------------------+
|  1 | SIMPLE      | dfloc | NULL       | range | IX_GIANT_INDEX_INTEGER,IX_GIANT_INDEX_DATETIME,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC | 9       | NULL |    1 |   100.00 | Using where; Using index |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------------------------------------------------------------------------+--------------------------------------------+---------+------+------+----------+--------------------------+
1 row in set, 1 warning (0.00 sec)

↑これだったら、Using index で完結するということだった。

-- ascは戻す:
drop index IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC on GIANT

なんにせよ、降順INDEXでも範囲検索は大丈夫そう。


 
 