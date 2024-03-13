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

La commande suivante installera deux dépendances. Elle est recommandée pour un projet fonctionnant sous Expo.
```bash
npm install react-native-screens react-native-safe-area-context
```

Ensuite nous englobons (wrapping) nos différents écrans (screens) dans un composant `NavigationContainer`.

Pour fonctionner, le `NavigationContainer` a besoin de la méthode `createNativeStackNavigator` qui va nous fournir 2 propriétés:
- `Navigator`
- `Screen`

Le composant `NavigationContainer` doit tout englober pour que notre App fonctionne.  

Les Screens sont des composants qu'on différencie des autres composants pour une question de lisibilité. On peut assimiler les Screens aux Views en Vue.js.


### Structure du NavigatorContainer

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
            </Stack.Navigator>    
        </NavigationContainer>  
    );
}
export default App;
```