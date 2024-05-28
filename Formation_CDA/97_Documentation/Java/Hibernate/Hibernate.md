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
- un fichier de configuration pour les infos de la BDD et le mapping (2 choix de fichier mais préférer le fichier `hibernate.properties`) et le placer dans le fichier `ressources`.
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