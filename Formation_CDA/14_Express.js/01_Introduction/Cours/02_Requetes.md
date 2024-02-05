# Décortiquons les requêtes

Nous allons travailler autour d’une application back-end. Cela signifie que nous allons travailler sur une application qui **reçoit des requêtes** et en retourne **des réponses**.

Avant de construire nos réponses, il nous faut comprendre les requêtes que nous allons recevoir. Certains outils comme Postman nous permettent de créer des requêtes très facilement.

Une requête HTTP (Hypertext Transfer Protocol) est un message que votre navigateur envoie à un serveur web pour demander des informations. Les requêtes HTTP sont essentielles pour la communication entre les clients (comme les navigateurs web) et les serveurs web. Une requête HTTP est généralement constituée de plusieurs parties. Voici les principales composantes d'une requête HTTP :

1. **Ligne de requête (Request Line) :**
    - La première ligne d'une requête HTTP contient trois parties principales :
        - **Méthode HTTP :** Indique le type d'action que le client souhaite effectuer. Les méthodes couramment utilisées incluent GET, POST, PUT, DELETE, etc.
        - **URI (Uniform Resource Identifier) ou URL (Uniform Resource Locator) :** Identifie la ressource demandée. Par exemple, "https://www.example.com/page".
        - **Version HTTP :** Indique la version du protocole HTTP utilisée, telle que HTTP/1.1.
    
    Exemple :
    
    ```
    GET /page HTTP/1.1
    
    ```
    
2. **En-têtes (Headers) :**
    - Les en-têtes fournissent des informations supplémentaires sur la requête, telles que le type de contenu accepté par le client, le type de compression supporté, etc.
    
    Exemple :
    
    ```
    Host: www.example.com
    Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
    
    ```
    
3. **Corps de la requête (Request Body) :**
    - Certaines méthodes HTTP, comme POST et PUT, peuvent inclure un corps de requête qui contient les données à envoyer au serveur. Par exemple, lors de l'envoi d'un formulaire, les données du formulaire peuvent être incluses dans le corps de la requête.
    
    Exemple :
    
    ```
    POST /submit-form HTTP/1.1
    Content-Type: application/x-www-form-urlencoded
    
    username=johndoe&password=secret
    
    ```
    
4. **Paramètres de requête (Query Parameters) :**
    - Pour les requêtes GET, les paramètres peuvent être inclus dans l'URL pour spécifier des valeurs particulières. Ils suivent le point d'interrogation et sont séparés par des ampersands.
    
    Exemple :
    
    ```
    GET /search?q=example&category=web&page=1 HTTP/1.1
    
    ```
    

Ces composants travaillent ensemble pour former une requête HTTP complète. Il est important de noter que la structure exacte d'une requête peut varier en fonction de la méthode HTTP utilisée et des besoins spécifiques de la requête.