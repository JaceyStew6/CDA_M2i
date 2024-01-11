-- Etape 1: Création de la BDD et des Tables
-- 1. Creation de la base
CREATE DATABASE IF NOT EXISTS tabletoptreasures_database;
USE tabletoptreasures_database;

-- DROP TABLE IF EXISTS Games_Orders;
-- DROP TABLE IF EXISTS Games;
-- DROP TABLE IF EXISTS Orders;
-- DROP TABLE IF EXISTS Categories;
-- DROP TABLE IF EXISTS Customers;

-- 2. Création des tables
-- Création de la table Customers (Clients)
CREATE TABLE IF NOT EXISTS Customers (
	customer_id INT PRIMARY KEY AUTO_INCREMENT,
    last_name VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    email_address VARCHAR(250) UNIQUE NOT NULL,
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
    game_name VARCHAR(250) NOT NULL,
    game_desc TEXT(1000),
    price DECIMAL(5, 2) NOT NULL,
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

-- Création table de jointure Games_Order
CREATE TABLE IF NOT EXISTS Games_Orders(
	id_order INT NOT NULL,
    id_game INT NOT NULL,
    FOREIGN KEY (id_order) REFERENCES Orders(order_id ),
    FOREIGN KEY (id_game) REFERENCES Games(game_id  )
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


INSERT INTO Games_Orders (id_order, id_game)
VALUES 
	(1, 4),
	(2, 6),
    (2, 5),
    (2, 15),
	(3, 1);

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
SELECT COUNT(DISTINCT nom) 
FROM Categories;

-- 5. Quelle est la catégorie ayant le nom le plus long ?
/*SELECT MAX(category_name) AS longest_category_name
FROM Categories;*/

SELECT category_name
FROM Categories
ORDER BY LENGTH(category_name) DESC
LIMIT 1;

-- 6. Montrez le nombre de jeux dans chaque catégorie 
-- PAS SURE DE LA SOLUTION PROPOSEE
/**SELECT id_category, COUNT(*) AS numberOfGamesByCategory
FROM Games
GROUP BY id_category;*/

SELECT Categories.category_name, COUNT(Games.game_id) AS nb_games
FROM Categories
INNER JOIN Games
ON Categories.category_id = Games.id_category
GROUP BY Categories.category_name;


-- 7. Affichez les catégories triées par ordre alphabétique inversé.
SELECT *
FROM Categories
ORDER BY category_name DESC;


-- Table Games :
-- 1. Sélectionnez tous les noms de jeux distincts
SELECT DISTINCT game_name
FROM Games;

-- 2. Montrez les jeux avec un prix entre 25 et 40
SELECT *
FROM Games
WHERE price BETWEEN 25 AND 40;

-- 3. Quels jeux appartiennent à la catégorie avec l'ID 3 ?
SELECT *
FROM Games
WHERE id_category = 3;

-- 4. Combien de jeux ont une description contenant le mot "aventure" ?
SELECT COUNT(*)
FROM Games
WHERE game_desc LIKE '%aventure%';

SELECT *
FROM Games
WHERE game_desc LIKE '%aventure%';

-- 5. Quel est le jeu le moins cher ?
SELECT game_name, price
FROM Games
ORDER BY price ASC
LIMIT 1;

-- 6. Montrez la somme totale des prix de tous les jeux
SELECT SUM(price) AS allGamesPricesSum
FROM Games;

-- 7. Affichez les jeux triés par ordre alphabétique des noms en limitant les résultats à 5
SELECT *
FROM Games
ORDER BY game_name ASC
LIMIT 5;


-- Table Customers :
-- 1. Sélectionnez tous les prénoms des clients distincts
SELECT DISTINCT first_name
FROM Customers;

-- 2. Montrez les clients dont l'adresse contient "Rue" et dont le numéro de téléphone commence par "+1"
SELECT *
FROM Customers
WHERE delivery_address LIKE '%Rue%' AND phone_number LIKE '+1%';

-- 3. Quels clients ont un nom commençant par "M" ou "R" ?
SELECT *
FROM Customers
WHERE last_name LIKE 'M%' OR last_name LIKE 'R%';

-- 4. Combien de clients ont une adresse e-mail valide (contenant "@") ?
SELECT COUNT(*) AS numberOfCustomersWithValidEmail
FROM Customers
WHERE email_address LIKE '%@%';

-- 5. Quel est le prénom le plus court parmi les clients ?
/*SELECT MIN(first_name ) AS shortest_first_name
FROM Customers;*/

SELECT *
FROM Customers
ORDER BY CHAR_LENGTH(first_name)
LIMIT 1;

-- 6. Montrez le nombre total de clients enregistrés
SELECT COUNT(*)
FROM Customers;

-- 7. Affichez les clients triés par ordre alphabétique des noms de famille, mais en excluant les premiers 3
SELECT *
FROM Customers
ORDER BY last_name ASC
LIMIT 9999 OFFSET 3;


-- Étape 4 : Requêtes SQL avancées
-- 1. Sélectionnez les noms des clients, noms de jeux et date de commande pour chaque commande passée
SELECT c.last_name, g.game_name, o.order_date 
FROM Games AS g
INNER JOIN Games_Orders AS go ON g.game_id  = go.id_game 
INNER JOIN Orders AS o ON o.order_id  = go.id_order
INNER JOIN Customers AS c ON c.customer_id = o.id_customer;

-- 2. Sélectionnez les noms des clients et le montant total dépensé par chaque client. Triez les résultats par montant total décroissant
SELECT c.last_name, SUM(g.price) AS invoiceByCustomer
FROM Customers AS c
INNER JOIN Orders AS o ON c.customer_id = o.id_customer
INNER JOIN Games_Orders AS go ON o.order_id = go.id_order 
INNER JOIN Games AS g ON g.game_id  = go.id_game 
GROUP BY c.customer_id
ORDER BY SUM(g.price) DESC;

-- 3. Sélectionnez les noms des jeux, noms de catégories et prix de chaque jeu.
SELECT g.game_name, c.category_name, g.price
FROM Games AS g
INNER JOIN Categories AS c ON g.id_category = c.category_id;

-- 4. Sélectionnez les noms des clients, date de commande et noms de jeux pour toutes les commandes passées
SELECT c.last_name, g.game_name, o.order_date 
FROM Games AS g
INNER JOIN Games_Orders AS go ON g.game_id  = go.id_game 
INNER JOIN Orders AS o ON o.order_id  = go.id_order
INNER JOIN Customers AS c ON c.customer_id = o.id_customer;

-- 5. Sélectionnez les noms des clients, nombre total de commandes par client et montant total dépensé par client. Incluez uniquement les clients ayant effectué au moins une commande.
SELECT c.last_name, SUM(g.price) AS invoiceByCustomer, COUNT(DISTINCT o.order_id) AS totalOrdersByClient
FROM Customers AS c
INNER JOIN Orders AS o ON c.customer_id = o.id_customer
INNER JOIN Games_Orders AS go ON o.order_id = go.id_order 
INNER JOIN Games AS g ON g.game_id  = go.id_game 
GROUP BY c.customer_id
ORDER BY SUM(g.price) DESC;
