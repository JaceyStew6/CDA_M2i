CREATE DATABASE IF NOT EXISTS zoo_database;
USE zoo_database;

SHOW DATABASES;

DROP TABLE IF EXISTS Animal;
DROP TABLE IF EXISTS Food;

-- Création de la table Animal
CREATE TABLE IF NOT EXISTS Animal(
	animal_id INT PRIMARY KEY AUTO_INCREMENT,
    animalName VARCHAR(100) NOT NULL,
    breed VARCHAR(50) NOT NULL,
    animalDescription TEXT(500),
    habitat VARCHAR(50),
    animalAge VARCHAR(50) NOT NULL
);

-- Création de la table Food
CREATE TABLE IF NOT EXISTS Food(
	food_id INT PRIMARY KEY AUTO_INCREMENT,
    dateAndTime DATETIME,
    foodDetails VARCHAR(250),
    id_animal INT,
    FOREIGN KEY (id_animal) REFERENCES Animal(animal_id)
);

SHOW TABLES;
SELECT *
FROM Animal;

SHOW TABLES;
SELECT *
FROM Food;