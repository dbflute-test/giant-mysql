#!/bin/bash

cd `dirname $0`

./mysql-5.6/bin/mysqladmin --defaults-file=./roku-my.cnf -u root shutdown -p
