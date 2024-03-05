# Firebase

## Création d'un projet dans Firebase

- Créer un projet
- Créer une application
- Récupérer le SDK pour la configuration de l'application dans le dossier `firebaseConfig.js`
- Créer une realtime database dans le projet

## Installation de Firebase dans le projet
### Etapes:

- Télécharger firebase dans l’appli

```bash
npm install firebase
```

- Créer fichier `firebaseConfig.js` à la racine du projet (copier firebaseConfig + ajouter lignes pour connexion à l’URL de la base et exports)


### Exemple de configuration du dossier firebaseConfig.js:

```js
// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
    apiKey: "AIzaSyCOSuEiru67fhwkyjZ3FmjkpE7sS4bmlqY",
    authDomain: "cda-m2i-d98ce.firebaseapp.com",
    projectId: "cda-m2i-d98ce",
    storageBucket: "cda-m2i-d98ce.appspot.com",
    messagingSenderId: "835725518007",
    appId: "1:835725518007:web:11df0ba9bc4a9c8c6a5932",
    databaseUrl:
        "https://cda-m2i-d98ce-default-rtdb.europe-west1.firebasedatabase.app/",
};

export const BASE_DB_URL = firebaseConfig.databaseUrl;

export const SIGN_UP_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=${firebaseConfig.apiKey}`
export const SIGN_IN_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=${firebaseConfig.apiKey}`


// Initialize Firebase
const app = initializeApp(firebaseConfig);

```

*Ajouter les lignes `databaseUrl` et les différents exports, comme l'export de `BASE_DB_URL`, `SIGN_UP_URL` et `SIGN_IN_URL`*
