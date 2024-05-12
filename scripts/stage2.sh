# Preparation
hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc

password=$(head -n 1 secrets/.psql.pass)

# Creating Hive Tables
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team25 -p $password -f sql/db.hql > output/hive_results.txt

# EDA
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team25 -p $password -f sql/q1.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q1.csv

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team25 -p $password -f sql/q2.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q2.csv

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team25 -p $password -f sql/q3.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q3.csv

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team25 -p $password -f sql/q4.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q4.csv

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team25 -p $password -f sql/q5.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q5.csv

