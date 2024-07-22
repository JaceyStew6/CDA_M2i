# Docker


[Installation](https://www.docker.com/products/docker-desktop/)

## Bases

Va servir lors du déploiement d'applications et va répondre également à une problématique que les devs ont: uniformiser un environnement de développement, avec une base unique pour faire tourner un projet. Il résout la problématique du fameux "ça marche sur mon poste".

Il peut être installé sur tous types de distribution : Windows, Linuw, MacOS

## Différences conteneur et VM

Les conteneurs et les machines virtuelles sont des technologies qui rendent vos applications indépendantes des ressources de votre infrastructure informatique. Un conteneur est un paquet de code logiciel contenant le code d'une application, ses bibliothèques et d'autres dépendances. La conteneurisation rend vos applications portables afin que le même code puisse être exécuté sur n'importe quel appareil. Une machine virtuelle est une copie numérique d'une machine physique.

Les conteneurs et les machines virtuelles sont tous deux des technologies de déploiement. Dans le cycle de vie du développement logiciel, le déploiement est le mécanisme qui permet à une application de fonctionner efficacement sur un serveur ou un appareil. L'application nécessite plusieurs composants logiciels supplémentaires appelés dépendances qui sont étroitement liés au système d'exploitation sous-jacent du serveur. Toutes ces différentes couches logicielles entre le code d'application et le dispositif physique sont appelées l'environnement d'application.

### Les machines virtuelles

Historiquement, la technologie des machines virtuelles a été développée pour utiliser efficacement la capacité matérielle physique et la puissance de traitement croissantes. L'exécution d'un environnement d'application unique sur un seul serveur physique sous-exploite les ressources matérielles. Les machines virtuelles permettent aux organisations d'installer plusieurs systèmes d'exploitation et de créer plusieurs environnements sur la même machine physique.

### Les conteneurs

Les conteneurs ont été créés pour empaqueter et exécuter des applications de manière prévisible et répétable dans plusieurs environnements. Au lieu de recréer l'environnement, l'application est packagée pour fonctionner sur tous les types d'environnements physiques ou virtuels. Cela revient à mettre un astronaute dans une combinaison spatiale au lieu de recréer l'atmosphère de la Terre pour lui sur une autre planète.


![ComparaisonDockerVsVM](docker-avantages-800x453.jpg)

[Comparaison container et VM](https://aws.amazon.com/fr/compare/the-difference-between-containers-and-virtual-machines/#:~:text=Un%20conteneur%20est%20un%20paquet,num%C3%A9rique%20d'une%20machine%20physique.)

## Installation

Il faut installer Maven pour pouvoir utiliser docker.

On peut tout de même lancer l'installation sans avoir maven.
Si docker est correctement installé, l'encart `Engine` en bas doit être vert.

Docker et l'ensemble des conteneurs créés tournent sur un même noyau Linux.

Linux est juste un noyau autour duquel gravite un GNU. Ensemble ils forment un système d'exploitation.


## Installation de Maven

https://maven.apache.org/download.cgi

Prendre la version .zip 3.9.8

Le dezipper dans `C:\Program Files`

On modifie les variables d'environnement (pour votre compte, pas système)

Créer une nouvelle variable d'environnement :

![Install](InstallMaven.png)
![InstallVariableMaven](VariableEnvironnementMaven.png)

Modifier la variable path  
![VariablePath](ModifierVariablePathJavaHome.png)


Si Java Home n'est pas présent, il faut également installer la variable d'environnement
![VariableJava](InstallJavaHome.png)

Modifier la variable path  
![VariableJava](ModifierVariablePath.png)

On vérifie dans un terminal que Maven est bien installé avec la commande:
```powershell
mvn --v
```

Pour vérifier que Docker tourne, on rentre la commande
```powershell
docker ps
```

![Verif](VerifVersionMavenEtContainerDockerBienLancé.png)

Interface Docker 

![InterfaceDocker](InterfaceDocker.png)


## SonarQube

Par défaut, le mot de passe dans localhost est admin

## Docker Daemon

Equivalent des services sur Linux, qui correspond aux différentes commandes qu'on lui donne.

Attention, il faut que Docker Desktop soit démarré pour qu'il reconnaisse les services et commandes.


## Fonctionnement de Docker

### Client

#### Commandes

`Docker build`  
`Docker pull`  
`Docker run`

### DOCKER_HOST

Docker repose sur un système d'images et de containers.
Il repose sur un Docker daemon qui va interroger un docker registry afin d'aller prendre l'image nécessaire, si elle n'est pas déjà disponible et va ensuite pouvoir l'utiliser pour créer un container.

Il y a des images de base existantes (ex: Alpine, CentOS, Ubuntu, Debian, Linux Mint, Redhat...) mais comprennent en plus les logiciels qu'on veut installer (ex: MySQL, Postgre...). Il s'agit en réalité d'une configuration prête à être utilisée. A partir de cette image/configuration, on peut créer un container.

>Un container est lancé à partir d'une image.  
Une image est un package qui inclut les fonctionnalités nécessaires à l'exécution de notre processus.

On peut créer une image de deux façons:
- à partir d'un conteneur (pas la façon la plus recommandée)
- à partir d'une fichier DockerFile

### Docker Registry

C'est un système de stockage, de versionning et de distribution d'images Docker.
Repose sur DockerHub.

[DockerHub](https://hub.docker.com/)


## Commandes
`docker images` : lister les images sur la machine  
`docker search` : chercher une image sur le hub docker  
`docker pull nom_image` : télécharger une image à partir du hub  
`docker run` : exécuter une image. Lui indiquer quelle image on veut utiliser  
`docker rmi nom_image` : supprimer une image  
`docker ps` : n'affiche que les containers qui sont en train de tourner (containers qui font tourner un service)
`docker ps -a` : affiche que les containers qui ont tourné et se sont arrêtés

Attention, on ne peut pas supprimer tout de suite une image qui est liée à un container. On doit d'abord supprimer le container qui y est lié

**Exécuter une image**
![DockerRun](dockerRun.png)


**Afficher les containers qui ont tourné et se sont arrêtés**
![DockerPs-a](dockerPS-a.png)

**Chercher une image**
![DockerSearch](dockerSearch.png)

**Importer une image**
![DockerPull](dockerPull.png)

**Supprimer une image**
![DockerRmi](dockerRmi.png)

**Forcer l'ouverture d'un terminal Linux**
![DockerRun-it](dockerRun-it.png)

![DockerPs](dockerPs.png)

Tant que le terminal Linux tourne, le container lié à l'image Alpine tournera aussi.


## Commandes Linux globales

```bash
# Afficher le répertoire actuel
pwd

# Avoir une liste avec un détail et les dossiers cachés
ls -la

# Afficher le manuel d'une commande. Exemple avec ls
ls -man

# Afficher le statut/utilisateur
whoami

# Changer de répertoire
cd home/ #chemin relatif. Démarre de là où on se trouve
cd /home #chemin absolu. Démarre de la racine

# Remonter à la racine (répertoire parent)
cd ..

# Créer un nouveau répertoire
mkdir mon_repertoire

# Créer un nouveau fichier
touch text.txt

# Déplacer mon fichier dans mon répertoire
mv text.txt mon_repertoire/

# Lister ce qui se trouve dans mon répertoire
ls mon_repertoire/

# Supprimer un fichier
rm mon_repertoire/text.txt

# Supprimer un répertoire vide
rm mon_repertoire/

# Supprimer un répertoire et son contenu
rm -r mon_repertoire/

# ------------------------
# Gestionnaires de package (diffèrent en fonction de la distribution)
apt
# ou
apk

# Utilisation de nano
nano test.txt # crée le fichier s'il n'existe pas
## Dans nano, le ^ pour les raccourcis équivaut à la touche ctrl qu'il faut utiliser

# Lire ce qui se trouve dans un fichier
cat test.txt
```

Attention, il ne faut généralement jamais se connecter en tant que root sur une machine Linux. Sur un container, ce n'est pas gênant, en revanche, sur une vraie machine Linux, il faut éviter.

### Gestionnaire de package et mise à jour de la distribution
**apk**

![apk](apk.png)


**Installer Nano**
![apkNano](apkAddNano.png)


**Mettre a jour l'OS**
![apkUpdateUpgrade](apkUpdateUpgrade.png)


### Transférer un fichier de mon container Docker à ma machine locale

```powershell
# On renseigne le nom du container, ce qu'on va chercher et là où on veut le récupérer
docker cp distracted_mclaren:/root/test.txt "C:\Users\Administrateur\Desktop"
# docker cp nom_container:/route/fichierarecuperer.extension cheminRepertoireDestination
```

![dockerCp](dockerCp.png)