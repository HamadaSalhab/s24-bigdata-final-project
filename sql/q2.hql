USE team25_projectdb;


DROP TABLE IF EXISTS q2_results;
CREATE EXTERNAL TABLE q2_results(
isbasiceconomy BOOLEAN,
isrefundable BOOLEAN, isnonstop BOOLEAN, basefare decimal(10,2))
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
location 'project/hive/warehouse/q2';

SET hive.resultset.use.unique.column.names = false;

INSERT INTO q2_results
SELECT isbasiceconomy, isrefundable, isnonstop, basefare from flights_opt;

SELECT * from q2_results limit 10;
