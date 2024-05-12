USE team25_projectdb;

-- Drop the results table if it exists
DROP TABLE IF EXISTS q1_results;

-- Create a new external table to store the results
CREATE EXTERNAL TABLE q1_results(
    seatsremaining INT,
    basefare DECIMAL(10,2)
)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q1';

-- Configure Hive to use non-unique column names in result set
SET hive.resultset.use.unique.column.names = false;

-- Insert data into the results table
INSERT INTO q1_results
SELECT seatsremaining, basefare FROM flights_opt;

-- Retrieve the first 10 entries from the results table to check
SELECT * FROM q1_results LIMIT 10;

