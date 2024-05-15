CREATE DATABASE IF NOT EXISTS exercice1_movies;
USE exercice1_movies;

SHOW DATABASES;

CREATE TABLE IF NOT EXISTS Movie(
	movies_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    director VARCHAR(50) NOT NULL,
    releaseDate VARCHAR(50) NOT NULL,
    movieType VARCHAR(50)
);

SHOW TABLES;
SELECT *
FROM Movie;