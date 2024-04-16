#!/bin/bash
URL="https://drive.google.com/file/d/1pXFQnhYiHf9hz_hivyqb6qEjWXhGRyVO/view?usp=sharing"

# Get the full path of the current script
SCRIPT_PATH=$(readlink -f "$0")

# Extract the directory path up to the project root
PROJECT_ROOT="$(dirname "$(dirname "$SCRIPT_PATH")")"

DATA_DIR="${PROJECT_ROOT}/data"

echo "Project root is set to: $PROJECT_ROOT"

if [ -e "$DATA_DIR/flight_prices.csv" ]
then
    echo "The dataset file is already in ${DATA_DIR}"
else
    # Google Drive's file identifier (used to download the zip file)
    FILE_ID="1pXFQnhYiHf9hz_hivyqb6qEjWXhGRyVO"

    gdown "$FILE_ID" -O "${DATA_DIR}/flight_prices.csv"
fi

# Run pylint for the "build_projectdb.py" python script before running it
echo "Running pylint for the "build_projectdb.py" python script before running it"
pylint "${PROJECT_ROOT}/scripts/build_projectdb.py"


# Run the build_projectdb.py script
python3 "${PROJECT_ROOT}/scripts/build_projectdb.py"

# Remove the project directory before importing the data
hdfs dfs -rm -r project

password=$(head -n 1 secrets/.psql.pass)

sqoop import-all-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team25_projectdb --username team25 --password $password --compression-codec=snappy --compress --as-avrodatafile --warehouse-dir=project/warehouse --m 1

mv "${PROJECT_ROOT}/flights.avsc" "${PROJECT_ROOT}/output/"

mv "${PROJECT_ROOT}/flights.java" "${PROJECT_ROOT}/output/"
