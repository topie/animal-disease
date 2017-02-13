#!/usr/bin/env bash
mysql -uroot -proot1234 -e "drop database if exists animal_disease;"
mysql -uroot -proot1234 -e "create database animal_disease DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;"
redis-cli -a 123456 keys "*" | grep topie_animal_disease_ | xargs redis-cli -a 123456 del
