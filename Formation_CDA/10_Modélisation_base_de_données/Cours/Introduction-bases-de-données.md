## Différences SGBDR et SGBD Non relationnel

>**SGBD** = Système de Gestion de Base de Données

- **SGBDR**
    - SQL
    - Structuré en tables
    - Ici on a une relation colonne/valeur
    - Une case = un type de valeur (chaine de caractères, nbr, blob...)
    - La base pourra avoir plusieurs tables dont la relation s'effectue par un système de clés (clé primaire et clé étrangère). La clé étrangère permet de relier une table vers notre enregistrement.
    - Plusieurs types de relation:
        - One to one (ex: un seul prof peut enseigner une seule matière.) 
            - Généralement on indique la clé étrangère des deux côtés dans ce cas
        - One to many 
            - la clé étrangère ne sera que dans le one
        - Many to many 
            - nécessite une table de liaison (jointure) qui va faire la relation
            - une table de jointure peut contenir des attributs

- **SGBD Non-relationnel**
    - NoSQL
    - Non structuré
    - Fonctionne sur un système de clé/valeur
    - A ne pas utiliser pour des données qui peuvent être structurées (ex: données utilisateurs)
    - Permettent aussi de gérer une quantité de données énorme.


Il existe aussi des **BDD en colonne** (ex: Cassandra). L'inconvénient c'est qu'on ne peut pas trier les données facilement. Mais gros avantage pour les datalake ou datawarehouses qui permettent de stocker un grand nombre de données en attente de traitement.

Une même application peut tourner avec plusieurs SGBD qu'ils soient relationnels ou non.


>Le format/type `blob` est l'équivalent du byte mais pour les médias (vidéos, photos...)

>Format `Base64` : Le terme base64 vient à l'origine de l'encodage utilisé pour transférer certains contenus MIME. Les schémas d'encodage en base64 sont *principalement utilisés lorsqu'il s'agit d'enregistrer ou d'envoyer des données binaires* via un média qui a été conçu pour gérer du texte en ASCII.

![Tableau](../1461.png)  
*Tableau base64*


>Règle des 3 v :
>- **Volume** de données considérables à traiter
>- **Vélocité/Vitesse** de création, collecte et partage des données
>- **Variété** d’informations

Il s'agit d'une règle en BigData.


> **Attention à la rigueur en fonction des différents diagrammes.**


## Règles pour le MCD

>Modèle Conceptuel de Données

### Règle 1
- Une relation entre deux entités
### Règle 2
- Deux relations ne peuvent jamais être reliées entre elles.
### Règle 3
- Un attribut est unique à une entité.   
 *exemple : si dans la table `Prof` on a l'attribut nom_prof, ce même attribut ne doit pas se retrouver dans la classe `Cours`.*
### Règle 4
- Les entités ne doivent contenir que des données élémentaires.  
*exemple : on ne doit pas retrouver les données calculées. On peut retrouver un prix, une quantité, une TVA, mais pas un total.*
### Règle 5
- Lorsqu'une relation peut être déduite, elle n'est pas représentée.

Un MCD ne comporte pas de types, ni de clés primaire ou étrangères. 
Il consiste en une représentation simple des tables et des attributs qu'elles contiennent.

Le MCD reste une abstraction de la base et ne permet pas de concevoir les tables avec précision. Il s'agit plutôt ici du modèle fonctionnel des données.


## MLD
>Modèle Logique de Données


## MPD
>Modèle Physique de Données