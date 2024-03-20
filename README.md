Giant for MySQL (dbflute-test)
=======================
test project for Giant tables on MySQL

# Quick Trial

0. prepare MySQL: put localdb/mysql and boot by script
1. fix isRealPerformance() of GiantMakingTest
2. execute GiantMakingTest@test_making_TSV()
3. execute ReplaceSchema

*ReplaceSchema
```java
// call manage.sh at giant-mysql/dbflute_maihamadb
// and select replace-schema in displayed menu
...:dbflute_maihamadb ...$ sh manage.sh
```

# Information
## License
Apache License 2.0
