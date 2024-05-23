-- Création de la base de données
CREATE DATABASE IF NOT EXISTS jpa_computer;
USE jpa_computer;

CREATE TABLE IF NOT EXISTS identification(
	identification_id INT PRIMARY KEY AUTO_INCREMENT,
    ipAddress VARCHAR(50) NOT NULL,
    macAddress VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS computer(
	id INT PRIMARY KEY AUTO_INCREMENT,
    computerName VARCHAR(50) NOT NULL,
    price FLOAT NOT NULL,
    id_identification INT,
    FOREIGN KEY (id_identification) REFERENCES identification(identification_id)
);


-- DROP table computer
 
SHOW TABLES;

SELECT *
FROM computer;

-- DELETE FROM ssd
-- WHERE id = 2;

-- DROP database jpa_exo1;