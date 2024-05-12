-- Drop the database if exists
DROP DATABASE IF EXISTS team25_projectdb CASCADE;

-- Create Database
CREATE DATABASE team25_projectdb LOCATION "project/hive/warehouse";

-- Access
USE team25_projectdb;


SET hive.exec.dynamic.partition = true;
SET hive.exec.dynamic.partition.mode = nonstrict;
SET hive.enforce.bucketing = true;

-- Create Table
CREATE EXTERNAL TABLE flights
STORED AS AVRO
LOCATION 'project/warehouse/flights'
TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/flights.avsc');


-- Create Optimized Table
CREATE EXTERNAL TABLE flights_opt(
    legid STRING,
    searchdate DATE,
    flightdate DATE,
    destinationairport STRING,
    farebasiscode STRING,
    travelduration STRING,
    elapseddays INT,
    isbasiceconomy BOOLEAN,
    isrefundable BOOLEAN,
    isnonstop BOOLEAN,
    basefare DECIMAL(10,2),
    totalfare DECIMAL(10,2),
    seatsremaining INT,
    totaltraveldistance STRING,
    segmentsdeparturetimeepochseconds STRING,
    segmentsdeparturetimeraw STRING,
    segmentsarrivaltimeepochseconds STRING,
    segmentsarrivaltimeraw STRING,
    segmentsarrivalairportcode STRING,
    segmentsdepartureairportcode STRING,
    segmentsairlinename STRING,
    segmentsairlinecode STRING,
    segmentsequipmentdescription STRING,
    segmentsdurationinseconds STRING,
    segmentsdistance STRING,
    segmentscabincode STRING
)
PARTITIONED BY (startingairport STRING)
CLUSTERED BY (legid)
INTO 10 BUCKETS;


-- Filling the Optimized Table
INSERT INTO flights_opt
SELECT legId, to_date(from_unixtime(cast(searchDate/1000 as bigint) )), to_date(from_unixtime(cast(flightDate/1000 as bigint) )), destinationAirport, fareBasisCode, travelDuration, elapsedDays, isBasicEconomy, 
isRefundable, isNonStop, baseFare, totalFare, 
seatsRemaining, totalTravelDistance, 
segmentsDepartureTimeEpochSeconds, segmentsDepartureTimeRaw, 
segmentsArrivalTimeEpochSeconds, segmentsArrivalTimeRaw, 
segmentsArrivalAirportCode, segmentsDepartureAirportCode, 
segmentsAirlineName, segmentsAirlineCode, segmentsEquipmentDescription,
 segmentsDurationInSeconds, segmentsDistance, segmentsCabinCode, startingairport
FROM flights;



-- Check
SELECT * FROM flights LIMIT 10;
SELECT * FROM flights_opt LIMIT 10;

-- Delete the unpartitioned table
DROP TABLE flights;
