import mysql.connector

# 1️⃣ Connect to MySQL
conn = mysql.connector.connect(
    host="localhost",      # your server, usually localhost
    username="root",           # your MySQL username
    password="",  # your MySQL password
    database="proj"     # the database containing 'students'
)

# 2️⃣ Create a cursor
cursor = conn.cursor()

# 3️⃣ Execute query to get all students
cursor.execute("SELECT * FROM Student")

# 4️⃣ Fetch all rows
rows = cursor.fetchall()

# 5️⃣ Display the data
for row in rows:
    for value in row:
        print(value, end=" | ")
    print()   # new line after each row

cursor.close()
conn.close()
