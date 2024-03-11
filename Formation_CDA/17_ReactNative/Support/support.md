## React Native

## Installer NodeJS

## Installer Chocolatey 

Ouvrir un Powershell en administrateur

```powershell
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
```

## Installer un JDK (Java SE Development Kit) en version 17. 

Il est recommandé de l'installer avec Chocolatey (ajoute automatiquement les variables d'environnement qui sont nécessaires).  

Attention: Vérifier qu'on a bien un Powershell ouvert en administrateur.

```bash
choco install -y nodejs-lts microsoft-openjdk17
```

Si nodejs est déjà installé:
```bash
choco install -y microsoft-openjdk17
```

Si Chocolatey a bien fait son taf, il a dû importer la variable d'environnement `JAVA_HOME`.

Pour le vérifier:

> Barre de recherche Windows > "environnement" > Modifier les variables d'environnement système > variables d'environnement... > vérifier que JAVA_HOME est présent dans les variables système.

*Attention, la version 17 est actuellement celle recommandée mais bien revérifier dans la documentation officielle pour la version utilisée.*

## Installer Android Studio
https://developer.android.com/studio

Une fois Android Studio installé, télécharger et installer le SDK Android, et configurer notre premier Android Device Manager. 

Android Studio va nous permettre d'avoir notre émulateur. 

> SDK => File/Settings/Appearance & Behavior/System Settings/Android SDK   
Android Device Manager => Tools/Device Manager

*Le SDK, c'est le coeur de l'OS d'un téléphone.*  
*L'émulateur prend 10 Go d'espace disque.*  
*Avoir à minima 4 Go de RAM*

Il faut vérifier la présence des variables d'environnement Windows.  
On doit avoir `JAVA_HOME` et `ANDROID_HOME` (cette dernière est à installer manuellement).

Dans la configuration d'Android Studio, `Android Virtual Device` doit être coché.

## Créer et configuer un Virtual Device Manager (dans Android Studio)

On sélectionne le device souhaité à émuler. Pour un téléphone suffisamment grand, on peut choisir le Pixel 8 Pro. 

Installer une image système souhaitée. Actuellement, celle recommandée par React Native est `UpsideDownCake`.

## Ajouter la variable d'environnement liée à Android Studio

Retourner dans les variables d'environnement.

Ajouter dans les `variables utilisateurs pour Administrateur` la variable d'environnement suivante:

> ANDROID_HOME  
C:\Users\Administrateur\AppData\Local\Android\Sdk

/!\ Attention: la syntaxe est extrêmement importante et pourrait être néfaste si mal rédigée et récupérée !!

/!\ Attention, le chemin n'est pas forcément celui là !!


## Créer un nouveau projet

```bash
npx react-native@latest init NomDuProjet
```

Avant de lancer le projet, démarrer l'émulateur.

## Lancer le projet
```bash
npx react-native run-android
```

En passant par cette commande, on peut directement ouvrir le projet sur l'émulateur et obtenir le terminal de metro.


## Liens
Documentation d'installation:
https://reactnative.dev/docs/environment-setup?guide=native

Lien vers Android Studio:
https://developer.android.com/studio/index.html

Lien vers Chocolatey:
https://chocolatey.org/install