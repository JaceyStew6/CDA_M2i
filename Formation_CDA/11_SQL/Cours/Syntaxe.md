## Syntaxe SQL

- WHERE

- LIMIT

```SQL
SELECT DISTINCT first_name, last_name, salary
FROM users
ORDER BY salary DESC
LIMIT 5;
```

Permet de limiter le nombre de résultats (ici les 5 premiers). `LIMIT` se place à la fin.

- OFFSET

```SQL
SELECT DISTINCT first_name, last_name, salary
FROM users
ORDER BY salary DESC
LIMIT 5 OFFSET 3;
```

Permet de sauter les 3 premiers résultats et de prendre les 5 suivants.

- ORDER BY

Permet de trier par ordre croissant `ASC` ou décroissant `DESC`

- AS

Par convention, il est recommandé de renommer des résultats avec un **ALIAS** tels que:
```SQL
SELECT MIN(age) AS developer_min_age
FROM users
WHERE job = 'Developer';
```

Un alias peut aussi s'appliquer à des tables.

- **Fonctions d'agrégation**

`MIN()`

`MAX()`

`COUNT()` permet de savoir le nombre de lignes qui correspondent à notre critère.

```SQL
SELECT COUNT(*) AS total_users
FROM users;
```
*Permet de connaitre le nombre d'utilisateurs inscrits sur notre site.*

`SUM()` ne fonctionne qu'avec des nombres

```SQL
SELECT SUM(salary) AS total_salary_without_devs
FROM users
WHERE job != 'Developer';
```

`AVG()` permet de caculer une moyenne.

- GROUP BY

```SQL
SELECT birth_location, SUM(salary) 
FROM users
GROUP BY birth_location;
```
*Sert à calculer la somme des salaires pour chaque lieu de naissance.*

```SQL
SELECT birth_location, AVG(salary) 
FROM users
GROUP BY birth_location
ORDER BY AVG(salary) DESC;
```
*Ordonne les résultats en fonction de la moyenne des salaires.*

- HAVING

`HAVING` c'est comme un `WHERE` mais pour le `GROUP BY`. Il se situe après le GROUP BY.

- LIKE

Permet de filtrer en se basant sur des patterns de texte.

```SQL
SELECT *
FROM users
WHERE birth_location LIKE 'P%';
```
*Permet ici de selectionner tous les utilisateurs dont le lieu de naissance commence par P.*


`%` Correspond à n'importe quelle séquence de caractère, y compris aucune, avec une taille indéterminée.  
`_` Représente exactement un caractère.   
On peut par exemple faire ce pattern : `_a%` qui renverra toutes les valeurs dont la deuxième lettre est "a".


## DDL

### Ordres de gestion de base de données


- Création de la base de données

`CREATE DATABASE nom_bdd`

Peut aussi ecrire `CREATE DATABASE IF NOT EXIST nom_bdd`

- Supprimer une base de données

`DROP DATABASE IF EXIST nom_bdd`

- Modifier une base de données

`ALTER DATABASE`

- Utiliser une base de données

`USE`

> On utilise les mêmes ordres pour les tables

`CREATE TABLE nom_table`  
`DROP TABLE IF EXIST nom_table`

```SQL
CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    job VARCHAR(100),
    birth_date DATE,
    birth_location VARCHAR(30)
)
```

On détermine le nom de la table, les catégories qui prennent un type (`INT`, `VARCHAR`, `DATE`...) ainsi que des contraintes dans certains cas (`NOT NULL`).

### Les contraintes:

- **(NOT) NULL**
- **DEFAULT** : valeur par défaut
- **UNIQUE**
- **CHECK** : vérifie si ce qui rentre correspond à ce qui a été demandé
- **PRIMARY KEY** : clé primaire. Assure l'unicité de chacune de nos données dans la table. Elles garantissent des données uniques.
- **FOREIGN KEY** : clé étrangère
- **INDEX**