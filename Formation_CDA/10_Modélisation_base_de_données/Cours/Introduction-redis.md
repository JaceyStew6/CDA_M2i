# Redis

Système de gestion de bases de données non relationnelle qui fonctionne suivant un système de clé-valeur.

C'est une application qu'il faut installer.

Il va stocker les résultats de données dans la RAM en utilisant un sysème de clé-valeur. Il offre un système de persistance permettant de conserver les données plus longtemps, dans le cadre ou la RAM redémarre:
- soit via mécanisme de résilience/de réécriture à partir du mode dégradé via un système de log: mécanisme qui permet de retrouver leur état précédent. Il sauvegarde les actions qui ont permis de stocker les données et non pas les données en elles-même.
- Il utilise également un système de snapshot qui permet de faire une image des données à un instant T.

*On utilise l'un ou l'autre de ces systèmes de persistance en fonction du besoin*.


## Commande pour démarrer Redis dans un conteneur Docker

```bash
docker run -p 6379:6379 -d redis
```


#### Commande Powershell pour visualiser tous les ports sur notre poste:
```bash
netstat
```

#### Commande Powershell pour visualiser tous les ports ouverts sur notre poste:

```bash
netstat -aon
```


## Création d'un projet NodeJS

```bash
npm init
```

On ajoute la ligne `"start": "node index.js"` au sein des `scripts` du *package.json*.

Puis installer le package Redis:

```bash
npm install redis
```

Démarrer avec
```bash
npm start
```


La communication avec Redis et asynchrone. 
Se fait avec une promesse. Il faut donc vérifier que la promesse est bien terminée avant de récuperer les données.

La mise à jour des données se fait à chaque `set`