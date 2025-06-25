
-- =======================================================================================
--                                                                         絞り込み+count()
--                                                                         ===============
-- ---------------------------------------------------------
--                                                   前提確認
--                                                   -------
-- 件数少なめ => 速い
select count(*)
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 50 
+----------+
| count(*) |
+----------+
|    50000 |
+----------+
1 row in set (0.03 sec)

-- 件数多め => 遅い
select count(*)
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 5000 
+----------+
| count(*) |
+----------+
|  5000000 |
+----------+
1 row in set (1.76 sec)

-- 件数多めでID指定 => 変わらず遅い
select count(ref.GIANT_REF_ID)
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 5000 
+-------------------------+
| count(ref.GIANT_REF_ID) |
+-------------------------+
|                 5000000 |
+-------------------------+
1 row in set (1.75 sec)



-- ---------------------------------------------------------
--                               ピンポイント複合インデックスなし
--                               ---------------------------
-- count(*) => INDEX_INTEGERのインデックスで、Using where; Using index
explain
select count(*)
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 5000
+----+-------------+-------+------------+-------+-------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                     | key                        | key_len | ref  | rows    | filtered | Extra                    |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER,IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | IX_GIANT_REF_INDEX_INTEGER | 4       | NULL | 4840209 |   100.00 | Using where; Using index |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
1 row in set, 1 warning (0.00 sec)
| -> Aggregate: count(0)  (cost=1.46e+6 rows=1) (actual time=1947..1947 rows=1 loops=1)
    -> Filter: (ref.INDEX_INTEGER < 5000)  (cost=973603 rows=4.84e+6) (actual time=0.0192..1839 rows=5e+6 loops=1)
        -> Covering index range scan on ref using IX_GIANT_REF_INDEX_INTEGER over (INDEX_INTEGER < 5000)  (cost=973603 rows=4.84e+6) (actual time=0.018..1631 rows=5e+6 loops=1)
 |


-- ID指定にしてみた => 何も変わらない
explain
select count(ref.GIANT_REF_ID)
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 5000
+----+-------------+-------+------------+-------+-------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                     | key                        | key_len | ref  | rows    | filtered | Extra                    |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER,IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | IX_GIANT_REF_INDEX_INTEGER | 4       | NULL | 4840209 |   100.00 | Using where; Using index |
+----+-------------+-------+------------+-------+-------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
1 row in set, 1 warning (0.00 sec)
| -> Aggregate: count(ref.GIANT_REF_ID)  (cost=1.46e+6 rows=1) (actual time=2004..2004 rows=1 loops=1)
    -> Filter: (ref.INDEX_INTEGER < 5000)  (cost=973601 rows=4.84e+6) (actual time=0.0392..1897 rows=5e+6 loops=1)
        -> Covering index range scan on ref using IX_GIANT_REF_INDEX_INTEGER over (INDEX_INTEGER < 5000)  (cost=973601 rows=4.84e+6) (actual time=0.0371..1675 rows=5e+6 loops=1)
 |



-- ---------------------------------------------------------
--                          ピンポイント複合インデックス貼ってみた
--                          --------------------------------
-- 絞り込みとcountのピンポイント複合インデックスを貼ってみる
create index IX_RESEARCH_GIANT_REF_INDEX_INTEGER_REF_ID_ASC on GIANT_REF (INDEX_INTEGER, GIANT_REF_ID)



-- count(*) => 複合インデックス使われない (そりゃそうか、カラム指定じゃないから)
explain
select count(*)
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 5000
+----+-------------+-------+------------+-------+------------------------------------------------------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                                                    | key                        | key_len | ref  | rows    | filtered | Extra                    |
+----+-------------+-------+------------+-------+------------------------------------------------------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER,IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER,IX_RESEARCH_GIANT_REF_INDEX_INTEGER_REF_ID_ASC | IX_GIANT_REF_INDEX_INTEGER | 4       | NULL | 4840209 |   100.00 | Using where; Using index |
+----+-------------+-------+------------+-------+------------------------------------------------------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
1 row in set, 1 warning (0.00 sec)
| -> Aggregate: count(0)  (cost=1.46e+6 rows=1) (actual time=2361..2361 rows=1 loops=1)
    -> Filter: (ref.INDEX_INTEGER < 5000)  (cost=975127 rows=4.84e+6) (actual time=0.0274..2255 rows=5e+6 loops=1)
        -> Covering index range scan on ref using IX_GIANT_REF_INDEX_INTEGER over (INDEX_INTEGER < 5000)  (cost=975127 rows=4.84e+6) (actual time=0.026..2048 rows=5e+6 loops=1)
 |


-- ID指定にしてみた => これでも複合インデックス使われない (ほうほう)
explain
select count(ref.GIANT_REF_ID)
  from GIANT_REF ref
 where ref.INDEX_INTEGER < 5000
+----+-------------+-------+------------+-------+------------------------------------------------------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
| id | select_type | table | partitions | type  | possible_keys                                                                                                    | key                        | key_len | ref  | rows    | filtered | Extra                    |
+----+-------------+-------+------------+-------+------------------------------------------------------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
|  1 | SIMPLE      | ref   | NULL       | range | IX_GIANT_REF_INDEX_INTEGER,IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER,IX_RESEARCH_GIANT_REF_INDEX_INTEGER_REF_ID_ASC | IX_GIANT_REF_INDEX_INTEGER | 4       | NULL | 4840209 |   100.00 | Using where; Using index |
+----+-------------+-------+------------+-------+------------------------------------------------------------------------------------------------------------------+----------------------------+---------+------+---------+----------+--------------------------+
1 row in set, 1 warning (0.01 sec)
| -> Aggregate: count(ref.GIANT_REF_ID)  (cost=1.46e+6 rows=1) (actual time=1819..1819 rows=1 loops=1)
    -> Filter: (ref.INDEX_INTEGER < 5000)  (cost=973347 rows=4.84e+6) (actual time=0.0182..1714 rows=5e+6 loops=1)
        -> Covering index range scan on ref using IX_GIANT_REF_INDEX_INTEGER over (INDEX_INTEGER < 5000)  (cost=973347 rows=4.84e+6) (actual time=0.0172..1497 rows=5e+6 loops=1)
 |


　↓↓↓

じゃあもう速くしようがない？


