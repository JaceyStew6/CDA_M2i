# Exercice 5

- Création d'un volume nommé 

```
docker volume create mywebsite
```

- Création d'un conteneur serveur web avec nginx et utilisation du volume cree pour stocker votre site web.

```
docker run -d -p 5000:80 --name serveur-nginx -v mywebsite:/usr/share/nginx/html nginx
docker cp C:\Users\Administrateur\Desktop\mywebsite\. serveur-nginx:/usr/share/nginx/html
```

- confirmation via votre navigateur 

```
http://localhost:5000
```

- suppression de votre conteneur nginx

```
docker stop serveur-nginx
docker rm serveur-nginx
```

- Création d'un conteneur serveur web avec apache qui utilisera le site web présent dans votre volume.

```
docker run -d -p 5000:80 --name serveur-apache -v mywebsite:/usr/local/apache2/htdocs httpd
```