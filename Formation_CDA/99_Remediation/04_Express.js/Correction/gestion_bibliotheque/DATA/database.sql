-- Active: 1706698484549@@localhost@3306@bibliotheque
CREATE DATABASE bibliotheque

USE bibliotheque

CREATE TABLE livres (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titre VARCHAR(255),
    auteur VARCHAR(255),
    annee_publication INT,
    disponible BOOL
)