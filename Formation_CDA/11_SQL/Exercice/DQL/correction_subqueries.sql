SHOW databases;
USE test_bdd;

-- Affichez les utilisateurs nés dans le même lieu que celui du plus jeune utilisateur.
SELECT *
FROM users
WHERE birth_location = (SELECT birth_location FROM users WHERE age = (SELECT MIN(age) FROM users));

-- Sélectionnez les utilisateurs dont le salaire est inférieur 
-- à la moyenne des salaires des "Developers".
SELECT *
FROM users
WHERE salary < (SELECT AVG(salary) FROM users WHERE job = 'Developer');

-- Affichez les utilisateurs dont le salaire est supérieur à la moyenne des 
-- salaires des utilisateurs nés dans la même ville que "John Doe".
SELECT *
FROM users
WHERE salary > (SELECT AVG(salary) FROM users WHERE birth_location = (SELECT birth_location FROM users WHERE first_name = 'John' AND last_name = 'Doe'));

