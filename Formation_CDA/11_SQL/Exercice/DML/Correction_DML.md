*Ceci est l'exercice présent sur le support mis sous une forme Markdown*

### <span style="color:orange">Exercice: Résumé sur le langage DML</span>
<br />

Considérez la table "Students" avec les colonnes suivantes :
```sql

CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age INT,
    grade VARCHAR(10)
);
```

**Partie 1: INSERT INTO**

Ajoutez trois nouveaux étudiants à la table:
```
Prénom: Maria, Nom: Rodriguez, Âge: 21, Note: B
Prénom: Ahmed, Nom: Khan, Âge: 19, Note: A
Prénom: Emily, Nom: Baker, Âge: 22, Note: C
```

**Partie 2: UPDATE**

Mettez à jour la note de l'étudiant ayant le prénom "Maria" pour la changer de "B" à "A".

Augmentez l'âge de tous les étudiants de 1 an.



**Partie 3: DELETE**

Supprimez l'étudiant ayant le prénom "Emily" de la table.
Supprimez tous les étudiants dont l'âge est inférieur à 20 ans.

**Partie 4: TRUNCATE**

Videz complètement la table "Students" en utilisant la commande TRUNCATE.

### <span style="color:orange">Correction</span>

```sql
-- Partie 1: INSERT INTO
INSERT INTO Students (student_id, first_name, last_name, age, grade)
VALUES
    (1, 'Maria', 'Rodriguez', 21, 'B'),
    (2, 'Ahmed', 'Khan', 19, 'A'),
    (3, 'Emily', 'Baker', 22, 'C');

-- Partie 2: UPDATE
UPDATE Students
SET grade = 'A'
WHERE first_name = 'Maria';

UPDATE Students
SET age = age + 1;

-- Partie 3: DELETE
DELETE FROM Students WHERE first_name = 'Emily';
DELETE FROM Students WHERE age < 20;
TRUNCATE TABLE Students;

```