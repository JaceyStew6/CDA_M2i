-- Créez une base de données appelée "tabletoptreasures_database".
CREATE DATABASE IF NOT EXISTS tabletoptreasures_database;
USE tabletoptreasures_database;

-- Table "Clients"
CREATE TABLE IF NOT EXISTS Clients (
	id_client INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    prenom VARCHAR(100) NOT NULL,
    adresse_mail VARCHAR(255) UNIQUE NOT NULL,
    adresse_de_livraison VARCHAR(255),
    telephone VARCHAR(15)
    );
    
-- Table "Jeux"
CREATE TABLE IF NOT EXISTS Jeux (
	id_jeu INT AUTO_INCREMENT PRIMARY KEY,
    nom_jeu VARCHAR(255) NOT NULL,
    descriptions TEXT,
    prix DECIMAL(5, 2) NOT NULL,
    id_categorie INT NOT NULL
);

-- Table "Categories"
CREATE TABLE IF NOT EXISTS Categories (
	id_categorie INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100)
);

-- Table "Commandes"
CREATE TABLE IF NOT EXISTS Commandes (
	id_commande INT AUTO_INCREMENT PRIMARY KEY,
    date_commande TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    adresse_livraison VARCHAR(255) NOT NULL,
    statut VARCHAR(50),
    id_client INT NOT NULL,
    FOREIGN KEY (id_client) REFERENCES Clients(id_client)
);

-- Ajout de la clé étrangère de la table Jeu
ALTER TABLE Jeux
ADD FOREIGN KEY (id_categorie) REFERENCES Categories(id_categorie);

-- Opérations en DML
-- INSERER des enregistrements
/* INSERT INTO Clients (nom, prenom, adresse_mail, adresse_de_livraison, telephone)
VALUES ('Dubois', 'Marie', 'marie.dubois@example.com', '123 Rue de la Libération, Ville', '+1234567890'),
('Lefebvre', 'Thomas', 'thomas.lefebvre@example.com', '456 Avenue des Roses, Ville', '+9876543210'),
('Martinez', 'Léa', 'lea.martinez@example.com', '789 Boulevard de la Paix, Ville', '+2345678901'),
('Dupuis', 'Antoine', 'antoine.dupuis@example.com', '567 Avenue de la Liberté, Ville', '+3456789012'),
('Morin', 'Camille', 'camille.morin@example.com', '890 Rue de l''Avenir, Ville', '+4567890123'),
('Girard', 'Lucas', 'lucas.girard@example.com', '234 Avenue des Champs, Ville', '+5678901234'),
('Petit', 'Emma', 'emma.petit@example.com', '123 Rue des Étoiles, Ville', '+6789012345'),
('Sanchez', 'Gabriel', 'gabriel.sanchez@example.com', '345 Boulevard du Bonheur, Ville', '+7890123456'),
('Rossi', 'Clara', 'clara.rossi@example.com', '678 Avenue de la Joie, Ville', '+8901234567'),
('Lemoine', 'Hugo', 'hugo.lemoine@example.com', '456 Rue de la Nature, Ville', '+9012345678'),
('Moreau', 'Eva', 'eva.moreau@example.com', '789 Avenue de la Créativité, Ville', '+1234567890'),
('Fournier', 'Noah', 'noah.fournier@example.com', '234 Rue de la Découverte, Ville', '+2345678901'),
('Leroy', 'Léa', 'lea.leroy@example.com', '567 Avenue de l''Imagination, Ville', '+3456789012'),
('Robin', 'Lucas', 'lucas.robin@example.com', '890 Rue de la Création, Ville', '+4567890123'),
('Marchand', 'Anna', 'anna.marchand@example.com', '123 Boulevard de l''Innovation, Ville', '+5678901234'); */

/*INSERT INTO Categories (nom)
VALUES ('Stratégie'),
('Familial'),
('Aventure');*/

/*INSERT INTO Jeux (nom_jeu, descriptions, prix, id_categorie)
VALUES ('Catan', 'Jeu de stratégie et de développement de colonies', 30, 1),
('Dixit', 'Jeu d''association d''images', 25, 2),
('Les Aventuriers', 'Jeu de plateau d''aventure', 40, 3),
('Carcassonne', 'Jeu de placement de tuiles', 28, 1),
('Codenames', 'Jeu de mots et d''indices', 20, 2),
('Pandemic', 'Jeu de coopération pour sauver le monde', 35, 3),
('7 Wonders', 'Jeu de cartes et de civilisations', 29, 1),
('Splendor', 'Jeu de développement économique', 27, 2),
('Horreur à Arkham', 'Jeu d''enquête et d''horreur', 45, 3),
('Risk', 'Jeu de conquête mondiale', 22, 1),
('Citadelles', 'Jeu de rôles et de bluff', 23, 2),
('Terraforming Mars', 'Jeu de stratégie de colonisation de Mars', 55, 3),
('Small World', 'Jeu de civilisations fantastiques', 32, 1),
('7 Wonders Duel', 'Jeu de cartes pour 2 joueurs', 26, 2),
('Horreur à l''Outreterre', 'Jeu d''aventure horrifique', 38, 3);

INSERT INTO Commandes (id_client, adresse_livraison, statut)
VALUES (5, '123 Rue de la Libération, Ville', 'En cours'),
(6, '456 Avenue des Roses, Ville', 'Livrée'),
(8, '789 Boulevard de la Paix, Ville', 'Annulée');*/

-- Update du jeu à l'ID 3
UPDATE Jeux
SET prix = 35
WHERE id_jeu = 3;

-- Supression du jeu à l'ID 2
DELETE FROM Jeux
WHERE id_jeu = 2;

-- Requêtes SELECT

-- Table Categories
-- 1
SELECT DISTINCT nom
FROM Categories;

-- 2
SELECT *
FROM Categories
WHERE nom LIKE 'A%' OR nom LIKE 'S%';

-- 3
SELECT *
FROM Categories
WHERE id_categorie BETWEEN 2 AND 5;

-- 4
SELECT COUNT(DISTINCT nom)
FROM Categories;

-- 5
SELECT nom
FROM Categories
ORDER BY LENGTH(nom) DESC
LIMIT 1;

-- 6
SELECT Categories.nom, COUNT(Jeux.id_jeu) AS nb_jeux
FROM Categories
INNER JOIN Jeux
ON Categories.id_categorie = Jeux.id_categorie
GROUP BY Categories.nom;

-- 7
SELECT *
FROM Categories
ORDER BY nom DESC;

-- Table jeux
SELECT *
FROM jeux;


-- 1
SELECT DISTINCT nom_jeu
FROM Jeux;

-- 2
SELECT *
FROM Jeux
WHERE prix BETWEEN 25 AND 40;

-- 3
SELECT *
FROM Jeux
WHERE id_categorie = 3;

-- 4
SELECT COUNT(*)
FROM Jeux
WHERE descriptions LIKE '%aventure%';

-- 5
SELECT nom_jeu, prix
FROM Jeux
ORDER BY prix ASC
LIMIT 1;

-- 6
SELECT SUM(prix)
FROM Jeux;

-- 7
SELECT *
FROM Jeux
ORDER BY nom_jeu ASC
LIMIT 5;

-- Table Clients
SELECT *
FROM Clients;


-- 1
SELECT DISTINCT prenom
FROM Clients;

-- 2
SELECT *
FROM Clients
WHERE adresse_de_livraison LIKE '%rue%' AND telephone LIKE '+1%';

-- 3
SELECT *
FROM Clients
WHERE nom LIKE 'M%' OR nom LIKE 'R%';

-- 4
SELECT COUNT(*)
FROM Clients
WHERE adresse_mail LIKE '%@%';

-- 5
SELECT *
FROM Clients
ORDER BY CHAR_LENGTH(prenom)
LIMIT 1;

-- 6
SELECT COUNT(*)
FROM Clients;

-- 7
SELECT *
FROM Clients
ORDER BY nom ASC
LIMIT 9999
OFFSET 3;

-- ETAPE 4 : Requêtes avancées

CREATE TABLE Commandes_Jeux (
	id_commande_jeu INT PRIMARY KEY,
	id_commande INT NOT NULL,
    id_jeu INT NOT NULL,
    FOREIGN KEY (id_commande) REFERENCES Commandes(id_commande),
    FOREIGN KEY (id_jeu) REFERENCES Jeux(id_jeu)
);

ALTER TABLE Commandes_Jeux
MODIFY id_commande_jeu INT AUTO_INCREMENT;

INSERT INTO Commandes_Jeux (id_commande, id_jeu)
VALUES (1, 3),
(1, 7),
(2, 4),
(2, 7),
(3, 1),
(3, 3);

SELECT *
FROM Commandes_Jeux;

-- 1
SELECT c.nom, co.date_commande, j.nom_jeu
FROM Clients AS c
INNER JOIN Commandes AS co
ON co.id_client = c.id_client
INNER JOIN Commandes_Jeux AS cj
ON cj.id_commande = co.id_commande
INNER JOIN Jeux AS j
ON j.id_jeu = cj.id_jeu;

-- 2
SELECT c.nom, SUM(j.prix)
FROM Clients AS c
INNER JOIN Commandes AS co
ON co.id_client = c.id_client
INNER JOIN Commandes_Jeux AS cj
ON cj.id_commande = co.id_commande
INNER JOIN Jeux AS j
ON j.id_jeu = cj.id_jeu
GROUP BY c.id_client
HAVING SUM(j.prix)
ORDER BY SUM(j.prix) DESC;

-- 3
SELECT j.nom_jeu, c.nom, j.prix
FROM Jeux AS j
INNER JOIN Categories AS c
ON j.id_categorie = c.id_categorie;

-- 4
SELECT c.nom, j.nom_jeu, co.date_commande
FROM Clients AS c
LEFT JOIN Commandes AS co
ON co.id_client = c.id_client
LEFT JOIN Commandes_Jeux AS cj
ON co.id_commande = cj.id_commande
LEFT JOIN Jeux AS j
ON cj.id_jeu = j.id_jeu

UNION

SELECT c.nom, j.nom_jeu, co.date_commande
FROM Clients AS c
RIGHT JOIN Commandes AS co
ON co.id_client = c.id_client
RIGHT JOIN Commandes_Jeux AS cj
ON co.id_commande = cj.id_commande
RIGHT JOIN Jeux AS j
ON cj.id_jeu = j.id_jeu;

-- 5
SELECT cl.nom, COUNT(DISTINCT co.id_commande), SUM(j.prix)
FROM Clients AS cl
INNER JOIN Commandes AS co
ON co.id_client = cl.id_client
INNER JOIN Commandes_Jeux AS cj
ON cj.id_commande = co.id_commande
INNER JOIN Jeux AS j
ON j.id_jeu = cj.id_jeu
GROUP BY cl.id_client



















