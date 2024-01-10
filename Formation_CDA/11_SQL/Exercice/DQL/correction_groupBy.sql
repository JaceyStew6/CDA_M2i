SHOW databases;
USE test_bdd;

-- Affichez le nombre d'utilisateurs par lieu de naissance, 
-- mais ne montrez que les lieux avec plus d'un utilisateur.

SELECT birth_location, COUNT(*) AS user_count
FROM users
GROUP BY birth_location
HAVING user_count > 1;

-- Sélectionnez la profession et la moyenne des salaires pour chaque profession, 
-- mais ne montrez que celles avec une moyenne de salaire supérieure à 2500.
SELECT job, AVG(salary) AS average_salary
FROM users
GROUP BY job
HAVING average_salary > 2500;

-- Affichez la somme des salaires pour chaque lieu de naissance, 
-- mais ne montrez que les lieux dont la somme des salaires est supérieure à 5000.
SELECT birth_location, SUM(salary) AS total_salary
FROM users
GROUP BY birth_location
HAVING total_salary > 5000;

-- Sélectionnez la date de naissance et le nombre d'utilisateurs nés à chaque date, 
-- mais ne montrez que les dates où il y a plus d'un utilisateur né.

SELECT birth_date, COUNT(*) AS user_count
FROM users
GROUP BY birth_date
HAVING user_count > 1;


-- Affichez la profession, le lieu de naissance, et le salaire maximum pour chaque profession et lieu, 
-- mais ne montrez que les résultats où le salaire maximum est supérieur à 3000.
SELECT job, birth_location, MAX(salary) AS max_salary
FROM users
GROUP BY job, birth_location
HAVING max_salary > 3000;

