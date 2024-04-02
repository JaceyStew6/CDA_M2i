import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import { NavigationContainer } from '@react-navigation/native'
import Home from './screen/Home'
import Pokemon from './screen/Pokemon'
import Search from './screen/Search'
import Settings from './screen/Settings'
import Collection from './screen/Collection'
import Icon from 'react-native-vector-icons/Feather'



const Tab = createBottomTabNavigator()

export default function App() {
  return (
    <NavigationContainer>
        <Tab.Navigator screenOptions={{headerShown: false}}>
            <Tab.Screen name='home' component={Home} options={{
                tabBarLabel: 'Accueil',
                tabBarIcon: ({color, size}) => (
                    <Icon size={size} color={color} name="home"/>
                )
            }}/>
            <Tab.Screen name='pokemon' component={Pokemon} options={{ tabBarButton: () => null}} />
            <Tab.Screen name='search' component={Search} options={{
                tabBarLabel: 'Recherche',
                tabBarIcon: ({color, size}) => (
                    <Icon size={size} color={color} name="search"/>
                )
            }} />
            <Tab.Screen name='settings' component={Settings} options={{
                tabBarLabel: 'Configuration',
                tabBarIcon: ({color, size}) => (
                    <Icon size={size} color={color} name="settings"/>
                )
            }} />
            <Tab.Screen name='collection' component={Collection} options={{
                tabBarLabel: 'Ma collection',
                tabBarIcon: ({color, size}) => (
                    <Icon size={size} color={color} name="life-buoy"/>
                )
            }} />
        </Tab.Navigator>
    </NavigationContainer>
  )
}

const styles = StyleSheet.create({})