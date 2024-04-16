"""A python script that builds the project database tables for TEAM 25 from an sql script"""
from pprint import pprint
import os
import psycopg2 as psql

# Read password from secrets file
file = os.path.join("secrets", ".psql.pass")
with open(file, "r", encoding="utf-8") as file:
    team25_password = file.read().rstrip()

# build connection string
conn_string = f"host=hadoop-04.uni.innopolis.ru port=5432 user=team25 \
    dbname=team25_projectdb password={team25_password}"

# Connect to the remote dbms
with psql.connect(conn_string) as conn:
    # Create a cursor for executing psql commands
    cur = conn.cursor()
    # Read the commands from the file and execute them.
    with open(os.path.join("sql","create_tables.sql"), encoding="utf-8") as file:
        content = file.read()
        cur.execute(content)
    conn.commit()

    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "import_data.sql"), encoding="utf-8") as file:
        # We assume that the COPY commands in the file are ordered (1.depts, 2.emps)
        commands= file.readlines()
        with open(os.path.join("data", "flight_prices.csv"), "r", encoding="utf-8") as depts:
            cur.copy_expert(commands[0], depts)

    # If the sql statements are CRUD then you need to commit the change
    conn.commit()

    pprint(conn)
    cur = conn.cursor()
    # Read the sql commands from the file
    with open(os.path.join("sql", "test_database.sql"), encoding="utf-8") as file:
        commands = file.readlines()
        for command in commands:
            cur.execute(command)
            # Read all records and print them
            pprint(cur.fetchall())
