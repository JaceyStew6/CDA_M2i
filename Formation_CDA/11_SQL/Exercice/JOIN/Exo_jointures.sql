-- Creation de la base
CREATE DATABASE IF NOT EXISTS exo_jointures;
USE exo_jointures;

DROP TABLE IF EXISTS Purchases;
DROP TABLE IF EXISTS Customer;

-- 1. Création des tables
-- Création de la table Clients
CREATE TABLE IF NOT EXISTS Customer (
	customer_id INT PRIMARY KEY AUTO_INCREMENT,
    last_name VARCHAR(50),
    first_name VARCHAR(50),
    city VARCHAR(50)
    );
    
-- Création de la table Achats
CREATE TABLE IF NOT EXISTS Purchases (
	purchase_id INT PRIMARY KEY AUTO_INCREMENT,
    product VARCHAR(50),
    amount INT,
    id_customer INT,
    FOREIGN KEY (id_customer) REFERENCES Customer(customer_id)
    );
    
SHOW TABLES;


INSERT INTO Customer (last_name, first_name, city)
VALUES
	('Black', 'Max', 'New York'),
    ('Channing', 'Caroline', 'New York'),
    ('Earhart', 'Amelia', 'Los Angeles'),
    ('Ronan', 'Saoirse', 'Dublin'),
    ('Stewart', 'Kristen', 'Los Angeles');
    
SELECT *
FROM Customer;

INSERT INTO Purchases (product, amount, id_customer)
VALUES
	('Chocolat', 1, 1),
    ('Carottes', 15, 2),
    ('Carte', 6, NULL),
    ('Pantalon', 30, 5),
    ('Lait', 4, 1),
    ('Clémentine', 6, 3),
	('Eau', 4, 2),
    ('Casquette', 25, 5),
    ('T-shirt', 10, 5),
    ('Avoine', 7, 2);
    
SELECT *
FROM Purchases;

-- 3. Jointures
-- a. INNER JOIN
SELECT customer_id, first_name, last_name, product, amount
FROM Customer AS c
INNER JOIN Purchases AS p
ON c.customer_id = p.id_customer;

-- b. LEFT JOIN
SELECT *
FROM Customer AS c
LEFT JOIN Purchases AS p
ON c.customer_id = p.id_customer;

-- c. RIGHT JOIN
SELECT *
FROM Customer AS c
RIGHT JOIN Purchases AS p
ON c.customer_id = p.id_customer;

-- c. FULL JOIN
SELECT *
FROM Customer AS c
LEFT JOIN Purchases AS p
ON c.customer_id = p.id_customer

UNION

SELECT *
FROM Customer AS c
RIGHT JOIN Purchases AS p
ON c.customer_id = p.id_customer;
