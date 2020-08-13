CREATE DATABASE patientdb;
USE patientdb;
CREATE TABLE patient
(
pid INT NOT NULL PRIMARY KEY auto_increment,
pname VARCHAR(255),
gender VARCHAR(255),
diagnosis VARCHAR(255),
dob DATE,
ward_no INT,
bed_no INT
)

SELECT * FROM patient;
