USE team25_projectdb;


DROP TABLE IF EXISTS q4_results;
CREATE EXTERNAL TABLE q4_results(
startingAirport STRING,
destinationAirport STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
location 'project/hive/warehouse/q4';

SET hive.resultset.use.unique.column.names = false;

INSERT INTO q4_results
SELECT startingAirport, destinationAirport from flights_opt;

SELECT * from q4_results limit 10;
