# Java DataBase Connectivity

Bases de la relation entre notre programme Java et une base de données.

Permet d'établir la connexion avec la base de données et la création de requêtes SQL.  
C'est une API Java Standard permettant d'interagir avec des bases de données relationnelles.

JDBC dispose d'un ensemble de classes et d'interfaces pouvant être utilisés à partir d'une application Java et de communiquer avec une base de données.

***Dépendances à ajouter dans le POM.xml***
```xml
<dependency>    
    <groupId>mysql</groupId>    
    <artifactId>mysql-connector-java</artifactId>    
    <version>8.0.32</version>
</dependency>
```

## Composants de l'API JDBC

- Java Application
- JDBC API
- JDBC Driver Manager (gère une liste de pilotes pour la bdd, fait correspondre les requêtes de connexion en provenance de l'appli Java)
- JDBC Driver (gère la coummication abec le serveur de la base de données. En pratique, on ne communique pas avec le Driver mais avec le Driver Manager)
- BDD (Oracle, SQL server...)


Objets principaux:
- Driver
- DriverManager
- Connection (interface qui permet de communiquer avec la BDD)
- Statement (soumettre la requête SQL à la base de données, pour exécuter la Query)


## Lecture des résultats

Via un ResultSet qui comporte une méthode next(). Il s'agit d'une sorte de liste des valeurs de nos tables. 






## Lexique:

- DAO: Direct Access Object