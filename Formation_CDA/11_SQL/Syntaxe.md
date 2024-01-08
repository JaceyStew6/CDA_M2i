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

Par convention, il est recommander de renommer des résultats avec un ALIAS tels que:
```SQL
SELECT MIN(age) AS developer_min_age
FROM users
WHERE job = 'Developer';
```

- MIN(), MAX(), COUNT(), SUM()

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