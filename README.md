Giant for MySQL (dbflute-test)
=======================
test project for Giant tables on MySQL

# Giant tables

- GIANT table :: 3000000 records
- GIANT_REF table :: 10000000 records
- GIANT_SIDE table :: 3000000 records

```
           +-------+ 1
  3000000  | GIANT |------T     1 +------------+
           +-------+      L-------| GIANT_SIDE |
            1 |                   +------------+
              |                       3000000
         0..* |
           +-----------+
 10000000  | GIANT_REF |
           +-----------+
```


# Quick Trial

0. import the project on your IDE by Maven
1. prepare MySQL: put localdb/mysql and boot by script
2. fix isRealPerformance() of GiantMakingTest.java
3. execute GiantMakingTest@test_making_TSV()
4. execute ReplaceSchema


## 1. prepare MySQL: put localdb/mysql and boot by script
Download the MySQL "Compressed TAR Archive" version.  
And decompress it and locate it to the localdb directory.

```
localdb
 |-mysql // here
 | | -bin
 | | -data
 | | -...
 |
 |-boot-mysql.sh
 |-close-mysql.sh
 |-...
 |-my.cnf
```

The supported MySQL version is 5.7.x or 8.0.x for now.  
(8.3.x may not work by my.cnf, researching now)

And boot the MySQL by the "boot-mysql.sh" or "boot-mysql.bat".  
(the MySQL port is 53376, defined at my.cnf)


## 2. fix isRealPerformance() of GiantMakingTest.java
The test making TSV is very big cost so suppress it as default.  
So change mode as "Real Performance" by isRealPerformance() method.

```
protected boolean isRealPerformance() {
    return false; // temporarily change it if performance
}

 |||
 vvv (change it)

protected boolean isRealPerformance() {
    return true; // temporarily change it if performance
}
```


## 3. execute GiantMakingTest@test_making_TSV()
Execute the unit test and the giant TSV files will be made.

```
public void test_making_TSV() throws Exception {
    final int basePointCount = filterRecordCount(300);
    final int refCount = filterRecordCount(1000); // as one-to-many
    ...
```

The TSV files are output at the following directory:  
(which is ReplaceSchema data directory)

```
dbflute_maihamadb
 |-dfprop
 |-...
 |-playsql
 |  |-data
 |  |  |-common
 |  |  |-ut
 |  |    |-reversexls
 |  |    |-tsv
 |  |    |  |-UTF-8
 |  |    |     |-92-GIANT.tsv      // here
 |  |    |     |-93-GIANT_REF.tsv  // here
 |  |    |     |-94-GIANT_SIDE.tsv // here
 |  |    |     |-loadingControlMap.dataprop
 |  |-...
```


## 4. execute ReplaceSchema
Execute the ReplaceSchema of DBFlute.  
And the TSV files will be registered to MySQL.

```java
// call manage.sh at giant-mysql/dbflute_maihamadb
// and select replace-schema in displayed menu
...:dbflute_maihamadb ...$ sh manage.sh
```


# Information
## License
Apache License 2.0
