
-- _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
-- 
-- ページングのorder byにおけるINDEX
-- 
-- _/_/_/_/
-- GIANT :: 300万件
-- GIANT_REF :: 1000万件


-- =======================================================================================
--                                                                  相関サブクエリのページング
--                                                                  ======================
-- _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
-- ソートありページングでselect句の相関サブクエリがある場合、
-- order byのカラムにINDEXが貼られていないと、取得しないレコードでも相関処理が実行されてしまう。
--
-- 相関サブクエリの導出カラムでソートしているわけではないのに！って感じだけど、
-- where対象のレコード全部のselect句を確定させてからソート処理が実行されるイメージ？
-- _/_/_/_/_/_/_/_/_/_/
select dfloc.GIANT_ID, dfrel_5.GIANT_SIDE_ID
     , (select count(sub1loc.GIANT_REF_ID)
          from GIANT_REF sub1loc 
         where sub1loc.GIANT_ID = dfloc.GIANT_ID
       ) as REF_COUNT_ALL
     , (select count(sub1loc.GIANT_ID)
          from GIANT sub1loc 
         where sub1loc.SELF_PARENT_ID = dfloc.GIANT_ID
       ) as SELF_COUNT_ALL
  from GIANT dfloc
    left outer join GIANT_SIDE dfrel_5 on dfloc.GIANT_ID = dfrel_5.GIANT_ID
 order by dfloc.NON_INDEX_DATE -- point
 limit 20
20 rows in set (0.93 sec)
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+---------+----------+----------------+
| id | select_type        | table   | partitions | type   | possible_keys                                    | key                                    | key_len | ref                      | rows    | filtered | Extra          |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+---------+----------+----------------+
|  1 | PRIMARY            | dfloc   | NULL       | ALL    | NULL                                             | NULL                                   | NULL    | NULL                     | 2899389 |   100.00 | Using filesort |
|  1 | PRIMARY            | dfrel_5 | NULL       | eq_ref | GIANT_ID,IX_GIANT_SIDE_COMPOUND_GIANT_ID_INTEGER | GIANT_ID                               | 8       | maihamadb.dfloc.GIANT_ID |       1 |   100.00 | Using index    |
|  3 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | FK_GIANT_SELF                                    | FK_GIANT_SELF                          | 9       | maihamadb.dfloc.GIANT_ID |      94 |   100.00 | Using index    |
|  2 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER           | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 8       | maihamadb.dfloc.GIANT_ID |       3 |   100.00 | Using index    |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+---------+----------+----------------+
4 rows in set, 3 warnings (0.00 sec)


-- _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
-- order byのカラムにINDEXが貼ってあれば、そのINDEXでlimit対象を先に絞ってくれるようなので、
-- 相関サブクエリの処理対象レコードが最低限になって速くなる。(descにしても大丈夫: 検証済)
-- _/_/_/_/_/_/_/_/_/_/
-- 1ページ目の20件だけが処理対象になってる
select dfloc.GIANT_ID, dfrel_5.GIANT_SIDE_ID
     , (select count(sub1loc.GIANT_REF_ID)
          from GIANT_REF sub1loc 
         where sub1loc.GIANT_ID = dfloc.GIANT_ID
       ) as REF_COUNT_ALL
     , (select count(sub1loc.GIANT_ID)
          from GIANT sub1loc 
         where sub1loc.SELF_PARENT_ID = dfloc.GIANT_ID
       ) as SELF_COUNT_ALL
  from GIANT dfloc
    left outer join GIANT_SIDE dfrel_5 on dfloc.GIANT_ID = dfrel_5.GIANT_ID
 order by dfloc.INDEX_DATE -- point
 limit 20
20 rows in set (0.00 sec)
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+------+----------+-------------+
| id | select_type        | table   | partitions | type   | possible_keys                                    | key                                    | key_len | ref                      | rows | filtered | Extra       |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+------+----------+-------------+
|  1 | PRIMARY            | dfloc   | NULL       | index  | NULL                                             | IX_GIANT_INDEX_DATE                    | 3       | NULL                     |   20 |   100.00 | Using index |
|  1 | PRIMARY            | dfrel_5 | NULL       | eq_ref | GIANT_ID,IX_GIANT_SIDE_COMPOUND_GIANT_ID_INTEGER | GIANT_ID                               | 8       | maihamadb.dfloc.GIANT_ID |    1 |   100.00 | Using index |
|  3 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | FK_GIANT_SELF                                    | FK_GIANT_SELF                          | 9       | maihamadb.dfloc.GIANT_ID |   94 |   100.00 | Using index |
|  2 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER           | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 8       | maihamadb.dfloc.GIANT_ID |    3 |   100.00 | Using index |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+------+----------+-------------+
4 rows in set, 3 warnings (0.01 sec)

-- 5ページ目だと100件対象にはなるけど
select dfloc.GIANT_ID, dfrel_5.GIANT_SIDE_ID
     , (select count(sub1loc.GIANT_REF_ID)
          from GIANT_REF sub1loc 
         where sub1loc.GIANT_ID = dfloc.GIANT_ID
       ) as REF_COUNT_ALL
     , (select count(sub1loc.GIANT_ID)
          from GIANT sub1loc 
         where sub1loc.SELF_PARENT_ID = dfloc.GIANT_ID
       ) as SELF_COUNT_ALL
  from GIANT dfloc
    left outer join GIANT_SIDE dfrel_5 on dfloc.GIANT_ID = dfrel_5.GIANT_ID
 order by dfloc.INDEX_DATE -- point
 limit 80, 20
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+------+----------+-------------+
| id | select_type        | table   | partitions | type   | possible_keys                                    | key                                    | key_len | ref                      | rows | filtered | Extra       |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+------+----------+-------------+
|  1 | PRIMARY            | dfloc   | NULL       | index  | NULL                                             | IX_GIANT_INDEX_DATE                    | 3       | NULL                     |  100 |   100.00 | Using index |
|  1 | PRIMARY            | dfrel_5 | NULL       | eq_ref | GIANT_ID,IX_GIANT_SIDE_COMPOUND_GIANT_ID_INTEGER | GIANT_ID                               | 8       | maihamadb.dfloc.GIANT_ID |    1 |   100.00 | Using index |
|  3 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | FK_GIANT_SELF                                    | FK_GIANT_SELF                          | 9       | maihamadb.dfloc.GIANT_ID |   94 |   100.00 | Using index |
|  2 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER           | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 8       | maihamadb.dfloc.GIANT_ID |    3 |   100.00 | Using index |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+------+----------+-------------+
4 rows in set, 3 warnings (0.00 sec)


-- _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
-- だがしかし、第二ソートキーにINDEXのないカラムを入れると...
-- 第二ソートキーがINDEXあろうがなかろうがダメだ
-- _/_/_/_/_/_/_/_/_/_/
select dfloc.GIANT_ID, dfrel_5.GIANT_SIDE_ID
     , (select count(sub1loc.GIANT_REF_ID)
          from GIANT_REF sub1loc 
         where sub1loc.GIANT_ID = dfloc.GIANT_ID
       ) as REF_COUNT_ALL
     , (select count(sub1loc.GIANT_ID)
          from GIANT sub1loc 
         where sub1loc.SELF_PARENT_ID = dfloc.GIANT_ID
       ) as SELF_COUNT_ALL
  from GIANT dfloc
    left outer join GIANT_SIDE dfrel_5 on dfloc.GIANT_ID = dfrel_5.GIANT_ID
 order by dfloc.INDEX_DATE, dfloc.NON_INDEX_INTEGER -- point
 limit 20
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+---------+----------+----------------+
| id | select_type        | table   | partitions | type   | possible_keys                                    | key                                    | key_len | ref                      | rows    | filtered | Extra          |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+---------+----------+----------------+
|  1 | PRIMARY            | dfloc   | NULL       | ALL    | NULL                                             | NULL                                   | NULL    | NULL                     | 2899389 |   100.00 | Using filesort |
|  1 | PRIMARY            | dfrel_5 | NULL       | eq_ref | GIANT_ID,IX_GIANT_SIDE_COMPOUND_GIANT_ID_INTEGER | GIANT_ID                               | 8       | maihamadb.dfloc.GIANT_ID |       1 |   100.00 | Using index    |
|  3 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | FK_GIANT_SELF                                    | FK_GIANT_SELF                          | 9       | maihamadb.dfloc.GIANT_ID |      94 |   100.00 | Using index    |
|  2 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER           | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 8       | maihamadb.dfloc.GIANT_ID |       3 |   100.00 | Using index    |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+---------+----------+----------------+
4 rows in set, 3 warnings (0.00 sec)

select dfloc.GIANT_ID, dfrel_5.GIANT_SIDE_ID
     , (select count(sub1loc.GIANT_REF_ID)
          from GIANT_REF sub1loc 
         where sub1loc.GIANT_ID = dfloc.GIANT_ID
       ) as REF_COUNT_ALL
     , (select count(sub1loc.GIANT_ID)
          from GIANT sub1loc 
         where sub1loc.SELF_PARENT_ID = dfloc.GIANT_ID
       ) as SELF_COUNT_ALL
  from GIANT dfloc
    left outer join GIANT_SIDE dfrel_5 on dfloc.GIANT_ID = dfrel_5.GIANT_ID
 order by dfloc.INDEX_DATE, dfloc.INDEX_INTEGER -- point
 limit 20
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+---------+----------+----------------+
| id | select_type        | table   | partitions | type   | possible_keys                                    | key                                    | key_len | ref                      | rows    | filtered | Extra          |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+---------+----------+----------------+
|  1 | PRIMARY            | dfloc   | NULL       | ALL    | NULL                                             | NULL                                   | NULL    | NULL                     | 2899389 |   100.00 | Using filesort |
|  1 | PRIMARY            | dfrel_5 | NULL       | eq_ref | GIANT_ID,IX_GIANT_SIDE_COMPOUND_GIANT_ID_INTEGER | GIANT_ID                               | 8       | maihamadb.dfloc.GIANT_ID |       1 |   100.00 | Using index    |
|  3 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | FK_GIANT_SELF                                    | FK_GIANT_SELF                          | 9       | maihamadb.dfloc.GIANT_ID |      94 |   100.00 | Using index    |
|  2 | DEPENDENT SUBQUERY | sub1loc | NULL       | ref    | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER           | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 8       | maihamadb.dfloc.GIANT_ID |       3 |   100.00 | Using index    |
+----+--------------------+---------+------------+--------+--------------------------------------------------+----------------------------------------+---------+--------------------------+---------+----------+----------------+
4 rows in set, 3 warnings (0.03 sec)



-- _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
-- 第二ソートキーまで複合INDEXでつながってる場合は？
--  => 速い
-- _/_/_/_/_/_/_/_/_/_/
-- まず単一ソートのケースを GIANT_ID で (FKカラムとしてINDEXあり)
select ref.GIANT_ID, ref.NON_INDEX_STRING
     , (select count(self.GIANT_REF_ID)
          from GIANT_REF self 
         where self.GIANT_REF_ID = ref.SELF_PARENT_ID
       ) as SELF_COUNT_ALL
  from GIANT_REF ref
 order by ref.GIANT_ID
 limit 20
+----+--------------------+-------+------------+--------+---------------+----------------------------------------+---------+------------------------------+------+----------+-------------+
| id | select_type        | table | partitions | type   | possible_keys | key                                    | key_len | ref                          | rows | filtered | Extra       |
+----+--------------------+-------+------------+--------+---------------+----------------------------------------+---------+------------------------------+------+----------+-------------+
|  1 | PRIMARY            | ref   | NULL       | index  | NULL          | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 12      | NULL                         |   20 |   100.00 | NULL        |
|  2 | DEPENDENT SUBQUERY | self  | NULL       | eq_ref | PRIMARY       | PRIMARY                                | 8       | maihamadb.ref.SELF_PARENT_ID |    1 |   100.00 | Using index |
+----+--------------------+-------+------------+--------+---------------+----------------------------------------+---------+------------------------------+------+----------+-------------+
2 rows in set, 2 warnings (0.00 sec)

-- 第二ソートキーありだけど INDEX は互いに独立
select ref.GIANT_ID, ref.NON_INDEX_STRING
     , (select count(self.GIANT_REF_ID)
          from GIANT_REF self 
         where self.GIANT_REF_ID = ref.SELF_PARENT_ID
       ) as SELF_COUNT_ALL
  from GIANT_REF ref
 order by ref.GIANT_ID, ref.INDEX_DATE
 limit 20
+----+--------------------+-------+------------+--------+---------------+---------+---------+------------------------------+---------+----------+----------------+
| id | select_type        | table | partitions | type   | possible_keys | key     | key_len | ref                          | rows    | filtered | Extra          |
+----+--------------------+-------+------------+--------+---------------+---------+---------+------------------------------+---------+----------+----------------+
|  1 | PRIMARY            | ref   | NULL       | ALL    | NULL          | NULL    | NULL    | NULL                         | 9894150 |   100.00 | Using filesort |
|  2 | DEPENDENT SUBQUERY | self  | NULL       | eq_ref | PRIMARY       | PRIMARY | 8       | maihamadb.ref.SELF_PARENT_ID |       1 |   100.00 | Using index    |
+----+--------------------+-------+------------+--------+---------------+---------+---------+------------------------------+---------+----------+----------------+
2 rows in set, 2 warnings (0.00 sec)

-- 第一ソートキーと第二ソートキーで複合INDEXだったら
select ref.GIANT_ID, ref.NON_INDEX_STRING
     , (select count(self.GIANT_REF_ID)
          from GIANT_REF self 
         where self.GIANT_REF_ID = ref.SELF_PARENT_ID
       ) as SELF_COUNT_ALL
  from GIANT_REF ref
 order by ref.GIANT_ID, ref.INDEX_INTEGER
 limit 20
+----+--------------------+-------+------------+--------+---------------+----------------------------------------+---------+------------------------------+------+----------+-------------+
| id | select_type        | table | partitions | type   | possible_keys | key                                    | key_len | ref                          | rows | filtered | Extra       |
+----+--------------------+-------+------------+--------+---------------+----------------------------------------+---------+------------------------------+------+----------+-------------+
|  1 | PRIMARY            | ref   | NULL       | index  | NULL          | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 12      | NULL                         |   20 |   100.00 | NULL        |
|  2 | DEPENDENT SUBQUERY | self  | NULL       | eq_ref | PRIMARY       | PRIMARY                                | 8       | maihamadb.ref.SELF_PARENT_ID |    1 |   100.00 | Using index |
+----+--------------------+-------+------------+--------+---------------+----------------------------------------+---------+------------------------------+------+----------+-------------+
2 rows in set, 2 warnings (0.01 sec)

-- 第三ソートキーにPKを追加したら...大丈夫だった
select ref.GIANT_ID, ref.NON_INDEX_STRING
     , (select count(self.GIANT_REF_ID)
          from GIANT_REF self 
         where self.GIANT_REF_ID = ref.SELF_PARENT_ID
       ) as SELF_COUNT_ALL
  from GIANT_REF ref
 order by ref.GIANT_ID, ref.INDEX_INTEGER, ref.GIANT_REF_ID
 limit 20
+----+--------------------+-------+------------+--------+---------------+----------------------------------------+---------+------------------------------+------+----------+-------------+
| id | select_type        | table | partitions | type   | possible_keys | key                                    | key_len | ref                          | rows | filtered | Extra       |
+----+--------------------+-------+------------+--------+---------------+----------------------------------------+---------+------------------------------+------+----------+-------------+
|  1 | PRIMARY            | ref   | NULL       | index  | NULL          | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 12      | NULL                         |   20 |   100.00 | NULL        |
|  2 | DEPENDENT SUBQUERY | self  | NULL       | eq_ref | PRIMARY       | PRIMARY                                | 8       | maihamadb.ref.SELF_PARENT_ID |    1 |   100.00 | Using index |
+----+--------------------+-------+------------+--------+---------------+----------------------------------------+---------+------------------------------+------+----------+-------------+
2 rows in set, 2 warnings (0.00 sec)

-- 第三ソートキーにがPK以外だとダメだった (単一ユニークカラムでもダメ)
select ref.GIANT_ID, ref.NON_INDEX_STRING
     , (select count(self.GIANT_REF_ID)
          from GIANT_REF self 
         where self.GIANT_REF_ID = ref.SELF_PARENT_ID
       ) as SELF_COUNT_ALL
  from GIANT_REF ref
 order by ref.GIANT_ID, ref.INDEX_INTEGER, ref.UNIQUE_STRING
 limit 20
+----+--------------------+-------+------------+--------+---------------+---------+---------+------------------------------+---------+----------+----------------+
| id | select_type        | table | partitions | type   | possible_keys | key     | key_len | ref                          | rows    | filtered | Extra          |
+----+--------------------+-------+------------+--------+---------------+---------+---------+------------------------------+---------+----------+----------------+
|  1 | PRIMARY            | ref   | NULL       | ALL    | NULL          | NULL    | NULL    | NULL                         | 9894150 |   100.00 | Using filesort |
|  2 | DEPENDENT SUBQUERY | self  | NULL       | eq_ref | PRIMARY       | PRIMARY | 8       | maihamadb.ref.SELF_PARENT_ID |       1 |   100.00 | Using index    |
+----+--------------------+-------+------------+--------+---------------+---------+---------+------------------------------+---------+----------+----------------+
2 rows in set, 2 warnings (0.00 sec)



-- =======================================================================================
--                                                                       シンプルなページング
--                                                                       =================
-- _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
-- select句の相関サブクエリがあろうがなかろうが、ページングのソートキーには(複合)INDEXがあった方が良いかな？
--  => 良い
-- _/_/_/_/_/_/_/_/_/_/
-- 二つのソートキーで独立INDEX
select ref.GIANT_ID, ref.NON_INDEX_STRING
  from GIANT_REF ref
 order by ref.GIANT_ID, ref.INDEX_DATE
 limit 20
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+----------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows    | filtered | Extra          |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+----------------+
|  1 | SIMPLE      | ref   | NULL       | ALL  | NULL          | NULL | NULL    | NULL | 9894150 |   100.00 | Using filesort |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+----------------+
1 row in set, 1 warning (0.01 sec)

-- 二つのソートキーで複合INDEX
select ref.GIANT_ID, ref.NON_INDEX_STRING
  from GIANT_REF ref
 order by ref.GIANT_ID, ref.INDEX_INTEGER
 limit 20
+----+-------------+-------+------------+-------+---------------+----------------------------------------+---------+------+------+----------+-------+
| id | select_type | table | partitions | type  | possible_keys | key                                    | key_len | ref  | rows | filtered | Extra |
+----+-------------+-------+------------+-------+---------------+----------------------------------------+---------+------+------+----------+-------+
|  1 | SIMPLE      | ref   | NULL       | index | NULL          | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 12      | NULL |   20 |   100.00 | NULL  |
+----+-------------+-------+------------+-------+---------------+----------------------------------------+---------+------+------+----------+-------+
1 row in set, 1 warning (0.00 sec)

 