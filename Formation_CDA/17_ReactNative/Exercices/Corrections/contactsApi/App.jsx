import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { NavigationContainer } from '@react-navigation/native'
import ContactList from './screen/ContactList'
import ContactDetail from './screen/ContactDetail'


// Utilisation de axios :
// npm i install axios

// Pour l'utilisation d'icone :
// npm install react-native-vector-icons
// Dans le fichier
// android/app/build.gradle
// Ajouter la ligne : 
// apply from: "../../node_modules/react-native-vector-icons/fonts.gradle"

// package necessaire navigation :
// npm install @react-navigation/native
// npm install react-native-screens react-native-safe-area-context
// npm i @react-navigation/native-stack


const Stack = createNativeStackNavigator()


export default function App() {
  return (
    <NavigationContainer>
    <Stack.Navigator>
      <Stack.Screen name='ContactListe' component={ContactList} options={{headerShown : false}}/>
      <Stack.Screen name='ContactDetail' component={ContactDetail} />
    </Stack.Navigator>
   </NavigationContainer>
  )
}

const styles = StyleSheet.create({})