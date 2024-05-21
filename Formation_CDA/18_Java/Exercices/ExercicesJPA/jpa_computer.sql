-- Création de la base de données
CREATE DATABASE IF NOT EXISTS jpa_computer;
USE jpa_computer;


CREATE TABLE IF NOT EXISTS computer(
	id INT PRIMARY KEY AUTO_INCREMENT,
    computerName VARCHAR(50) NOT NULL,
    price FLOAT NOT NULL,
);

-- DROP table ssd

SHOW TABLES;

SELECT *
FROM ssd;

-- DELETE FROM ssd
-- WHERE id = 2;

-- DROP database jpa_exo1;