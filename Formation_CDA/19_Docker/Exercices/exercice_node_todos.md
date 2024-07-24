# Exercice node todos dockerfile

L'appli est uniquement backend
On ne fait pas de multi staging

Pour faire tourner l'appli, il faut rajouter dans le `package.json`, dans la partie script
```json
    "start": "node app.js"
```
Bien faire attention au port utilisé par l'application et aux endpoints de l'application pour vérifier sur le web qu'elle fonctionne.

Ici le port est 3001 par défaut si l'appli ne trouve pas de variable d'environnement qui s'appelle `PORT`

Puisqu'il y a des `nodes-modules`, on peut rajouter un `.dockerignore`

```dockerfile
FROM node

WORKDIR /usr/src/app

COPY package.json .
COPY package-lock.json .

RUN npm install

COPY . . 

EXPOSE 3001

CMD ["npm","start"]
```

Pour construire l'image et tester son fonctionnement :

```powershell
# Construire l'image 
docker build -t todoapp .

# Tester le fonctionnement de l'app dans un container todoapp1
docker run --name todoapp1 -p 8086:3001 -d todoapp

```

