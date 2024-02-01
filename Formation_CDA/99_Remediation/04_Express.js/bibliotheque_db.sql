-- Création de la base bibliotheque
CREATE DATABASE IF NOT EXISTS bibliotheque;
USE bibliotheque;

-- DROP TABLE Livres;

-- Création de la table Livres
CREATE TABLE IF NOT EXISTS Livres (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(50) NOT NULL,
    release_year INT NOT NULL,
    availability BOOL
);
