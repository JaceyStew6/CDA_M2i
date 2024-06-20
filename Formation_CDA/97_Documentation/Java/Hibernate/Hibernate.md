# Hibernate

C'est un framework de mapping objet-relationnel (ORM), qui permet de mapper des objets Java à des bases de données, qui intègre JPA.

Offre une portabilité accrue entre les différents fournisseurs de BDD.

Toutes les représentations d'entités et les liaisons qu'il y a entre elles viennent de JPA.

Hibernate fournit la JPA (Java Persistence API) et la Hibernate Native API. 
Notre ORM utilise JDBC (tout repose dessus).

Hibernate dispose de son propre langage d'interrogation: HQL (proche du JPQL utilisé en JPA).

Hibernate est bien optimisé (bonnes performances) et supporte de nombreuses pas de données (MySQL, PostgreSQL, DB2, FrontBase, Oracle, SQLServer, Sybase, H2 Database...).

Pour fonctionner, Hibernate a besoin de:
- une classe de type javabean (encapsule les données d'une occurence d'une table)
- un fichier de configuration pour les infos de la BDD et le mapping (2 fichiers à placer dans le fichier `ressources`).
    - `hibernate.properties` (contient les principales propriétés pour configurer la connexion JDBC, mais aussi d'autres propriétés)
    - `hibernate.cfg.xml`
- un fichier de correspondance qui configure la correspondance entre la classe et la table (`.hbm.xml`) ou bien l'utilisation des annotations.

Les fichiers `.hbm.xml` sont assez anciens et ne sont plus utilisés dans des projets récents.



Hibernate Entity Manager :  Hibernate + norme JPA  
Hibernate Core : Version plus light sans JPA

Pour faire fonctionner Hibernate, il faut dans notre code:  
>Configuration -> Session Factory -> Session -> Transaction -> Query -> Criteria  
=> permet de faire de la persistance d'objets, grâce à JDBC.

Si on ouvre notre session, grâce à la configuration et si on est en update, il va scanner nos objets et créer toutes les tables associées.

Comme en JPA, on crée notre entité, on la fait persister (avec la méthode `save` ici) et on commit.
La méthode `save` n'a aucune action directe sur la base de données. Il faut réaliser un commit sur la transaction de la classe.

Pour la gestion des ID, on peut utiliser une strategy UUID avec Hibernate.


Il faut bien penser à fermer la session et la session factory à la fin.
Pour chaque besoin, on en crée une et on la ferme.

## Annotations

### @Temporal

L'annotation `@Temporal` est utilisée dans le contexte de la persistance JPA (Java Persistence API) pour préciser le type de mappage temporel d'une entité de date ou de temps. En Java, les types `java.util.Date` et `java.util.Calendar` peuvent représenter une date, une heure, ou les deux. L'annotation `@Temporal` permet de préciser comment ces types doivent être mappés vers la base de données.

Voici les trois valeurs de l'énumération `TemporalType` qui peuvent être utilisées avec `@Temporal` :

- `TemporalType.DATE` : Indique que seule la partie date doit être conservée dans la base de données. L'heure est ignorée.
- `TemporalType.TIME` : Indique que seule la partie heure doit être conservée dans la base de données. La date est ignorée.
- `TemporalType.TIMESTAMP` : Indique que la date et l'heure doivent être conservées dans la base de données.

Dans l'extrait de code fourni, `@Temporal(TemporalType.DATE)` est utilisé avec le champ `dateAchat`, ce qui signifie que seule la partie date de `dateAchat` sera persistée dans la base de données, et la partie heure (si elle existe) sera ignorée.