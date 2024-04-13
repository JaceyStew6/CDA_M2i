# Activité type 1 : Développer une application sécurisée

## Compétences professionnelles attendues
1. Installer et configurer son environnement de travail en fonction du projet
2. Développer des interfaces utilisateur
3. Développer des composants métier
4. Contribuer à la gestion d'un projet informatique


## 1. Installer et configurer son environnement de travail en fonction du projet
***ECF 2 _ React Native (installation totale à détailler: outils, packages en fonction du besoin...)***

## 2. Développer des interfaces utilisateur
***TP React API Pokemon ou  TP Rick et Morty***

## 3. Développer des composants métier
***ECF 1 ???***

## 4. Contribuer à la gestion d'un projet informatique
***Projet Fil Rouge***

---
---
---
## Description des projets

### 1. Application mobile Pokedex liée à une PokeAPI

#### Description des tâches ou opérations que vous avez effectuées, et dans quelles conditions:

Dans le cadre d'un projet d'étude, il nous a été demandé de créer une application mobile complète avec React Native.

Il s'agit d'une application Pokedex qui permet aux utilisateurs d'obtenir tous les Pokémon existants, d'obtenir des détails à leur sujet et d'ajouter le Pokémon sélectionné à un Pokedex (liste de favoris). Cette application permet à l'utilisateur de rechercher un Pokémon par son nom ou son identifiant. Cette application est basée sur la Pokeapi.

Dans le cadre de ce projet, il a fallu installer tout l'environnement de travail nécessaire, à savoir l'initialisation d'un repositoru GitHub pour la gestion de versions, node, Android Studio ainsi que toutes les dépendances nécessaires au projet.

#### Préciser les moyens utilisés
##### Node
Installation du Node Package Manager (npm) en ligne de commande via un terminal avec les commandes:
  ```sh
  npm install npm@latest -g
  ```
##### JDK et Chocolatey
Installer un JDK (Java SE Development Kit) en version 17 avec Chocolatey qui ajoute automatiquement les variables d'environnement nécessaires sauf une. Powershell doit être ouvert en administrateur
```bash
choco install -y microsoft-openjdk17
```
Si Chocolatey a bien fait son travail, il a dû importer la variable d'environnement `JAVA_HOME`.

##### Android Studio
Installer Android Studio (https://developer.android.com/studio), télécharger et installer le SDK Android, puis configurer un Android Device Manager.

Android Studio va nous permettre d'avoir notre émulateur.
Dans la configuration d'Android Studio, `Android Virtual Device` doit être coché.

Il faut vérifier la présence des variables d'environnement Windows.  
On doit avoir `JAVA_HOME` et `ANDROID_HOME` (cette dernière est à installer manuellement).

##### Virtual Device Manager
Créer et configuer un Virtual Device Manager (dans Android Studio)
On sélectionne le device souhaité à émuler. Pour un téléphone suffisamment grand, on peut choisir le Pixel 8 Pro. 
Installer une image système souhaitée. Actuellement, celle recommandée par React Native est `UpsideDownCake`.

##### Ajouter la variable d'environnement liée à Android Studio
Retourner dans les variables d'environnement.

Ajouter dans les `variables utilisateurs pour Administrateur` la variable d'environnement suivante:

> ANDROID_HOME  
C:\Users\Administrateur\AppData\Local\Android\Sdk

/!\ Attention: la syntaxe est extrêmement importante et pourrait être néfaste si mal rédigée et récupérée !!

/!\ Attention, le chemin n'est pas forcément celui là !!

 Une fois que cet environnement là est installé, on dispose de la base pour lancer notre premier projet. 

##### Installation spécifique au projet
###### Créer un nouveau projet

```bash
npx react-native@latest init NomDuProjet
```

###### Lancer le projet

Avant de lancer le projet, démarrer l'émulateur.

```bash
npx react-native run-android
```

En passant par cette commande, on peut directement ouvrir le projet sur l'émulateur et obtenir le terminal de metro.


###### - Installation des dépendances du projet
Le projet nécessite plusieurs dépendances pour fonctionner. Il est nécessaire de les installer soit dès le début du projet, soit par la suite si on identifie un nouveau besoin. Attention à toujours le faire lorsque l'application est arrêtée.

Pour ce projet, lors de la phase de conception, j'ai identifié deux besoins en termes de navigation:
- Une bottom tab: qui permet d'avoir une barre de navigation fixe au bas de l'écran, permettant de naviguer, par exemple, entre un écran Home et un écran Favoris.
- Une stack: qui permet d'avoir une barre de navigation fixe en haut de l'écran avec une flèche de retour à la page précédente, qui sert par exemple à revenir en arrière depuis le détail d'un Pokemon.

Aussi, pour la bottom tab et la personnalisation des icones pour le menu Home et le menu Favoris, il est nécessaire d'installer une dépendance permettant d'installer des icones. Voici donc les commandes à entrer afin d'installer ces dépendances. 

```bash
npm install @react-navigation/native
```

La commande suivante installera deux dépendances. Elle est recommandée pour un projet fonctionnant sous Expo mais est aussi à installer pour un projet en CLI.
```bash
npm install react-native-screens react-native-safe-area-context
```

```bash
npm i @react-navigation/native-stack
```

Pour installer les dépendances nécessaires à la mise en place d'une barre de navigation en pied de page.
```bash
npm i @react-navigation/bottom-tabs
```

Pour installer les dépendances nécessaires à l'utilisation des icones
```bash
npm install react-native-vector-icons
```

Pour utiliser des icones
Aller dans le fichier suivant: 

`android > app > src > build.gradle`

Ajouter la ligne suivante dans le fichier `build.gradle`

```gradle
apply from: "../../node_modules/react-native-vector-icons/fonts.gradle"
```
Cette ligne permet au build de gradle (gestionnaire de projet) d'aller utiliser un module qui vient de l'extérieur.

**/!\ ATTENTION: faire cette manipulation quand l'appli est arrêtée.**

Aussi, le projet faisant appel à une api externe, afin d'en récupérer les données, il faut utiliser soit la méthode Fetch, qui ne nécessite aucune installation particulière, soit la méthode Axios qui n'est pas native et qui nécessite une installation avec la ligne de commande suivante:

```bash
npm i axios
```

Enfin, étant donné que l'utilisateur peut mettre des pokemon en favoris et les retrouver lors d'une nouvelle ouverture de l'application, il est nécessaire de mettre en place un équivalent au Local Storage de ReactJS qui est ici l'Async Storage.

Afin de l'utiliser, il faut installer la dépendance avec la ligne suivante:

```bash
npm install @react-native-async-storage/async-storage
```

Voici la liste de l'ensemble des dépendances nécessaire pour ce projet:
```json
  "dependencies": {
    "@react-native-async-storage/async-storage": "^1.23.1",
    "@react-navigation/bottom-tabs": "^6.5.20",
    "@react-navigation/native": "^6.1.17",
    "@react-navigation/native-stack": "^6.9.26",
    "@reduxjs/toolkit": "^2.2.1",
    "axios": "^1.6.8",
    "react": "18.2.0",
    "react-native": "0.73.6",
    "react-native-safe-area-context": "^4.9.0",
    "react-native-screens": "^3.29.0",
    "react-native-vector-icons": "^10.0.3",
    "react-redux": "^9.1.0"
  },
```

#### Avec qui j'ai travaillé?
Projet entièrement solo.

#### Contexte
- Nom de l'entreprise, organisme ou association: Centre de formation M2I
- Chantier, atelier, service: ECF 2
- Période d'exercice: Mars 2024

#### Informations complémentaires

---

### 2.

#### Description des tâches ou opérations que vous avez effectuées, et dans quelles conditions:



#### Préciser les moyens utilisés


#### Avec qui j'ai travaillé?

#### Contexte
- Nom de l'entreprise, organisme ou association:
- Chantier, atelier, service:
- Période d'exercice:

#### Informations complémentaires