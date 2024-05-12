USE team25_projectdb;

DROP TABLE IF EXISTS q5_results;
CREATE EXTERNAL TABLE q5_results(
flightdate DATE,
basefare decimal(10,2))
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
location 'project/hive/warehouse/q5';

SET hive.resultset.use.unique.column.names = false;

INSERT INTO q5_results
SELECT flightDate, basefare from flights_opt;

SELECT * from q5_results limit 10;
