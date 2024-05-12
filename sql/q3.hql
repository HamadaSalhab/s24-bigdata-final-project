USE team25_projectdb;

-- Drop the results table if it exists
DROP TABLE IF EXISTS q3_results;

-- Create a new external table to store the results
CREATE EXTERNAL TABLE q3_results(
    elapseddays INT,
    isnonstop BOOLEAN
)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q3';

-- Configure Hive to use non-unique column names in result set
SET hive.resultset.use.unique.column.names = false;

-- Insert data into the results table
INSERT INTO q3_results
SELECT elapseddays, isnonstop FROM flights_opt WHERE elapseddays is not null and isnonstop is not null;

-- Retrieve the first 10 entries from the results table to check
SELECT * FROM q3_results LIMIT 10;

