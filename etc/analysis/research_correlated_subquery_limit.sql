
select count(*)
  from GIANT gi
 where gi.INDEX_INTEGER < 10;
+----------+
| count(*) |
+----------+
|     3000 |
+----------+
1 row in set (0.00 sec)



explain
select gi.GIANT_ID
     , gi.INDEX_STRING
     , (select max(ref.NON_INDEX_INTEGER)
          from GIANT_REF ref
         where ref.GIANT_ID = gi.GIANT_ID
       ) as MAX_NON_INDEX_INTEGER
  from GIANT gi
 where INDEX_INTEGER < 10
 order by INDEX_DATETIME
 limit 1

+----+--------------------+-------+------------+-------+-------------------------------------------------------------------+----------------------------------------+---------+-----------------------+------+----------+-------------+
| id | select_type        | table | partitions | type  | possible_keys                                                     | key                                    | key_len | ref                   | rows | filtered | Extra       |
+----+--------------------+-------+------------+-------+-------------------------------------------------------------------+----------------------------------------+---------+-----------------------+------+----------+-------------+
|  1 | PRIMARY            | gi    | NULL       | index | IX_GIANT_INDEX_INTEGER,IX_GIANT_INDEX_INTEGER_INDEX_DATETIME_DESC | IX_GIANT_INDEX_DATETIME                | 5       | NULL                  |  965 |     0.10 | Using where |
|  2 | DEPENDENT SUBQUERY | ref   | NULL       | ref   | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER                            | IX_GIANT_REF_COMPOUND_GIANT_ID_INTEGER | 8       | maihamadb.gi.GIANT_ID |    3 |   100.00 | NULL        |
+----+--------------------+-------+------------+-------+-------------------------------------------------------------------+----------------------------------------+---------+-----------------------+------+----------+-------------+
2 rows in set, 2 warnings (0.05 sec)
+-------+------+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| Level | Code | Message                                                                                                                                                                                                                                                                                                                                                                                                                                              |
+-------+------+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| Note  | 1276 | Field or reference 'maihamadb.gi.GIANT_ID' of SELECT #2 was resolved in SELECT #1                                                                                                                                                                                                                                                                                                                                                                    |
| Note  | 1003 | /* select#1 */
select `maihamadb`.`gi`.`GIANT_ID` AS `GIANT_ID`,`maihamadb`.`gi`.`INDEX_STRING` AS `INDEX_STRING`
     , (/* select#2 */
       select max(`maihamadb`.`ref`.`NON_INDEX_INTEGER`)
         from `maihamadb`.`giant_ref` `ref`
        where (`maihamadb`.`ref`.`GIANT_ID` = `maihamadb`.`gi`.`GIANT_ID`)
       ) AS `MAX_NON_INDEX_INTEGER`
  from `maihamadb`.`giant` `gi`
 where (`maihamadb`.`gi`.`INDEX_INTEGER` < 10)
 order by `maihamadb`.`gi`.`INDEX_DATETIME`
 limit 1
 |
+-------+------+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
2 rows in set (0.00 sec)



explain
select mb.MEMBER_ID
     , mb.MEMBER_NAME
     , (select max(PURCHASE_ID)
          from PURCHASE pur
         where pur.MEMBER_ID = mb.MEMBER_ID
       ) as MAX_PURCHASE_ID
  from MEMBER mb
 order by mb.MEMBER_ID
 limit 1



