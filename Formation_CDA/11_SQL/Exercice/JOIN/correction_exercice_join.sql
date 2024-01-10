-- Créer une base de données
CREATE DATABASE IF NOT EXISTS Magasin;
USE Magasin;

-- Table Clients
CREATE TABLE Clients (
	id INT PRIMARY KEY,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    ville VARCHAR(100)
);

-- Table Produits
CREATE TABLE Produits (
	id_produit INT PRIMARY KEY,
    id_client INT,
    produit VARCHAR(100),
    montant DECIMAL(6, 2),
    FOREIGN KEY (id_client) REFERENCES Clients(id)
);

-- Insérer des données dans nos tables
INSERT INTO Clients (id, nom, prenom, ville)
VALUES  (1, 'Dupont', 'Jean', 'Paris'),
		(2, 'Doe', 'Jane', 'New York'),
        (3, 'Petit', 'Nicolas', 'Lille'),
        (4, 'Cauliez', 'Lucie', 'Marseille'),
        (5, 'Krueger', 'Freddy', 'Villeneuve d\'Ascq');
        
INSERT INTO Produits (id_produit, id_client, produit, montant)
VALUES  (1, 1, 'café', 2.00),
		(2, 2, 'thé', 1.50),
        (3, 3, 'coca', 5.00),
        (4, 5, 'ice tea', 3.00),
        (5, NULL, 'jus d\'orange', 4.50),
        (6, NULL, 'eau fraîche', 0.50),
        (7, 2, 'limonade', 1.50),
        (8, 5, 'lait', 1.00),
        (9, 2, 'soda cool', 10.00),
        (10, 3, 'actimel', 1000.00);
        
-- Afficher les tables
SELECT * FROM Clients;

SELECT * FROM Produits;

-- INNER JOIN
SELECT c.prenom, c.nom, p.produit, p.montant
FROM Clients AS c
INNER JOIN Produits AS p
ON c.id = p.id_client;

-- LEFT JOIN
SELECT c.prenom, c.nom, p.produit, p.montant
FROM Clients AS c
LEFT JOIN Produits AS p
ON c.id = p.id_client;

-- RIGHT JOIN
SELECT c.prenom, c.nom, p.produit, p.montant
FROM Clients AS c
RIGHT JOIN Produits AS p
ON c.id = p.id_client;

-- FULL JOIN
SELECT c.prenom, c.nom, p.produit, p.montant
FROM Clients AS c
LEFT JOIN Produits AS p
ON c.id = p.id_client

UNION

SELECT c.prenom, c.nom, p.produit, p.montant
FROM Clients AS c
RIGHT JOIN Produits AS p
ON c.id = p.id_client;


        
        