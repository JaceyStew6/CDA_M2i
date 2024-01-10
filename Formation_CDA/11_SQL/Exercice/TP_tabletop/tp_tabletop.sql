-- Etape 1: Création de la BDD et des Tables
-- 1. Creation de la base
CREATE DATABASE IF NOT EXISTS tabletoptreasures_database;
USE tabletoptreasures_database;

DROP TABLE IF EXISTS Games;
DROP TABLE IF EXISTS Orders;
DROP TABLE IF EXISTS Categories;
DROP TABLE IF EXISTS Customers;


-- 2. Création des tables
-- Création de la table Customers (Clients)
CREATE TABLE IF NOT EXISTS Customers (
	customer_id INT PRIMARY KEY AUTO_INCREMENT,
    last_name VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    email_address VARCHAR(150) NOT NULL,
    delivery_address VARCHAR(250),
    phone_number VARCHAR(15)
);

-- Création de la table Categories
CREATE TABLE IF NOT EXISTS Categories (
	category_id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(100) NOT NULL
);

-- Création de la table Games (Jeux)
CREATE TABLE IF NOT EXISTS Games (
	game_id INT PRIMARY KEY AUTO_INCREMENT,
    game_name VARCHAR(100) NOT NULL,
    game_desc TEXT(1000),
    price INT NOT NULL,
    id_category INT NOT NULL,
    FOREIGN KEY (id_category) REFERENCES Categories(category_id)
);

-- Création de la table Orders (Commandes)
CREATE TABLE IF NOT EXISTS Orders (
	order_id INT PRIMARY KEY AUTO_INCREMENT,
    order_date TIMESTAMP NOT NULL DEFAULT NOW(),
    delivery_address VARCHAR(250) NOT NULL,
    order_status VARCHAR(50),
    id_customer INT NOT NULL,
    FOREIGN KEY (id_customer) REFERENCES Customers(customer_id)
);

SHOW TABLES;


-- Etape 2: Opérations en DML
-- 1. Insertion des enregistrements du fichier annexe dans les tables Games, Categories et Customers

-- Pour la table Categories
INSERT INTO Categories (category_name)
VALUES 
	('Stratégie'),
	('Familial'),
	('Aventure');

-- Pour la table Games
INSERT INTO Games (game_name, game_desc, price, id_category)
VALUES
	('Catan', 'Jeu de stratégie et de développement de colonies', 30, 1),
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

SELECT *
FROM Games;

-- Pour la table Customers
INSERT INTO Customers (last_name, first_name, email_address, delivery_address, phone_number)
VALUES 
	('Dubois', 'Marie', 'marie.dubois@example.com', '123 Rue de la Libération, Ville', '+1234567890'),
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
	('Marchand', 'Anna', 'anna.marchand@example.com', '123 Boulevard de l''Innovation, Ville', '+5678901234');

SELECT *
FROM Customers;

-- 2. Effectuer 3 commandes en insérant une nouvelle entrée dans la table Orders
INSERT INTO Orders (id_customer, delivery_address, order_status)
VALUES 
	(1, (SELECT delivery_address
    FROM Customers
    WHERE customer_id = 1), 'Livré'),

	(6, (SELECT delivery_address
    FROM Customers
    WHERE customer_id = 6), 'En cours de préparation'),
    
    (12, (SELECT delivery_address
    FROM Customers
    WHERE customer_id = 12), 'Validé');

SELECT *
FROM Orders;

-- 3. Mettre à jour le prix du jeu avec l'ID 3 pour le fixer à 35€
UPDATE Games
SET price = 35
WHERE game_id = 3;

SELECT *
FROM Games;

-- 4. Supprime le jeu avec l'ID 2 (Dixit) de la table Games
DELETE FROM Games
WHERE game_id = 2;

SELECT *
FROM Games;

-- Etape 3: Requêtes SQL simples
-- Table Categories
-- 1. Sélectionnez tous les noms de catégories distinctes
SELECT DISTINCT category_name
FROM Categories;

-- 2. Montrez les catégories avec des noms commençant par "A" ou "S"
SELECT *
FROM Categories
WHERE category_name LIKE 'A%' OR category_name LIKE 'S%';

-- 3. Catégories dont l'ID est compris entre 2 et 5 inclus 
SELECT *
FROM Categories
WHERE category_id BETWEEN 2 AND 5;

-- 4. Combien de catégories différentes existent?
SELECT COUNT(*) 
FROM Categories;

-- 5. Quelle est la catégorie ayant le nom le plus long ?
SELECT MAX(category_name) AS longest_category_name
FROM Categories;

-- 6. Montrez le nombre de jeux dans chaque catégorie


-- 7. Affichez les catégories triées par ordre alphabétique inversé.

