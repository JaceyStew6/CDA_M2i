## TP 2 - Filter - white list

***votre mission :***

- En reprenant notre démo sur le projet Product.
- Il faut créer un filtre qui s'excutera pour chaque requête (même login et register).
- Ce filtre vous permettra de créer une white liste (liste IP autorisée à communiquer avec votre application).
- On pourra ainsi grâce à ce filtre empecher toutes les requêtes qui ne disposent pas d'une IP autorisée. 
- Pour faire la démo, effectuer le test de cette façon : 
        - Mettez le 127.0.0.1 dans votre white liste.
        - Effectuez la communication  avec le projet React et spring, en utilisant l'adresse IP de votre machine et non pas l'adresse de loopback. pour obtenir l'adresse IP de votre machine -> Dans votre terminal executé juste : ipconfig -> puis récupérez ipv4.
        - Exemple : react -> http://192.168.1.191:3000 qui tente de communiquer avec Spring sur le http://localhost:8080. Dans cet exemple le projet react sera bloqué. 
        - Example : react -> http://localhost:3000 qui tente de communiquer avec Spring sur le http://localhost:8080. Dans cet exemple le projet react sera autorisé. 
        - Oubliez pas d'adapter vos CORS pour ne pas avoir de faux blocage.