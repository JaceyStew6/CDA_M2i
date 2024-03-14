import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import Categories from './screens/Categories'
import RecipesList from './screens/RecipesList'
import RecipesDetails from './screens/RecipesDetails'


const Stack = createNativeStackNavigator()

export default function App() {
    return (
        <NavigationContainer>
            <Stack.Navigator>
                <Stack.Screen name="Categories" component={Categories} options={{title: 'All Categories'}}/>
                <Stack.Screen name="RecipesList" component={RecipesList} />
                <Stack.Screen name="RecipesDetails" component={RecipesDetails} />
            </Stack.Navigator>
        </NavigationContainer>
    )
}

const styles = StyleSheet.create({})