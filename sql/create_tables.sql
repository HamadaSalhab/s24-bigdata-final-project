START TRANSACTION;
DROP TABLE flights;
CREATE TABLE flights (
	legId VARCHAR(50),
	searchDate date,
	flightDate date,
	startingAirport VARCHAR(3),
	destinationAirport VARCHAR(3),
	fareBasisCode VARCHAR(8),
	travelDuration VARCHAR(10),
	elapsedDays INTEGER,
	isBasicEconomy BOOLEAN,
	isRefundable BOOLEAN,
	isNonStop BOOLEAN,
	baseFare decimal(10,2),
	totalFare decimal(10,2),
	seatsRemaining INTEGER,
	totalTravelDistance VARCHAR,
	segmentsDepartureTimeEpochSeconds VARCHAR,
	segmentsDepartureTimeRaw VARCHAR,
	segmentsArrivalTimeEpochSeconds VARCHAR,
	segmentsArrivalTimeRaw VARCHAR,
	segmentsArrivalAirportCode VARCHAR,
	segmentsDepartureAirportCode VARCHAR,
	segmentsAirlineName VARCHAR,
	segmentsAirlineCode VARCHAR,
	segmentsEquipmentDescription VARCHAR,
	segmentsDurationInSeconds VARCHAR,
	segmentsDistance VARCHAR,
	segmentsCabinCode VARCHAR
);
ALTER DATABASE team25_projectdb SET datestyle to iso, ymd;

COMMIT;
