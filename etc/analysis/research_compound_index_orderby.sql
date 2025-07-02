
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
-- explain analyze (実際に実行) で想定通り3秒掛かっている
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
+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
 -> Sort: ref.INDEX_DATETIME  (cost=112499 rows=104988) (actual time=3102..3112 rows=50000 loops=1)
    -> Index range scan on ref using IX_RESEARCH_GIANT_REF_INDEX_INTEGER_REF_ID_ASC over (INDEX_INTEGER < 50), with index condition: (ref.INDEX_INTEGER < 50)  (cost=112499 rows=104988) (actual time=2636..3066 rows=50000 loops=1)
+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (3.17 sec)


-- descにしてみた => 変わらずUsing MRR; Using filesort
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
+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| -> Sort: ref.INDEX_DATETIME DESC  (cost=111642 rows=104988) (actual time=2686..2696 rows=50000 loops=1)
    -> Index range scan on ref using IX_RESEARCH_GIANT_REF_INDEX_INTEGER_REF_ID_ASC over (INDEX_INTEGER < 50), with index condition: (ref.INDEX_INTEGER < 50)  (cost=111642 rows=104988) (actual time=2618..2658 rows=50000 loops=1)
+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (2.71 sec)


-- もっと絞ってみた => 変わらずUsing MRR; Using filesort
-- 件数減ったからまあ実行自体は速いは速いが、analyze見るとSortはちゃんとしている
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 5
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+-------+----------------------------+----------------------------+---------+------+------+----------+--------------------------------------------------+
| id | select_type | table | partitions | type  | possible_keys              | key                        | key_len | ref  | rows | filtered | Extra                                            |
+----+-------------+-------+------------+-------+----------------------------+----------------------------+---------+------+------+----------+--------------------------------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER | IX_GIANT_REF_INDEX_INTEGER | 4       | NULL | 8998 |   100.00 | Using index condition; Using MRR; Using filesort |
+----+-------------+-------+------------+-------+----------------------------+----------------------------+---------+------+------+----------+--------------------------------------------------+
1 row in set, 1 warning (0.00 sec)
+----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| -> Sort: ref.INDEX_DATETIME  (cost=10651 rows=8998) (actual time=64.4..65.7 rows=5000 loops=1)
    -> Index range scan on ref using IX_GIANT_REF_INDEX_INTEGER over (INDEX_INTEGER < 5), with index condition: (ref.INDEX_INTEGER < 5)  (cost=10651 rows=8998) (actual time=52..62.4 rows=5000 loops=1)
+----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.06 sec)


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
+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| -> Sort: ref.INDEX_DATETIME  (cost=1074 rows=1000) (actual time=6.67..7.19 rows=1000 loops=1)
    -> Index lookup on ref using IX_GIANT_REF_INDEX_INTEGER (INDEX_INTEGER=1)  (cost=1074 rows=1000) (actual time=1.46..5.23 rows=1000 loops=1)
+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.01 sec)




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
+----+-------------+-------+------------+-------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+------+--------+----------+--------------------------------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                     | key                                                    | key_len | ref  | rows   | filtered | Extra                                            |
+----+-------------+-------+------------+-------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+------+--------+----------+--------------------------------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER,IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC | 4       | NULL | 100652 |   100.00 | Using index condition; Using MRR; Using filesort |
+----+-------------+-------+------------+-------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+------+--------+----------+--------------------------------------------------+
1 row in set, 1 warning (0.00 sec)
+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| -> Sort: ref.INDEX_DATETIME  (cost=108504 rows=100652) (actual time=2773..2782 rows=50000 loops=1)
    -> Index range scan on ref using IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC over (INDEX_INTEGER < 50), with index condition: (ref.INDEX_INTEGER < 50)  (cost=108504 rows=100652) (actual time=2709..2747 rows=50000 loops=1)
+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (2.80 sec)


-- もっと絞ってみた => Using MRRは消えたが、Using filesortが残る
-- o 件数が減ったことでMRRする必要はなくなったけどfilesortが必要？ (よくわからないので要調査)
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 5
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+-------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+------+------+----------+---------------------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                     | key                                                    | key_len | ref  | rows | filtered | Extra                                 |
+----+-------------+-------+------------+-------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+------+------+----------+---------------------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER,IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC | 4       | NULL | 5000 |   100.00 | Using index condition; Using filesort |
+----+-------------+-------+------------+-------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+------+------+----------+---------------------------------------+
1 row in set, 1 warning (0.00 sec)
+----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| -> Sort: ref.INDEX_DATETIME  (cost=5946 rows=5000) (actual time=23.3..25.4 rows=5000 loops=1)
    -> Index range scan on ref using IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC over (INDEX_INTEGER < 5), with index condition: (ref.INDEX_INTEGER < 5)  (cost=5946 rows=5000) (actual time=0.0667..18.9 rows=5000 loops=1)
+----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.03 sec)


-- 等値条件にしてみた => ピンポイント複合インデックスが使われてる、Using filesort消えた！
-- o 元々等値条件のときに Using filesort あったので効果ある
-- o explain analyze から sort が消えた！
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER = 1
 order by ref.INDEX_DATETIME asc
+----+-------------+-------+------------+------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                                                                     | key                                                    | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | ref   | NULL       | ref  | IX_GIANT_REF_INDEX_INTEGER,IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC | 4       | const | 1000 |   100.00 | NULL  |
+----+-------------+-------+------------+------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.00 sec)
+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| -> Index lookup on ref using IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC (INDEX_INTEGER=1)  (cost=1089 rows=1000) (actual time=0.82..5.76 rows=1000 loops=1)
+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.01 sec)


-- 等値条件のdesc => 複合インデックスが使われた、Backward index scan
-- o Backwardするけど効果ありそう
explain
select *
  from GIANT_REF ref
 where ref.INDEX_INTEGER = 1
 order by ref.INDEX_DATETIME desc
+----+-------------+-------+------------+------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+-------+------+----------+---------------------+
| id | select_type | table | partitions | type | possible_keys                                                                     | key                                                    | key_len | ref   | rows | filtered | Extra               |
+----+-------------+-------+------------+------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+-------+------+----------+---------------------+
|  1 | SIMPLE      | ref   | NULL       | ref  | IX_GIANT_REF_INDEX_INTEGER,IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC | 4       | const | 1000 |   100.00 | Backward index scan |
+----+-------------+-------+------------+------+-----------------------------------------------------------------------------------+--------------------------------------------------------+---------+-------+------+----------+---------------------+
1 row in set, 1 warning (0.00 sec)
+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| -> Index lookup on ref using IX_RESEARCH_GIANT_REF_INDEX_INTEGER_INDEX_DATETIME_ASC (INDEX_INTEGER=1) (reverse)  (cost=1089 rows=1000) (actual time=2.14..8.5 rows=1000 loops=1)
+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.01 sec)


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
| -> Sort: ref.INDEX_DATETIME  (cost=409958 rows=1.02e+6) (actual time=5255..5348 rows=500815 loops=1)
    -> Index lookup on ref using FK_GIANT_REF_ZONE_MEMBER (ZONE_MEMBER_ID=1)  (cost=409958 rows=1.02e+6) (actual time=4.11..4757 rows=500815 loops=1)


-- ascのピンポイント複合インデックスを貼ってみる
-- (↓これ実行すると、FKのインデックスである FK_GIANT_REF_ZONE_MEMBER が消えるっぽい: 代替されるってことのようだ)
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
| -> Index lookup on ref using IX_RESEARCH_GIANT_REF_ZONE_MEMBER_ID_INDEX_DATETIME_ASC (ZONE_MEMBER_ID=1)  (cost=413984 rows=1.06e+6) (actual time=25.5..18586 rows=500815 loops=1)

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
--                                       (join検索+日付ソート)
--                                         特定インデックスなし
--                                         -----------------
-- 範囲検索してascソート => Using temporary; Using filesort
-- o 最初のjoin行にUsing temporary; Using filesortが表示されているのはjoinしてからsortを行っている証拠のよう
-- o REF側のGIANT_ID_INTEGERの複合インデックスが使われてるけど、二番目カラムは使われないのでそこに意味ない
-- o joinなしに比べて、Using temporaryが追加されていてより重い？ => そのようである、joinしてからsort
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
| -> Sort: ref.INDEX_DATETIME  (actual time=5189..5190 rows=50619 loops=1)
    -> Stream results  (cost=113694 rows=97636) (actual time=5.65..5179 rows=50619 loops=1)
        -> Nested loop inner join  (cost=113694 rows=97636) (actual time=5.61..5173 rows=50619 loops=1)
            -> Filter: (gi.INDEX_INTEGER < 50)  (cost=6295 rows=31240) (actual time=0.108..7.59 rows=15000 loops=1)
                -> Covering index range scan on gi using IX_GIANT_INDEX_INTEGER over (INDEX_INTEGER < 50)  (cost=6295 rows=31240) (actual time=0.103..6.61 rows=15000 loops=1)
            -> Index lookup on ref using IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER (GIANT_ID=gi.GIANT_ID)  (cost=3.13 rows=3.13) (actual time=0.322..0.344 rows=3.37 loops=15000)


-- 等値条件してascソート => 変わらずUsing temporary; Using filesort
-- o REF側のGIANT_ID_INTEGERの複合インデックスが使われてるけど、二番目カラムは使われないのでそこに意味ない (たまたま)
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
| -> Sort: ref.INDEX_DATETIME  (actual time=98..98 rows=1000 loops=1)
    -> Stream results  (cost=1041 rows=938) (actual time=1.96..97.6 rows=1000 loops=1)
        -> Nested loop inner join  (cost=1041 rows=938) (actual time=1.95..97.4 rows=1000 loops=1)
            -> Covering index lookup on gi using IX_GIANT_INDEX_INTEGER (INDEX_INTEGER=1)  (cost=31.4 rows=300) (actual time=0.147..0.238 rows=300 loops=1)
            -> Index lookup on ref using IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER (GIANT_ID=gi.GIANT_ID)  (cost=3.05 rows=3.13) (actual time=0.308..0.324 rows=3.33 loops=300)
 |



-- ---------------------------------------------------------
--                                       (join検索+日付ソート)
--                                    複合インデックス貼ってみた
--                                    ----------------------
-- ascの複合インデックスを貼ってみる
create index IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC on GIANT_REF (GIANT_ID, INDEX_DATETIME)


-- ソートありでカウント検索 => 速くなってる！
-- o count(*)じゃなくて "select *" でも速い (1秒くらい: 表示の分も含まれてるだろうか？)
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
-- o joinしてからsortなので最初の行にUsing temporary; Using filesortが表示されているけど...
--   そのsortにピンポイント複合インデックスが利用されていると解釈できるのか？ (実際に速いので)
-- o でもそれだったら、Using temporary; Using filesortが表示されて欲しくはないが...
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
| -> Sort: ref.INDEX_DATETIME  (actual time=78.2..79.4 rows=50619 loops=1)
    -> Stream results  (cost=48494 rows=107639) (actual time=0.121..68.7 rows=50619 loops=1)
        -> Nested loop inner join  (cost=48494 rows=107639) (actual time=0.115..60.7 rows=50619 loops=1)
            -> Filter: (gi.INDEX_INTEGER < 50)  (cost=6295 rows=31240) (actual time=0.0375..8.68 rows=15000 loops=1)
                -> Covering index range scan on gi using IX_GIANT_INDEX_INTEGER over (INDEX_INTEGER < 50)  (cost=6295 rows=31240) (actual time=0.0358..7.39 rows=15000 loops=1)
            -> Covering index lookup on ref using IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC (GIANT_ID=gi.GIANT_ID)  (cost=1.01 rows=3.45) (actual time=0.00249..0.00313 rows=3.37 loops=15000)
 |

-- 等値条件してascソート => gi側は変わらずUsing temporary; Using filesortだけどref側で複合インデックス使われてる
-- o こちらも同じく、join後のsortでピンポイント複合インデックスが利用されているということか？ (実際に速いので)
explain analyze
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
| -> Sort: ref.INDEX_DATETIME  (actual time=3.45..3.51 rows=1000 loops=1)
    -> Stream results  (cost=437 rows=1034) (actual time=0.0913..3.08 rows=1000 loops=1)
        -> Nested loop inner join  (cost=437 rows=1034) (actual time=0.0856..2.8 rows=1000 loops=1)
            -> Covering index lookup on gi using IX_GIANT_INDEX_INTEGER (INDEX_INTEGER=1)  (cost=31.4 rows=300) (actual time=0.0651..0.192 rows=300 loops=1)
            -> Covering index lookup on ref using IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC (GIANT_ID=gi.GIANT_ID)  (cost=1.01 rows=3.45) (actual time=0.00706..0.00825 rows=3.33 loops=300)
 |

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
| -> Sort: ref.INDEX_DATETIME DESC  (actual time=6.33..6.41 rows=1000 loops=1)
    -> Stream results  (cost=421 rows=910) (actual time=0.165..5.84 rows=1000 loops=1)
        -> Nested loop inner join  (cost=421 rows=910) (actual time=0.156..5.52 rows=1000 loops=1)
            -> Covering index lookup on gi using IX_GIANT_INDEX_INTEGER (INDEX_INTEGER=1)  (cost=31.4 rows=300) (actual time=0.103..0.25 rows=300 loops=1)
            -> Covering index lookup on ref using IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC (GIANT_ID=gi.GIANT_ID)  (cost=0.996 rows=3.03) (actual time=0.0158..0.0171 rows=3.33 loops=300)
 |

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
show index from GIANT_REF
 
 
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




-- ---------------------------------------------------------
--                                       (join検索+日付ソート)
--                                         まとめ的パッと見比較
--                                         -----------------
-- 複合インデックスなし
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
| -> Sort: ref.INDEX_DATETIME  (actual time=5189..5190 rows=50619 loops=1)
    -> Stream results  (cost=113694 rows=97636) (actual time=5.65..5179 rows=50619 loops=1)
        -> Nested loop inner join  (cost=113694 rows=97636) (actual time=5.61..5173 rows=50619 loops=1)
            -> Filter: (gi.INDEX_INTEGER < 50)  (cost=6295 rows=31240) (actual time=0.108..7.59 rows=15000 loops=1)
                -> Covering index range scan on gi using IX_GIANT_INDEX_INTEGER over (INDEX_INTEGER < 50)  (cost=6295 rows=31240) (actual time=0.103..6.61 rows=15000 loops=1)
            -> Index lookup on ref using IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER (GIANT_ID=gi.GIANT_ID)  (cost=3.13 rows=3.13) (actual time=0.322..0.344 rows=3.37 loops=15000)

-- 複合インデックス貼ってみた
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
| -> Sort: ref.INDEX_DATETIME  (actual time=78.2..79.4 rows=50619 loops=1)
    -> Stream results  (cost=48494 rows=107639) (actual time=0.121..68.7 rows=50619 loops=1)
        -> Nested loop inner join  (cost=48494 rows=107639) (actual time=0.115..60.7 rows=50619 loops=1)
            -> Filter: (gi.INDEX_INTEGER < 50)  (cost=6295 rows=31240) (actual time=0.0375..8.68 rows=15000 loops=1)
                -> Covering index range scan on gi using IX_GIANT_INDEX_INTEGER over (INDEX_INTEGER < 50)  (cost=6295 rows=31240) (actual time=0.0358..7.39 rows=15000 loops=1)
            -> Covering index lookup on ref using IX_RESEARCH_GIANT_REF_GIANT_ID_INDEX_DATETIME_ASC (GIANT_ID=gi.GIANT_ID)  (cost=1.01 rows=3.45) (actual time=0.00249..0.00313 rows=3.37 loops=15000)

-- thinking
-- o Nested loopで使われるref側のインデックスがピンポイント複合インデックスになっているが...
-- o 最後にソートするって話は別に変わらないので、explainを見る限りそこでfilesortされているようには見えるが...
-- o actual time や cost は減ってるので、どこかしら何かしらで効果はあるということ
-- o うーむー、joinしながらソートできてるみたいな話なんだろうか？


