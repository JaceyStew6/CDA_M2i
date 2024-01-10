SHOW databases;
USE test_bdd;


CREATE TABLE IF NOT EXISTS person (
	person_id INT AUTO_INCREMENT PRIMARY KEY,
    gender VARCHAR(10) CHECK (gender IN ('M', 'Mme')),
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    phone_number VARCHAR(15),
    email_address VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS address (
	address_id INT AUTO_INCREMENT PRIMARY KEY,
    id_person INT NOT NULL,
    street_number VARCHAR(10) NOT NULL,
    street_name VARCHAR(100) NOT NULL,
    post_code VARCHAR(10),
    city VARCHAR(150),
    FOREIGN KEY (id_person) REFERENCES person(person_id)
);

CREATE TABLE IF NOT EXISTS account (
	account_id INT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(50) NOT NULL,
    password_account VARCHAR(50) NOT NULL,
    email_address VARCHAR(255),
    date_creation DATETIME,
    derniere_connexion VARCHAR(50)
);

SHOW TABLES;
    