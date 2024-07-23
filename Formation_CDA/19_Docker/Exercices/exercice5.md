# Exercice 5

```powershell
# Création d'un volume nommé 
docker volume create neutrino

# Création d'un conteneur serveur web avec nginx et utilisation du volume cree pour stocker votre site web
docker run -v neutrino:/usr/share/nginx/html --name science_thing -d -p 8082:80 nginx 

# Confirmation via votre navigateur : OK

# Ajout d'un site web
docker cp "C:\Users\Administrateur\Documents\CDA M2i\CDA_M2i\Formation_CDA\19_Docker\Exercices\Exercice 4\html5up-massively\." science_thing:/usr/share/nginx/html

# Suppression de votre conteneur nginx
docker stop science_thing #si le container est en train de tourner
docker rm science_thing

# Création d'un conteneur serveur web avec apache qui utilisera le site web présent dans votre volume.
docker run -v neutrino:/usr/local/apache2/htdocs --name new_science_thing -d -p 8083:80 httpd

```
