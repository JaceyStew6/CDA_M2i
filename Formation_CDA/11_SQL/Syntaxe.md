## Syntaxe SQL

- LIMIT

```SQL
SELECT DISTINCT first_name, last_name, salary
FROM Users
ORDER BY salary DESC
LIMIT 5;
```

Permet de limiter le nombre de résultats (ici les 5 premiers). `LIMIT` se place à la fin.

- OFFSET

```SQL
SELECT DISTINCT first_name, last_name, salary
FROM Users
ORDER BY salary DESC
LIMIT 5 OFFSET 3;
```

Permet de sauter les 3 premiers résultats et de prendre les 5 suivants.

- ORDER BY

Permet de trier par ordre croissant `ASC` ou décroissant `DESC`