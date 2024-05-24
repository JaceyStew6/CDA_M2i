-- Création de la base de données
CREATE DATABASE IF NOT EXISTS jpa_exo1;
USE jpa_exo1;


CREATE TABLE IF NOT EXISTS ssd(
	id INT PRIMARY KEY AUTO_INCREMENT,
    brand VARCHAR(50) NOT NULL,
    size INT NOT NULL,
    ssdType VARCHAR(50) NOT NULL
);

-- DROP table ssd

SHOW TABLES;

SELECT *
FROM ssd;

-- DELETE FROM ssd
-- WHERE id = 2;

-- DROP database jpa_exo1;