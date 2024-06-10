# J2EE (Java Enterprise Edition)

Nouveau nom de JEE:
Jakarta Enterprise Edition.

JSE permet essentiellement de travailler sur notre poste personnel. A l'inverse, J2E permet de travailler avec des requêtes qui viennent de l'extérieur (avec des api par exemple).


Attention, faire du J2EE avec la version Community d'IntelliJ est très compliqué. Il est vraiment préférable d'avoir la version Ultimate.

## Tomcat

https://tomcat.apache.org/download-10.cgi

Il est nécessaire d'installer Tomcat 10 (télécharger la version core .zip)
Une fois que le dossier est dezippé, on peut ouvrir notre IDE et créer un nouveau projet.
Sélectionner un projet Jakarta EE
Choix à faire lors de la création du projet:
- Template: Web Application
- Application Server -> New -> Tomcat -> Choisir le dossier issu de l'installation de Tomcat.  
Next  
Vient ensuite le choix des dépendances.
- Servlet est nécessaire.

Une fois que le projet s'ouvre, cliquer que `Load Maven Project` sur la fenêtre pop up en bas à droite.

Pour s'assurer que Tomcat est bien associé, on a le logo Tomcat en haut à doite.

## Architecture J2EE

Serveur d'application: TOMCAT
- Couche web
    - Modèle (Java Beans) : Ce sont des entités (POJO) qui sont des classes Java, telles que celles utilisées en JPA.
    - Vue (JSP) : renvoie les données brutes au client et formate l'affichage
    - Contrôleur (Servlet) : reçoit la demande/requête de la part du client
- Spring

Attention, le contrôleur n'est pas forcément obligé de passer par un modèle ou d'aller piocher en base de données et peut donc directement renvoyer à la vue.

Il faut construire le projet et le donner à un serveur d'applications qui va être chargé de le faire fonctionner. Avec cela sont venus des problèmes de compatibilité. Le framework Spring permet de pallier à ces problèmes de compatibilité. Il permet de tout empacter dans un même framework.


## Servlet

C'est un composant logiciel écrit en Java fonctionnant du côté serveur.
Permet de gérer des requêtes HTTP et de fournir au client une réponse HTTP.

On effectue le traitement côté serveur (contrairement à Javascript qui s'éxécute côté client).

C'est une classe Java qui aura 2 méthodes essentielles:
- `doGet()`
- `doPost()`

Servlet contient aussi une méthode `init()`.

On créera nos propres servlet pour répondre à des requêtes HTTP.

Le serveur d'application fait le lien entre le moteur de Servlet et le conteneur de Servlet.

### API Servlet

On implémente des interfaces `Servlet` et `ServletConfig` grâce à la classe abstraite `GenericServlet`. On peut étendre cette classe pour construire des Servlets propre au protocole HTTP, grâce à la classe `HttpServlet`.




---
Dans le projet, le dossier `webapp` est la racine de notre projet.
