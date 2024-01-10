-- Créer une nouvelle base de données
CREATE DATABASE correction_ex_1;

-- Utiliser la base de données
USE correction_ex_1;

-- Table "personne"
CREATE TABLE personne (
personne_id INT PRIMARY KEY AUTO_INCREMENT,
titre VARCHAR(10) CHECK (titre IN ('M.', 'Mme')),
prenom VARCHAR(50) NOT NULL,
nom VARCHAR(50) NOT NULL,
telephone VARCHAR(15),
email VARCHAR(150)
);

-- Table "adresse"
CREATE TABLE adresse (
adresse_id INT PRIMARY KEY AUTO_INCREMENT,
personne_id INT NOT NULL,
rue VARCHAR(150),
ville VARCHAR(150),
code_postal VARCHAR(10),
FOREIGN KEY (personne_id) REFERENCES personne(personne_id) 
);