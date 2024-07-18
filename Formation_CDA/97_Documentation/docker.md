# Installation

Il faut installer Maven pour pouvoir utiliser docker.

On peut tout de même lancer l'installation sans avoir maven.
Si docker est correctement installé, l'encart `Engine` en bas doit être vert



## Installation de Maven

https://maven.apache.org/download.cgi

Prendre la version .zip 3.9.8

Le dezipper dans `C:\Program Files`

On modifie les variables d'environnement (pour votre compte, pas système)

Créer une nouvelle variable d'environnement :

![Install](InstallMaven.png)
![InstallVariableMaven](VariableEnvironnementMaven.png)

Modifier la variable path  
![VariablePath](ModifierVariablePath.png)


Si Java Home n'est pas présent, il faut également installer la variable d'environnement
![VariableJava](InstallJavaHome.png)

Modifier la variable path  
![VariableJava](ModifierVariablePathJavaHome.png)

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