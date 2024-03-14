import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { NavigationContainer } from '@react-navigation/native'
import ContactList from './screen/ContactList'
import ContactDetail from './screen/ContactDetail'


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