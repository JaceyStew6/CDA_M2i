-- Création de tables pour une base de données de streaming musical

CREATE DATABASE IF NOT EXISTS music_stream;
USE music_stream;

CREATE TABLE IF NOT EXISTS users (
	user_id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(50) NOT NULL,
    email_address VARCHAR(100) NOT NULL,
    sub_date DATE,
    country VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS songs (
	song_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(150),
    artist VARCHAR(100),
    album VARCHAR(150),
    duration TIME,
    music_type VARCHAR(100),
    release_date YEAR
);

CREATE TABLE IF NOT EXISTS playlists (
	playlist_id INT AUTO_INCREMENT PRIMARY KEY,
    playlist_name VARCHAR(100),
    creation_date DATE,
    id_user INT,
    FOREIGN KEY (id_user) REFERENCES users(user_id)
);

SHOW TABLES;