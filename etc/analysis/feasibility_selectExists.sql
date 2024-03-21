
-- _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
-- 
-- あるかどうか？だけを知りたい場合はcount(*)の代わりに何か速い手段ないか？
-- 
-- _/_/_/_/
-- GIANT :: 300万件
-- GIANT_REF :: 1000万件

-- =======================================================================================
--                                                                              Simple SQL
--                                                                              ==========
-- _/_/_/_/_/_/_/_/_/_/_/_/
-- count way
-- _/_/_/_/
-- case existing: GIANT
select count(*)
  from GIANT gi
 where gi.NON_INDEX_DATE <= '2001-01-01'
+----------+
| count(*) |
+----------+
|    15109 |
+----------+
1 row in set (1.13 sec)
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows    | filtered | Extra       |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
|  1 | SIMPLE      | gi    | NULL       | ALL  | NULL          | NULL | NULL    | NULL | 2899389 |    33.33 | Using where |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
1 row in set, 1 warning (0.02 sec)

-- case existing: GIANT_REF
select count(*)
  from GIANT_REF ref
 where ref.NON_INDEX_DATE <= '2001-01-01'
+----------+
| count(*) |
+----------+
|    50152 |
+----------+
1 row in set (3.71 sec)
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows    | filtered | Extra       |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
|  1 | SIMPLE      | ref   | NULL       | ALL  | NULL          | NULL | NULL    | NULL | 9894150 |    33.33 | Using where |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
1 row in set, 1 warning (0.01 sec)

-- case non-existing: GIANT_REF
select count(*)
  from GIANT_REF ref
 where ref.NON_INDEX_DATE <= '0001-01-01'
+----------+
| count(*) |
+----------+
|        0 |
+----------+
1 row in set (3.90 sec)
-- => 存在しない場合も変わらず遅い


-- _/_/_/_/_/_/_/_/_/_/_/_/
-- limit 1 way
-- _/_/_/_/
-- case existing: GIANT
select 'dummy'
  from GIANT gi
 where gi.NON_INDEX_DATE <= '2001-01-01'
 limit 1
+-------+
| dummy |
+-------+
| dummy |
+-------+
1 row in set (0.00 sec)
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows    | filtered | Extra       |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
|  1 | SIMPLE      | gi    | NULL       | ALL  | NULL          | NULL | NULL    | NULL | 2899389 |    33.33 | Using where |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
1 row in set, 1 warning (0.00 sec)

-- case existing: GIANT_REF
select 'dummy'
  from GIANT_REF ref
 where ref.NON_INDEX_DATE <= '2001-01-01'
 limit 1
+-------+
| dummy |
+-------+
| dummy |
+-------+
1 row in set (0.01 sec)
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows    | filtered | Extra       |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
|  1 | SIMPLE      | ref   | NULL       | ALL  | NULL          | NULL | NULL    | NULL | 9894150 |    33.33 | Using where |
+----+-------------+-------+------------+------+---------------+------+---------+------+---------+----------+-------------+
1 row in set, 1 warning (0.00 sec)

-- case non-existing: GIANT_REF
select 'dummy'
  from GIANT_REF ref
 where ref.NON_INDEX_DATE <= '0001-01-01'
 limit 1
Empty set (3.56 sec)
-- => 存在しない場合はcount(*)と同じくらい遅い



-- =======================================================================================
--                                                                               Union SQL
--                                                                               =========
-- _/_/_/_/_/_/_/_/_/_/_/_/
-- まず件数を確認
-- _/_/_/_/
-- NON_INDEX_DATE
select count(*)
  from GIANT gi
 where gi.NON_INDEX_DATE <= '2001-01-01'
+----------+
| count(*) |
+----------+
|    15109 |
+----------+
1 row in set (0.57 sec)

-- NON_INDEX_INTEGER
select count(*)
  from GIANT gi
 where gi.NON_INDEX_INTEGER <= 1000
+----------+
| count(*) |
+----------+
|   300300 |
+----------+
1 row in set (0.57 sec)


-- _/_/_/_/_/_/_/_/_/_/_/_/
-- count(*) で union
-- _/_/_/_/
-- case existing: GIANT
-- count(*)の場合は正確に件数を出さないといけないから、内側クエリーは select * で
select count(*) from (
 select *
   from GIANT gi
  where gi.NON_INDEX_DATE <= '2001-01-01'
  union
 select *
   from GIANT gi
  where gi.NON_INDEX_INTEGER <= 1000
) base
+----------+
| count(*) |
+----------+
|   313899 |
+----------+
1 row in set (5.53 sec)

-- case non-existing: GIANT
select count(*) from (
 select *
   from GIANT gi
  where gi.NON_INDEX_DATE <= '0001-01-01'
  union
 select *
   from GIANT gi
  where gi.NON_INDEX_INTEGER <= -1
) base
+----------+
| count(*) |
+----------+
|        0 |
+----------+
1 row in set (3.94 sec)
-- => 存在しない場合はちょこっとだけ速いけど、でも十分遅い


-- _/_/_/_/_/_/_/_/_/_/_/_/
-- limit 1 で union
-- _/_/_/_/
-- case existing: GIANT
-- 1件あるかないかだけで良いのでselect句は 'dummy' でOK
-- 論理的にはlimitも不要に見えるが実際に外すと1sec掛かってしまう
-- (limitによって大量の'dummy'レコードの重複削除処理が省略されるのかも)
select 'dummy'
  from GIANT gi
 where gi.NON_INDEX_DATE <= '2001-01-01'
 union
select 'dummy'
  from GIANT gi
 where gi.NON_INDEX_INTEGER <= 1000
 limit 1
+-------+
| dummy |
+-------+
| dummy |
+-------+
1 row in set (0.01 sec)

-- case non-existing: GIANT
select 'dummy'
  from GIANT gi
 where gi.NON_INDEX_DATE <= '0001-01-01'
 union
select 'dummy'
  from GIANT gi
 where gi.NON_INDEX_INTEGER <= -1
 limit 1
Empty set (1.09 sec)
-- => 存在しない場合はちょい遅いけど、count(*)よりは速い
