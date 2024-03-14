# React Native - Création d'un projet

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

### Packages nécessaires pour la navigation
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

### Structure du NavigatorContainer

Ensuite nous englobons (wrapping) nos différents écrans (screens) dans un composant `NavigationContainer`.

Pour fonctionner, le `NavigationContainer` a besoin de la méthode `createNativeStackNavigator` qui va nous fournir 2 propriétés:
- `Navigator`
- `Screen`

Le composant `NavigationContainer` doit tout englober pour que notre App fonctionne.  

Les Screens sont des composants qu'on différencie des autres composants pour une question de lisibilité. On peut comparer les Screens aux Views en Vue.js.

On appelle toujours un écran par son nom et non pas par le nom de son component. 

Pour naviguer entre les screens, on peut appeler les méthodes `.navigate` ou `.setOptions` qui ont une utilité différente.

#### Exemple de structure

```jsx
import * as React from 'react';
import { View, Text } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

function HomeScreen() {  
return (    
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>      
        <Text>Home Screen</Text>    
    </View>  
    );
}

const Stack = createNativeStackNavigator();

function App() {  
    return (    
        <NavigationContainer>      
            <Stack.Navigator>        
                <Stack.Screen name="Home" component={HomeScreen} />      
                <Stack.Screen name="EcranA" component={ScreenA} options={{title: "Page A"}} />      
                <Stack.Screen name="EcranA" component={ScreenA} options={{headerShown: false}} />      
            </Stack.Navigator>    
        </NavigationContainer>  
    );
}
export default App;
```

## Linking

Linking donne une interface générale pour interagir avec les liens d'application entrants et sortants. Il permet de renvoyer vers une application externe (par exemple, si on clique sur le téléphone, il nous renverra vers l'application téléphone qui nous permetttra de lancer l'appel sans avoir à recopier tout le numéro).

Il existe certains schémas d'URL pour les fonctionnalités de base qui existent sur chaque plate-forme. Ce qui suit est une liste non exhaustive, mais couvre les schémas les plus couramment utilisés.

Type         |                Description                                                | iOS | Android |
|------------|---------------------------------------------------------------------------|-----|---------|
|`mailto`    | Ouvre l'application de messagerie, par exemple : mailto : support@expo.io | X   | X       |
|`tel`       | Ouvre l'application téléphonique, par exemple : tel:+123456789            | X   | X       |
|`sms`       | Ouvre l'application SMS, par exemple : sms:+123456789                     | X   | X       |
|`https/http`| Ouvre l'application du navigateur Web, par exemple : https://expo.io      | X   | X       |


[Documentation Linking](https://reactnative.dev/docs/linking)