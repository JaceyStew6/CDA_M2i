SHOW databases;
USE test_bdd;
SHOW TABLES;

SELECT *
FROM users;

SELECT *
FROM users
WHERE job <> 'Developer';

SELECT *
FROM users
WHERE first_name = 'John';

SELECT *
FROM users
WHERE salary >= 3000;

SELECT *
FROM users
WHERE age < 30 OR age >= 35;


SELECT *
FROM users
WHERE job = 'Teacher' AND salary > 2600;

SELECT *
FROM users
WHERE birth_location = 'New York' AND (salary >= 3000 AND salary <= 3500) AND NOT (job = 'Doctor' OR 'Lawyer');


SELECT *
FROM users
WHERE job ='Engineer';

SELECT first_name, last_name
FROM users
WHERE birth_location IN ('London', 'Paris', 'Berlin');

SELECT *
FROM users
WHERE age BETWEEN 25 AND 35;

SELECT *
FROM users
WHERE (salary NOT BETWEEN 0 AND 2500) AND job = 'Developer';


SELECT *
FROM users
ORDER BY age DESC
LIMIT 5;

SELECT *
FROM users
ORDER BY first_name ASC
LIMIT 5 OFFSET 5;

SELECT *
FROM users
ORDER BY salary DESC
LIMIT 3;

-- Exo Recap
-- 1.Selection de tous les utilisateurs
SELECT *
FROM users;

-- 2.Selection nom et prénoms des utilisateurs nés à NY et Londres
SELECT last_name, first_name
FROM users
WHERE birth_location IN ('New York', 'London');

-- 3.Utilisateurs dont le travail est Developer ou Designer
SELECT *
FROM users
WHERE job IN ('Developer', 'Designer');

-- 4.Utilisateurs dont l'age est supérieur à 30
SELECT *
FROM users
WHERE age > 30;

-- 5.Utilisateurs dont le salaire est compris entre 2500 et 3000
SELECT *
FROM users
WHERE salary BETWEEN 2500 AND 3000;

-- 6.Utilisateurs dont le traavail n'est ni developer ni designer
SELECT *
FROM users
WHERE NOT job IN ('Developer', 'Designer');

-- 7. Utilisateurs triés par ordre alphabétique du nom de famille, puis du prénom.
SELECT *
FROM users
ORDER BY last_name, first_name ASC;

-- 8. Utilisateurs nés avant 1990
SELECT *
FROM users
WHERE birth_date < '1990-01-01';

-- Solution alternative
SELECT *
FROM users
WHERE YEAR(birth_date) < 1990;

-- 9. Utilisateurs nés à Londres ou Berlin et dont le travail est Designer
SELECT *
FROM users
WHERE birth_location IN ('London', 'Berlin') AND job = 'Designer';

-- 10. 10 utilisateurs avec le salaire le plus élevé
SELECT *
FROM users
ORDER BY salary DESC
LIMIT 10;

-- 11. Nom, prénom et age des utilisateurs nés entre 1980 et 1990
SELECT last_name, first_name, age
FROM users
WHERE birth_date BETWEEN '1980-01-01' AND '1990-12-31';

-- 12. Utilisateurs par ordre croissant d'age
SELECT *
FROM users
ORDER BY age ASC;

-- 13. Utilisateurs dont le travail est Doctor et dont le salaire est supérieur à 3000
SELECT *
FROM users
WHERE job = 'Doctor' AND salary > 3000;

-- 14. Utilisateurs triés par lieu de naissance puis salaire
SELECT *
FROM users
ORDER BY birth_location, salary;

-- 15. Utilisateurs nés à Paris et dont le travail est Lawyer
SELECT *
FROM users
WHERE birth_location = 'Paris' AND job ='Lawyer';

-- 16. Salaire le plus bas de tous les utilisateurs en utilisant un alias
SELECT MIN(salary) AS users_min_wage
FROM users;

-- 17. Utilisateurs nés après 1985 dont le travail est Engineer
SELECT *
FROM users
WHERE birth_date > '1985-12-31' AND job ='Engineer';

-- 18. Utilisateurs dont le prénom est John et le nom de famille Doe
SELECT *
FROM users
WHERE first_name = 'John' AND last_name= 'Doe';

-- 19. Les 6 utilisateurs dont le salaire est le plus bas en omettant les 3 premiers résultats
SELECT *
FROM users
ORDER BY salary ASC
LIMIT 6 OFFSET 3;

-- 20. Utilisateurs par ordre croissant d'age, limité aux 5 premiers
SELECT *
FROM users
ORDER BY age ASC
LIMIT 5;

-- Exercice: Utilisation des fonctions d'agrégation
-- 1. Salaire minimum parmi tous les utilisateurs
SELECT MIN(salary) AS users_min_wage
FROM users;

-- 2. Age maximum parmi les utilisateurs ayant le métier Engineer
SELECT MAX(age) AS engineer_max_age
FROM users
WHERE job = 'Engineer';

-- 3. Salaire moyen des utilisateurs dont le métier est Teacher
SELECT AVG(salary) AS teacher_average_wage
FROM users
WHERE job = 'Teacher';

-- 4. Montant total des salaires de tous les utilisateurs
SELECT SUM(salary) AS all_users_wage_sum
FROM users;


-- Exercice: Utilisation du LIKE
-- 1. Utilisateurs ayant un prénom qui commence par "D"
SELECT *
FROM users
WHERE first_name LIKE 'D%';

-- 2. Utilisateurs dont le nom se termine par "son"
SELECT *
FROM users
WHERE last_name LIKE '%son';

-- 3. Utilisateurs dont le prénom contient 5 caractères
SELECT *
FROM users
WHERE first_name LIKE '_____';

-- 4. Utilisateurs ayant "Doctor" dans leur métier
SELECT *
FROM users
WHERE job LIKE '%Doctor%';


-- Exercice: GROUP BY et HAVING 

-- 1.nombre d'utilisateurs par lieu de naissance, mais ne montrez que les lieux avec plus d'un utilisateur
SELECT birth_location, COUNT(*) AS nbUsersByBirthLocation
FROM users
GROUP BY birth_location
HAVING COUNT(*) > 1;

-- 2.Sélectionnez la profession et la moyenne des salaires pour chaque profession, mais ne montrez que celles avec une moyenne de salaire supérieure à 2500
SELECT job, AVG(salary) AS averageWageByJobUpper2500
FROM users
GROUP BY job
HAVING AVG(salary) > 2500;

-- 3.Somme des salaires pour chaque lieu de naissance, mais ne montrez que les lieux dont la somme des salaires est supérieure à 5000
SELECT birth_location, SUM(salary) AS wagesSumByBirthLocationUpper5000
FROM users
GROUP BY birth_location
HAVING SUM(salary) > 5000;

-- 4.Date de naissance et le nombre d'utilisateurs nés à chaque date, mais ne montrez que les dates où il y a plus d'un utilisateur né
SELECT birth_date, COUNT(*) AS nbrOfUsersBornAtTheSameDate
FROM users
GROUP BY birth_date
HAVING COUNT(*) > 1;

-- 5.Profession, le lieu de naissance, et le salaire maximum pour chaque profession et lieu, mais ne montrez que les résultats où le salaire maximum est supérieur à 3000
SELECT job, birth_location, MAX(salary) AS maxWageByJobAndBirthLocationUpper3000
FROM users
GROUP BY job, birth_location
HAVING MAX(salary) > 3000;


-- Exercice Subqueries
-- 1. Utilisateurs nés dans le même lieu que celui du plus jeune utilisateur
SELECT *
FROM users
WHERE birth_location = (SELECT birth_location
						FROM users
                        WHERE age = (SELECT MIN(age)
									FROM users));

SELECT MIN(age)
FROM users;


