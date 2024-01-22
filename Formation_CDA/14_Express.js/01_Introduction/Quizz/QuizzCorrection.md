## Exercice Quizz - Réponses

1. **Quel framework est souvent utilisé pour construire des applications web côté serveur en JavaScript ?**
   - **Réponse : a) Express.js**
   - **Explication :** Express.js est un framework web pour Node.js. Il est souvent utilisé pour simplifier le développement d'applications web côté serveur en JavaScript. Node.js, en revanche, est la plateforme côté serveur qui permet l'exécution de JavaScript sur le serveur. 

2. **Quel est le rôle principal de Node.js dans une application web ?**
   - **Réponse : b) Gérer le côté serveur**
   - **Explication :** Node.js est utilisé pour exécuter du code JavaScript côté serveur. Il gère les opérations serveur, telles que la gestion des requêtes HTTP, les accès à la base de données, et autres opérations liées au côté serveur.

3. **Quel module est utilisé pour créer un serveur HTTP de base en Node.js ?**
   - **Réponse : a) http**
   - **Explication :** Le module `http` est intégré à Node.js et est utilisé pour créer un serveur HTTP de base. Il permet de gérer les requêtes et les réponses HTTP.

4. **Express.js est construit au-dessus de quelle bibliothèque Node.js ?**
   - **Réponse : a) HTTP**
   - **Explication :** Express.js est construit au-dessus du module `http` de Node.js. Il simplifie la gestion des routes, des middlewares et fournit une structure pour construire des applications web.
   **ATTENTION: bien que le module http soit utilisé en interne par Express.js, vous n'avez pas besoin de l'installer séparément ou de l'utiliser directement lorsque vous développez avec Express.js.**

5. **Quelle commande permet d'installer Express.js localement dans un projet Node.js ?**
   - **Réponse : a) npm install express**
   - **Explication :** Pour installer Express.js localement dans un projet Node.js, on utilise la commande `npm install express` via le gestionnaire de paquets npm.

6. **Node.js utilise un modèle asynchrone basé sur quoi ?**
   - **Réponse : c) Les deux**
   - **Explication :** Node.js utilise à la fois des callbacks et des Promises pour gérer les opérations asynchrones. À l'origine, il utilisait principalement des callbacks, mais avec l'introduction de Promises et plus récemment des async/await, Node.js prend en charge plusieurs approches pour gérer l'asynchronicité, offrant ainsi une flexibilité accrue dans le code.

7. **Quelle méthode est utilisée pour démarrer un serveur Express.js ?**
   - **Réponse : c) listen()**
   - **Explication :** La méthode `listen()` est utilisée pour démarrer un serveur Express.js et écouter les requêtes sur un port spécifié.

8. **Quel module Node.js est utilisé pour manipuler les chemins de fichiers ?**
   - **Réponse : b) path**
   - **Explication :** Le module `path` de Node.js est utilisé pour manipuler les chemins de fichiers de manière efficace et indépendante du système d'exploitation.

9. **Node.js utilise un gestionnaire de packages. Comment s'appelle-t-il ?**
   - **Réponse : a) npm**
   - **Explication :** npm (Node Package Manager) est le gestionnaire de paquets utilisé avec Node.js. Il facilite l'installation, la gestion et la mise à jour des dépendances d'un projet.

10. **Quel est le rôle de NPM dans le développement Node.js/Express.js ?**
    - **Réponse : a) Gérer les dépendances du projet**
    - **Explication :** NPM est utilisé pour gérer les dépendances d'un projet Node.js/Express.js. Il permet d'installer, de mettre à jour et de gérer les bibliothèques et modules utilisés dans une application.

11. **Quel est le port par défaut sur lequel Express.js écoute ?**
    - **Réponse : a) 3000**
    - **Explication :** Par défaut, Express.js écoute sur le port 3000. Cependant, ce port peut être modifié en spécifiant un autre port lors de l'utilisation de la méthode `listen()`.