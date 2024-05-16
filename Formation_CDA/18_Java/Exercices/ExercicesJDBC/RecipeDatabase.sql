CREATE DATABASE IF NOT EXISTS recipe_database;
USE recipe_database;

SHOW DATABASES;

-- Création de la table Ingredient
CREATE TABLE IF NOT EXISTS Ingredient(
	ingredient_id INT PRIMARY KEY AUTO_INCREMENT,
    ingredientName VARCHAR(50) NOT NULL
);

-- Création de la table Category
CREATE TABLE IF NOT EXISTS Category(
	category_id INT PRIMARY KEY AUTO_INCREMENT,
    categoryName VARCHAR(50) NOT NULL
);

-- Création de la table Recipe
CREATE TABLE IF NOT EXISTS Recipe(
	recipe_id INT PRIMARY KEY AUTO_INCREMENT,
    recipeName VARCHAR(250),
    preparationTime VARCHAR(10),
    cookingTime VARCHAR(10),
    difficulty VARCHAR(20),
    id_ingredient INT,
    id_category INT,
    FOREIGN KEY (id_ingredient) REFERENCES Ingredient(ingredient_id),
    FOREIGN KEY (id_category) REFERENCES Category(category_id)
);

-- Création de la table Step
CREATE TABLE IF NOT EXISTS Step(
	step_id INT PRIMARY KEY AUTO_INCREMENT,
    stepDescription VARCHAR(250),
    id_recipe INT,
    FOREIGN KEY (id_recipe) REFERENCES Recipe(recipe_id)
);

-- Création de la table Commentary
CREATE TABLE IF NOT EXISTS Commentary(
	commentary_id INT PRIMARY KEY AUTO_INCREMENT,
    commentaryDescription VARCHAR(250),
    id_recipe INT,
    FOREIGN KEY (id_recipe) REFERENCES Recipe(recipe_id)
);

-- Création de la table de jointure Recipe_Ingredient
CREATE TABLE IF NOT EXISTS Recipe_Ingredient(
	ingredientAmount VARCHAR(10),
	id_recipe INT,
    id_ingredient INT,
    FOREIGN KEY (id_recipe) REFERENCES Recipe(recipe_id),
    FOREIGN KEY (id_ingredient) REFERENCES Ingredient(ingredient_id)
);

