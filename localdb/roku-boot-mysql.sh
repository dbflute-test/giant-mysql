#!/bin/bash

cd `dirname $0`

# for MySQL-5.6
./mysql-5.6/bin/mysqld --defaults-file=./roku-my.cnf
