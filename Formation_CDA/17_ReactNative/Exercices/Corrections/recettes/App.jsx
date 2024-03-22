import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import CategoriesScreen from './screens/CategoriesScreen'
import MealsShowScreen from './screens/MealsShowScreen'
import MealsDetailsScreen from './screens/MealsDetailsScreen'

// package necessaire navigation :
// npm install @react-navigation/native
// npm install react-native-screens react-native-safe-area-context
// npm i @react-navigation/native-stack

const Stack = createNativeStackNavigator()

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name='Categories' component={CategoriesScreen} options={{title : 'All Categories'}} />
        <Stack.Screen name='MealsShowScreen' component={MealsShowScreen} options={{title : 'Meals Overview'}} />
        <Stack.Screen name='Mealsdetails' component={MealsDetailsScreen} options={{title : 'About the meal'}} />
      </Stack.Navigator>
    </NavigationContainer>
  )
}

const styles = StyleSheet.create({})