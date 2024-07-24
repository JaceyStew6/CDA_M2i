# Exercice 6

On souhaite créer une image docker pour distribuer notre site web statique via un serveur web

- Choisir une image de serveur web

- Créer un dockerfile à partir de cette image qui à la place de sa page par défaut montrera votre projet

- Vous noterez la commande pour tester votre image 

Bonus :

- Vous publierez cette image sur docker hub 

## Solution

```dockerfile
# Image choisie: httpd (apache)

# Mon Dockerfile
FROM httpd
LABEL version="0.1"
WORKDIR /usr/local/apache2/htdocs
# COPY . . indique qu'on copie se qui se trouve dans le répertoire courant vers le WORKDIR
COPY . . 
EXPOSE 80

## Le projet web est dans le même répertoire que le dockerfile

# Créer le dockerfile
docker build -t myapache .

# Commande pour tester l'image (prise dans la doc httpd)
docker run -dit --name my-running-app -p 8080:80 myapache

# Publier l'image sur dockerHub
docker login
docker tag myapache jaceystew6/myfirstapacheimg
docker push jaceystew6/myfirstapacheimg

```