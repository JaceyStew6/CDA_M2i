CREATE DATABASE IF NOT EXISTS zoo_database;
USE zoo_database;

SHOW DATABASES;

-- DROP TABLE IF EXISTS Animal;
-- DROP TABLE IF EXISTS Food;

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

-- Création de la table Enclosure
CREATE TABLE IF NOT EXISTS Enclosure(
	enclosure_id INT PRIMARY KEY AUTO_INCREMENT,
    enclosureName VARCHAR(50),
    id_animal INT,
    FOREIGN KEY (id_animal) REFERENCES Animal(animal_id)
);

-- Création table de jointure Animal_Enclosure
CREATE TABLE IF NOT EXISTS Animal_Enclosure(
	id_animal INT NOT NULL,
    id_enclosure INT NOT NULL,
    FOREIGN KEY (id_animal) REFERENCES Animal(animal_id),
    FOREIGN KEY (id_enclosure) REFERENCES Enclosure(enclosure_id)
);

SHOW TABLES;
SELECT *
FROM Animal;

SHOW TABLES;
SELECT *
FROM Food;

SHOW TABLES;
SELECT *
FROM Enclosure;

insert into Enclosure (enclosureName)
values
	('Enclos 1')


SELECT * FROM Animal WHERE animalName = "Stitch";