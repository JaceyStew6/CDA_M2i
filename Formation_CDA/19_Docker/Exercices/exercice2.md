``` powershell
# On recherche Nginx
docker search nginx

# On installe l'image officielle
docker pull nginx

# On verifie la liste des images présentes
docker images

# On supprime l'image Nginx
docker rmi nginx

# ----------
# On télécharge les images officielles de MySQL et Redis
## MySQL
docker search mysql
docker pull mysql
## Redis
docker search redis
docker pull redis

# On reverifie la liste des images présentes
docker images

# Résultat
REPOSITORY   TAG       IMAGE ID       CREATED        SIZE
mysql        latest    5cde95de907d   2 weeks ago    586MB
alpine       latest    a606584aa9aa   4 weeks ago    7.8MB
redis        latest    9c893be668ac   2 months ago   116MB

# ----------
# Affichage détaillé de l'image de mysql 
docker inspect mysql

# ----------
# Afficher l'historique de l'image MySQL
docker image history mysql

## On peut aussi simplement utiliser l'alias
docker history mysql

# ----------
# On recherche une image, on la télécharge et affiche ses informations
docker search --filter is-official=true java
docker search --filter is-official=true openjdk
docker pull openjdk
docker inspect openjdk
```
