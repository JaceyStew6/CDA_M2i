## ORM

L'ORM a pour but de mapper les classes et va faciliter les relations avec la base.
Diffère du JDBC où il fallait faire toutes les correspondances manuellement.

### JPA

JPA: Java Persistence API.
C'est une norme (permet de standardiser la communication avec les bases de données) qui est distribuée par un ORM qui fournit JPA, tel qu'Hibernate.

Hibernate fournit JPA et lui apporte des choses complémentaires. Ce n'est pas le cas de tous les ORMs, certains se contentent de d'implémenter JPA tel quel.

Pour utiliser JPA, il faut aller chercher un ***Entity Manager Factory*** qui fournit un ***Entity Manager*** qui *fournit les méthodes pour créer un CRUD complet*. Pour savoir quoi mapper, il faut implémenter le fichier `persistence.xml`.

Le fichier `persistence.xml` sert à **configurer notre projet** et se place dans le dossier `ressources`, dans un sous dossier `META-INF`.

S'il faut mettre un mot de passe dans persistence.xml, préférer plutôt faire un `.env` pour éviter que le mot de passe ne se retrouve poussé par Git par exemple.

Attention!! Il y a un ordre à respecter dans l'appel des classes dans `persistence.xml`, en fonction des classes à appeller en premier pour leur création.


Pour créer une entité, il faut absolument mettre les annotations `@Entity` et `@Id` (pour préciser la propriété qui fait office de clé primaire) à minima.

Aussi, JPA a besoin d'un **constructeur vide** quand on ajoute un objet.



### Relation OneToMany
/!\ Dans une relation OneToMany, la colonne de jointure se met forcément du côté Many.

Exemple:  
>Dans une entreprise, on a des personnes qui travaillent.  
Entreprise: One  
Personne: Many  
On ne met pas la colonne de jointure du côté de l'entreprise, parce qu'autrement, on ne pourra pas indiquer que plusieurs personnes travaillent dans l'entreprise. On aura un seul Id de personne associé à la colonne de jointure et donc à l'entreprise, ce qui n'est pas réaliste.  
*C'est pour cela qu'on met le Many du côté de Personne.*



### Relation bi-directionnelle:  
Si on reprend l'ecemple précédent:  
On peut trouver les informations des personnes à partir de l'entreprise et on peut trouver les informations sur les entreprises à partir des personnes.