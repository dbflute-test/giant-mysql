#!/bin/bash

cd `dirname $0`

./mysql-5.6/bin/mysql --defaults-file=./roku-my.cnf --user=root --default-character-set=utf8
