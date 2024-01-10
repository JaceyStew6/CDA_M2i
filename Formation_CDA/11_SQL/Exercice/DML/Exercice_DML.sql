-- Creation de la base
CREATE DATABASE IF NOT EXISTS exo_DML;
USE exo_DML;
SET SQL_SAFE_UPDATEs =0;

-- DROP TABLE IF EXISTS Students;

-- Creation de la table Students 
CREATE TABLE IF NOT EXISTS Students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age INT,
    grade VARCHAR(10)
);

SHOW TABLES;

-- Partie 1: INSERT INTO
-- Insère les données de 3 étudiants à la table
INSERT INTO Students (first_name, last_name, age, grade)
VALUES
	('Maria', 'Rodriguez', 21, 'B'),
    ('Ahmed', 'Khan', 19, 'A'),
    ('Emily', 'Baker', 22, 'C');

SELECT *
FROM Students;

-- Partie 2: UPDATE
-- Mise à jour du 'grade' des personnes ayant le prénom Maria
UPDATE Students
SET grade = 'A'
WHERE first_name = 'Maria';

SELECT *
FROM Students;

-- Ajout de 1 an pour l'age de tous les étudiants
UPDATE Students
SET age = age + 1;

-- Partie 3: DELETE
-- Supprime les étudiants ayant le prénom Emily
DELETE FROM Students
WHERE first_name = 'Emily';

SELECT *
FROM Students;

-- Permet de revenir à l'état initial de l'age pour vérifier la condition de suppression en fonction de l'age
UPDATE Students
SET age = age - 1;

-- Supprime tous les étudiants dont l'age est inférieur à 20
DELETE FROM Students
WHERE age < 20;

SELECT *
FROM Students;

-- Partie 4: TRUNCATE
TRUNCATE TABLE Students;

SELECT *
FROM Students;
