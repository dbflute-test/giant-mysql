

-- 300件
select count(*)
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
 order by dfloc.INDEX_DATETIME asc



-- =======================================================================================
--                                                                         ID検索+日付ソート
--                                                                         ===============
explain
select *
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
 order by dfloc.INDEX_DATETIME asc
+----+-------------+-------+------------+------+------------------------+------------------------+---------+-------+------+----------+----------------+
| id | select_type | table | partitions | type | possible_keys          | key                    | key_len | ref   | rows | filtered | Extra          |
+----+-------------+-------+------------+------+------------------------+------------------------+---------+-------+------+----------+----------------+
|  1 | SIMPLE      | dfloc | NULL       | ref  | IX_GIANT_INDEX_INTEGER | IX_GIANT_INDEX_INTEGER | 4       | const |  300 |   100.00 | Using filesort |
+----+-------------+-------+------------+------+------------------------+------------------------+---------+-------+------+----------+----------------+
1 row in set, 1 warning (0.00 sec)

explain
select *
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
 order by dfloc.INDEX_DATETIME desc
+----+-------------+-------+------------+------+------------------------+------------------------+---------+-------+------+----------+----------------+
| id | select_type | table | partitions | type | possible_keys          | key                    | key_len | ref   | rows | filtered | Extra          |
+----+-------------+-------+------------+------+------------------------+------------------------+---------+-------+------+----------+----------------+
|  1 | SIMPLE      | dfloc | NULL       | ref  | IX_GIANT_INDEX_INTEGER | IX_GIANT_INDEX_INTEGER | 4       | const |  300 |   100.00 | Using filesort |
+----+-------------+-------+------------+------+------------------------+------------------------+---------+-------+------+----------+----------------+
1 row in set, 1 warning (0.00 sec)



create index IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC on GIANT (INDEX_INTEGER, INDEX_DATETIME) ;


explain
select *
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
 order by dfloc.INDEX_DATETIME asc
+----+-------------+-------+------------+------+------------------------------------------------------------------+-------------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                                                    | key                                       | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+------------------------------------------------------------------+-------------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | dfloc | NULL       | ref  | IX_GIANT_INDEX_INTEGER,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | 4       | const |  300 |   100.00 | NULL  |
+----+-------------+-------+------------+------+------------------------------------------------------------------+-------------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.00 sec)


explain
select *
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
 order by dfloc.INDEX_DATETIME desc
+----+-------------+-------+------------+------+------------------------------------------------------------------+-------------------------------------------+---------+-------+------+----------+---------------------+
| id | select_type | table | partitions | type | possible_keys                                                    | key                                       | key_len | ref   | rows | filtered | Extra               |
+----+-------------+-------+------------+------+------------------------------------------------------------------+-------------------------------------------+---------+-------+------+----------+---------------------+
|  1 | SIMPLE      | dfloc | NULL       | ref  | IX_GIANT_INDEX_INTEGER,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC | 4       | const |  300 |   100.00 | Backward index scan |
+----+-------------+-------+------------+------+------------------------------------------------------------------+-------------------------------------------+---------+-------+------+----------+---------------------+



create index IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC on GIANT (INDEX_INTEGER, INDEX_DATETIME desc) ;

drop index IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC on GIANT;



explain
select *
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
 order by dfloc.INDEX_DATETIME asc
+----+-------------+-------+------------+------+-------------------------------------------------------------------+------------------------+---------+-------+------+----------+----------------+
| id | select_type | table | partitions | type | possible_keys                                                     | key                    | key_len | ref   | rows | filtered | Extra          |
+----+-------------+-------+------------+------+-------------------------------------------------------------------+------------------------+---------+-------+------+----------+----------------+
|  1 | SIMPLE      | dfloc | NULL       | ref  | IX_GIANT_INDEX_INTEGER,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC | IX_GIANT_INDEX_INTEGER | 4       | const |  300 |   100.00 | Using filesort |
+----+-------------+-------+------------+------+-------------------------------------------------------------------+------------------------+---------+-------+------+----------+----------------+
1 row in set, 1 warning (0.00 sec)



explain
select *
  from GIANT dfloc
 where dfloc.INDEX_INTEGER = 1 
 order by dfloc.INDEX_DATETIME desc
+----+-------------+-------+------------+------+-------------------------------------------------------------------+--------------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                                                     | key                                        | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+-------------------------------------------------------------------+--------------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | dfloc | NULL       | ref  | IX_GIANT_INDEX_INTEGER,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC | IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC | 4       | const |  300 |   100.00 | NULL  |
+----+-------------+-------+------------+------+-------------------------------------------------------------------+--------------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.01 sec)





-- =======================================================================================
--                                                                           ID検索+日付範囲
--                                                                           =============
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

create index IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC on GIANT (INDEX_INTEGER, INDEX_DATETIME) ;

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

ascは戻す:
drop index IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_ASC on GIANT;



なんにせよ、降順INDEXでも範囲検索は大丈夫そう。


 