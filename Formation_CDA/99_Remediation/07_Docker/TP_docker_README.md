# README

## Stack
Base de données : MySQL  
Backend : Java (Spring)  
Frontend : React


## Création des Projets

**Base de données** : pas besoin de dockerfile pour la bdd. Elle est générée par JPA/Hibernate

**Backend** : Dockerfile pour le backend

```dockerfile
FROM maven AS builder 

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn package -DskipTests

FROM openjdk

WORKDIR /app

COPY --from=builder /app/target/TP_Spring_React-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT [ "java","-jar","TP_Spring_React-0.0.1-SNAPSHOT.jar"]
```

**Frontend** : Dockerfile pour le frontend

```dockerfile
FROM maven:amazoncorretto AS builder
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
# Erreur lors de l'exécution cette commande ->
RUN mvn package -DskipTests 

FROM openjdk

WORKDIR /app

COPY --from=builder /app/target/TP_Spring_React-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT [ "java","-jar","TP_Spring_React-0.0.1-SNAPSHOT.jar"]
```

*Ne pas oublier d'ajouter un `.dockerignore`*

### Import des images nécessaires et dockerisation de chaque projet

**Base de données** :
- mysql
- phpmyadmin

**Backend** : 
- maven
- openjdk (java)

**Frontend** :
- node
- nginx


Pour chercher une image, aller soit sur Dockerhub, soit dans le terminal avec les commandes suivantes:

```powershell
# chercher une image par son nom
docker search <nom_image>
# télécharger une image de la liste
docker pull <nom_image>
# vérifier que l'image a bien été téléchargée
docker images

# Résultat de la commande docker images
REPOSITORY   TAG       IMAGE ID       CREATED      SIZE
mysql        latest    7ce93a845a8a   3 days ago   586MB
```

Toutes les images qui doivent être installées
```powershell
REPOSITORY   TAG       IMAGE ID       CREATED         SIZE
phpmyadmin   latest    d333aaf992ca   2 days ago      562MB
mysql        latest    7ce93a845a8a   3 days ago      586MB
node         latest    b966edc80bd3   6 days ago      1.11GB
maven        latest    4998e1a59c2c   4 weeks ago     521MB
nginx        latest    a72860cb95fd   5 weeks ago     188MB
openjdk      latest    71260f256d19   17 months ago   470MB
```


#### Structure du répertoire
  ```
  /repo-github
  ├── backend
  │   ├── Dockerfile
  │   └── ...
  ├── frontend
  │   ├── Dockerfile
  │   └── ...
  └── docker-compose.yml
  ```


### Création d'un fichier `docker-compose.yml`
- À la racine du dépôt, on crée un fichier `docker-compose.yml` pour orchestrer les services (base de données, backend, frontend).


```yml
services:
# Base de données
  db:
    container_name: db
    image: mysql
    volumes:
      - db_data:/var/lib/mysql
    restart: always
    ports:
      - "3307:3306"
    environment:
      MYSQL_ROOT_PASSWORD: Root
      MYSQL_DATABASE: tp_spring_react
    networks:
      - mysql-phpmyadmin-hr
    
# phpmyadmin
  phpmyadmin:
    depends_on:
      - db
    image: phpmyadmin
    restart: always
    ports:
      - "8090:80"
    environment:
      PMA_HOST: db
    networks:
      - mysql-phpmyadmin-hr

# Backend
  spring-docker-container:
    depends_on:
      - db
    container_name: spring_app
    ports:
      - "8080:8080"
    build: 
      context: ./TP_Spring_React
      dockerfile: dockerfile
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://db:3307/tp_spring_react
    networks:
      - mysql-phpmyadmin-hr

# Frontend
  react-nginx-container:
    depends_on:
      - spring-docker-container
    container_name: react-nginx
    build: 
      context: ./TP_Spring_React_Front/hr_management_app
      dockerfile: dockerfile
    ports:
      - "80:80"
    networks:
      - mysql-phpmyadmin-hr


volumes:
  db_data:

networks:
  mysql-phpmyadmin-hr:
```

Afin de lancer la construction des images et du docker-compose, renseigner la commande suivante à la racine du projet:

```powershell
docker compose up -d
```

!!!! En l'état actuel des choses, l'image backend ne se construit pas à cause d'un conflit de version
```
Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project TP_Spring_React: Fatal error compiling: error: release 
version 22 not supported -> [Help 1]
```

---
---
---
<!-- ### 5. Script de Remplissage de la Base de Données
- Fournir un script pour remplir la base de données avec un jeu de données de test.
- Bonus : Ce script doit être exécuté automatiquement lors du démarrage des services via Docker Compose.
- Exemple (script SQL ou script Python).

### 6. Publication des Images Docker sur DockerHub
- Publier les images Docker de chaque projet sur DockerHub.

### 7. Fichier `docker-compose.yml` pour Images DockerHub
- Créer un autre fichier `docker-compose.yml` pour utiliser les images Docker publiées.


### 8. Rédaction des README
- Fournir des README détaillés pour chaque projet (base de données, backend, frontend) expliquant comment construire et exécuter les conteneurs individuellement.
- Fournir un README à la racine du dépôt expliquant comment utiliser les `docker-compose.yml` pour lancer l'application complète.


### Commentaires et Documentation

En plus des README détaillés, ajoutez des commentaires explicatifs dans vos Dockerfile et votre fichier `docker-compose.yml`. Ces commentaires doivent clarifier les étapes de construction, les configurations, et les dépendances entre les services. Par exemple, expliquez les différentes phases dans les Dockerfile, comme l'installation des dépendances et la configuration des variables d'environnement. Cela aidera à comprendre et maintenir le projet plus facilement.

## Livraison
- **Dépôt GitHub** : Lien vers le dépôt GitHub contenant tous les fichiers et README.
- **Images DockerHub** : Liens vers les images Docker publiées sur DockerHub.

Bon courage et bonne dockerisation ! -->
