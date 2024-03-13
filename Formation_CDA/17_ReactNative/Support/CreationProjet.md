# React - Création d'un projet

## Créer un nouveau projet

```bash
npx react-native@latest init NomDuProjet
```

## Lancer le projet

Avant de lancer le projet, démarrer l'émulateur.

```bash
npx react-native run-android
```

En passant par cette commande, on peut directement ouvrir le projet sur l'émulateur et obtenir le terminal de metro.

## La navigation 

```bash
npm install @react-navigation/native
```

```bash
npm install react-native-screens react-native-safe-area-context
```
Cette commande là installera deux dépendances.

Ensuite nous englobons (wrapping) nos différents écrans (screens) dans un composant `NavigationContainer`.

Pour fonctionner, le `NavigationContainer` a besoin de la méthode `createNativeStackNavigator` qui va nous fournir 2 propriétés:
- `Navigator`
- `Screen`


Le composant `NavigationContainer` doit tout englober pour que notre App fonctionne.  

*Voir le cours p26 pour la structure.*