# Test

## Types de tests
3 types de tests:

- Test unitaire
    - Le plus proche du code

- Test d'intégration

- End to end

**TDD**: Test Driven Development. Développement par les tests. On va d'abord écrire les tests avant de développer.  
**BDD**: Behavior Driving Development.


## Test Clean AAA

Arrange - Act - Assert

### Conseils pour écrire un test clean
- Suivre les conventions de nommage
- Eviter des polluer les noms avec des détails techniques
- Utiliser des dénominations fonctionnelles relatives au domaine métier
- Utiliser des noms prononçables
- Pas d'abréviations personnalisées
- Ne pas trop rentrer dans des précisions lors de l'écriture d'un test

## Conventions de dénomination

- GivenWhenThen
- GivenWhen


Dans le code, il faut ajouter la dépendance `junit` au fichier `pom.xml`.

## Frameworks de test

En Java, plusieurs frameworks sont disponibles pour vous aider à créer et à gérer des tests unitaires, d'intégration et fonctionnels.

**JUnit** : C'est le framework de test le plus populaire pour Java. Il est utile pour les tests unitaires et peut être intégré à des outils d'automatisation de construction comme Maven et Gradle.

**Mockito** : Il s'agit d'un framework de simulation (mocking) populaire en Java. Mockito est souvent utilisé en combinaison avec JUnit. Il permet de créer et de gérer des objets fictifs (mocks) pour simuler le comportement de classes et d'interfaces complexes.


## Imports/dépendances

Importer à minima `junit` et `mockito` si on utilise le mocking.

```xml
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>4.11.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-junit-jupiter</artifactId>
            <version>4.11.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

```