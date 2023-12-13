# Installation et initialisation d'un projet Vue
## Initialisation d'un projet Vue

```
npm create vue@latest
```


Propose ensuite plusieurs choses:
- nom du projet
- ajout typescript
- etc

L'appli est alors créée, ainsi que tous les dossiers/fichiers nécessaires à son lancement


## Installer les packages/dépendances

Aller dans le dossier de la nouvelle app créée, puis :

```
npm install
```



/!\ **Bien respecter toutes ces étapes pour initialiser un projet !**


## Lancer une application

```
npm run dev
```

Permet de lancer une appli et de voir sur quel port on peut l'écouter.


**Installer l'extension Volar (Vue Language Features)**  
*Penser à désactiver Vetur si nécessaire afin d'éviter les conflits*

>**Attention à ne pas pusher les modules sur Github. Les mettre en .gitignore!!**

**Ajouter Vue.JS devtools sur le navigateur**


## Préparer une appli pour la mise en production

```
npm run build
```
Tout le code est minifié dans le dossier *dist*.



## Pense-bête

Tous les composants avec une extension `.vue` seront compilés par la suite afin de pouvoir être lus par le navigateur.


### Computed
```js
computed()
```

Permet de créer une variable réactive à partir d'une autre variable réactive.

Signifie que quand une variable réactive est modifiée, la variable sera mise à jour.
Dès qu'on ajoute ou supprime un élément, va permettre de recalculer certaines variables qui vont dépendre d'une autre variable réactive.


### La balise template

La balise `<template>` n'a pas d'incidence sur le DOM, contrairement à une balise `<div>`.