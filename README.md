# 🚌 Busreservation (Java + JDBC + MySQL)

**Busreservation** is a simple Java console application used to view bus details from a MySQL database.  
This project is created for learning Java, JDBC connection, DAO pattern, and MySQL integration.

---

## 📌 Features

- Connect Java application to MySQL using JDBC  
- View all available buses  
- Displays:
  - Bus Number
  - AC / Non-AC
  - Passenger Capacity  
- Clean Object-Oriented Structure  
- DAO (Data Access Object) implemented

---

## 🏗️ Project Structure

Busreservation/
└── src/
└── busresv.edu.co/
├── Bus.java
├── BusDAO.java
├── Busdemo.java
└── dbconnection.java

sql
Copy code

---

## 🛢️ Database Setup (MySQL)

Run the following SQL:

```sql
CREATE DATABASE busresv;
USE busresv;

CREATE TABLE busresv (
    id INT PRIMARY KEY,
    ac BOOLEAN,
    capacity INT
);

INSERT INTO busresv VALUES
(1, TRUE, 20),
(2, FALSE, 40),
(3, TRUE, 30);
🔌 JDBC Configuration
Download MySQL Connector JAR:

mysql-connector-j-8.x.x.jar
or

mysql-connector-j-9.x.x.jar

Add JAR to Project:
VS Code / IntelliJ →
Project → Add External JARs → select mysql-connector-j.jar

⚙️ Core Code Snippets
Database Connection
java
Copy code
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url, username, password);
Fetching Bus Details
java
Copy code
String query = "SELECT * FROM busresv";
ResultSet rs = st.executeQuery(query);
▶️ How to Run
1. Compile
bash
Copy code
javac -cp .;mysql-connector-j-9.5.0.jar busresv/edu/co/*.java
2. Run
bash
Copy code
java -cp .;mysql-connector-j-9.5.0.jar busresv.edu.co.Busdemo
🧪 Sample Output
yaml
Copy code
Bus No: 1
AC: Yes
Capacity: 20

Bus No: 2
AC: No
Capacity: 40

Bus No: 3
AC: Yes
Capacity: 30
🚀 Future Enhancements
Ticket Booking

Passenger Registration

Seat Selection

Cancel / Update Ticket

Admin Dashboard

GUI using JavaFX or Spring Boot
