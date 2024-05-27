## ORM

L'ORM a pour but de mapper les classes et va faciliter les relations avec la base.
Diffère du JDBC où il fallait faire toutes les correspondances manuellement.

JPA: Java Persistence API.
C'est une norme (permet de standardiser la communication avec les bases de données) qui est distribuée par un ORM qui fournit JPA, tel qu'Hibernate.

Hibernate fournit JPA et lui apporte des choses complémentaires. Ce n'est pas le cas de tous les ORMs, certains se contentent de d'implémenter JPA tel quel.

Pour utiliser JPA, il faut aller chercher un Entity Manager Factory qui fournit un Entity Manager qui fournit les méthodes pour créer un CRUD complet. Pour savoir quoi mapper, il faut implémenter le fichier `persistence.xml`.

Le fichier `persistence.xml` sert à configurer notre projet et se place dans le dossier `ressources`.
S'il faut mettre un mot de passe dans 

Pour créer une entité, il faut absolument mettre les annotations @Entity et @Id (pour préciser la propriété qui fait office de clé primaire) à minima.

