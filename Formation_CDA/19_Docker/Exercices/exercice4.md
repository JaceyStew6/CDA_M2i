# Exercice 4

```powershell
# ---------- PARTIE 1 -----------
# Créer une image Docker sur votre machine du jeu 2048
docker search 2048
docker pull evilroot/docker-2048

# Vérifier que l’image est bien présente sur votre machine
docker images

# Résultat 
REPOSITORY             TAG       IMAGE ID       CREATED         SIZE
mysql                  latest    5cde95de907d   2 weeks ago     586MB
maven                  latest    cf3380defcec   3 weeks ago     508MB
nginx                  latest    fffffc90d343   4 weeks ago     188MB
alpine                 latest    a606584aa9aa   4 weeks ago     7.8MB
redis                  latest    9c893be668ac   2 months ago    116MB
openjdk                latest    71260f256d19   17 months ago   470MB
evilroot/docker-2048   latest    09a1a3e342a9   7 years ago     7.47MB

# Lancer ce jeu sur un port disponible au travers d’un conteneur que vous allez appeler «jeu-votre-nom ».
docker run --name jeu_roxane -p 8080:80 -d evilroot/docker-2048

# Vérifier que le conteneur est bien lancé avec la commande adaptée.
docker ps

# Résultat
CONTAINER ID   IMAGE                  COMMAND                  CREATED         STATUS         PORTS                  NAMES
0397b322f400   evilroot/docker-2048   "nginx -g 'pid /tmp/…"   4 seconds ago   Up 4 seconds   0.0.0.0:8080->80/tcp   jeu_roxane

# Créer un second conteneur qui va lancer le même jeu mais avec un nom différent «jeu2-votre-nom »
docker run --name jeu2_roxane -p 8081:80 -d evilroot/docker-2048

# Les 2 jeux sont fonctionnels en même temps sur votre machine, effectuez la commande pour vérifier la présence des conteneurs
docker ps

# Résultat
CONTAINER ID   IMAGE                  COMMAND                  CREATED          STATUS          PORTS                  NAMES
532b412b6d42   evilroot/docker-2048   "nginx -g 'pid /tmp/…"   36 seconds ago   Up 36 seconds   0.0.0.0:8081->80/tcp   jeu2_roxane
0397b322f400   evilroot/docker-2048   "nginx -g 'pid /tmp/…"   5 minutes ago    Up 5 minutes    0.0.0.0:8080->80/tcp   jeu_roxane


# Stopper les 2 conteneurs et assurez-vous que ces 2 conteneurs sont arrêtés.
docker stop jeu_roxane
docker stop jeu2_roxane

docker ps -a

# Résultat
CONTAINER ID   IMAGE                  COMMAND                  CREATED         STATUS                      PORTS     NAMES
532b412b6d42   evilroot/docker-2048   "nginx -g 'pid /tmp/…"   4 minutes ago   Exited (0) 9 seconds ago              jeu2_roxane
0397b322f400   evilroot/docker-2048   "nginx -g 'pid /tmp/…"   9 minutes ago   Exited (0) 14 seconds ago             jeu_roxane

# Relancer le conteneur «jeu2-votre-nom » et aller vérifier dans votre navigateur s’il fonctionne bien. Effectuer la commande pour voir s’il a bien été relancé. Puis stopper le
docker start jeu2_roxane
# ---- il tourne bien dans le navigateur ----

docker ps

# Résultat
CONTAINER ID   IMAGE                  COMMAND                  CREATED         STATUS          PORTS                  NAMES
532b412b6d42   evilroot/docker-2048   "nginx -g 'pid /tmp/…"   7 minutes ago   Up 59 seconds   0.0.0.0:8081->80/tcp   jeu2_roxane

docker stop jeu2_roxane

# Supprimer l’image du jeu 2048 et les conteneurs associés
docker rm jeu2_roxane jeu_roxane
docker rmi evilroot/docker-2048

# Vérifier que les suppressions ont bien été faite
docker ps -a
docker images


# ---------- PARTIE 2 -----------
# Récupérer une image docker nginx
docker pull nginx

# Créer un conteneur en vous basant sur cette image en lui attribuant le nom suivant : « nginx-web»
docker run --name nginx-web -p 8080:80 -d nginx

# Assurez-vous que l’image est bien présente et que le conteneur est bien lancé
docker images
docker ps

# Résultat
CONTAINER ID   IMAGE     COMMAND                  CREATED         STATUS         PORTS                  NAMES
f3e2140f79e3   nginx     "/docker-entrypoint.…"   6 seconds ago   Up 5 seconds   0.0.0.0:8080->80/tcp   nginx-web

# ---- Le serveur est bien lancé au travers du navigateur. Une page web avec «Welcome to nignx » s'affiche bien (voir screenshot) ----

# Effectuer la commande vous permettant de rentrer à l’intérieur de votre serveur nginx
docker exec -it nginx-web sh
# autre possibilité : docker exec -it nginx-web /bin/bash

# - Une fois à l’intérieur, allez modifier la page html par défaut de votre serveur nginx en changeant le titre de la page en : Welcome «votre prenom »
cd /usr/share/nginx/html
apt update
apt upgrade -y
apt install nano -y
nano index.html
exit

# ------------------------ AVEC APACHE ------------------------
# Refaite la même opération mais en utilisant le serveur web apache et donc il faudra créer un autre conteneur
# Récupérer une image docker apache
docker search apache
docker pull httpd

# Créer un conteneur en vous basant sur cette image
docker run --name apache-web -p 8081:80 -d httpd

# Assurez-vous que l’image est bien présente et que le conteneur est bien lancé
docker ps

# Résultat
CONTAINER ID   IMAGE     COMMAND                  CREATED          STATUS          PORTS                  NAMES
4f362f9e86c0   httpd     "httpd-foreground"       7 seconds ago    Up 6 seconds    0.0.0.0:8081->80/tcp   apache-web
f3e2140f79e3   nginx     "/docker-entrypoint.…"   13 minutes ago   Up 13 minutes   0.0.0.0:8080->80/tcp   nginx-web

# ---- Le serveur est bien lancé au travers du navigateur. Une page web avec «It works » s'affiche ----

# Effectuer la commande vous permettant de rentrer à l’intérieur de votre serveur apache
docker exec -it apache-web sh

# - Une fois à l’intérieur, aller modifier la page html par défaut de votre serveur apache en changeant le titre de la page en : Welcome «votre prenom »
# Le chemin est /usr/local/apache2/htdocs mais on se trouve déjà dans le repertoire apache2 (la commande pwd renvoie /usr/local/apache2)
cd htdocs/
apt update
apt upgrade -y
apt install nano -y
nano index.html
exit

# ---------- PARTIE 3 -----------
# Répéter 3 fois la même opération que pour le début de la partie 2, il faudra juste appelez vos conteneurs :
# « nginx-web3 »
# « nginx-web4 »
# « nginx-web5 »
docker run --name nginx-web3 -p 8079:80 -d nginx
docker run --name nginx-web4 -p 8078:80 -d nginx
docker run --name nginx-web5 -p 8077:80 -d nginx

docker ps

# Résultat
CONTAINER ID   IMAGE     COMMAND                  CREATED          STATUS          PORTS                  NAMES
f971364e535e   nginx     "/docker-entrypoint.…"   3 seconds ago    Up 2 seconds    0.0.0.0:8077->80/tcp   nginx-web5
0c2d372bc4f1   nginx     "/docker-entrypoint.…"   8 seconds ago    Up 7 seconds    0.0.0.0:8078->80/tcp   nginx-web4
45a5509c03bc   nginx     "/docker-entrypoint.…"   14 seconds ago   Up 13 seconds   0.0.0.0:8079->80/tcp   nginx-web3
4f362f9e86c0   httpd     "httpd-foreground"       12 minutes ago   Up 12 minutes   0.0.0.0:8081->80/tcp   apache-web
f3e2140f79e3   nginx     "/docker-entrypoint.…"   26 minutes ago   Up 26 minutes   0.0.0.0:8080->80/tcp   nginx-web


# Il faudra faire en sorte que les pages html présente dans les fichiers ci-dessous s’affiche dans chacun des navigateurs en lien avec vos conteneurs :
# html5up-editorial-m2i.zip pour nginx-web3
docker cp "C:\Users\Administrateur\Documents\CDA M2i\CDA_M2i\Formation_CDA\19_Docker\Exercices\Exercice 4\html5up-editorial\." nginx-web3:/usr/share/nginx/html

# html5up-massively.zip pour nginx-web4
docker cp "C:\Users\Administrateur\Documents\CDA M2i\CDA_M2i\Formation_CDA\19_Docker\Exercices\Exercice 4\html5up-massively\." nginx-web4:/usr/share/nginx/html

# html5up-paradigm-shift.zip pour nginx-web5
docker cp "C:\Users\Administrateur\Documents\CDA M2i\CDA_M2i\Formation_CDA\19_Docker\Exercices\Exercice 4\html5up-paradigm-shift\." nginx-web5:/usr/share/nginx/html

# Stopper les containers
docker stop nginx-web3 nginx-web4 nginx-web5

```




