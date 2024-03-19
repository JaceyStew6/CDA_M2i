import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Provider } from 'react-redux'
import { store } from './store/redux/store'
import MyId from './component/MyId'
import { NavigationContainer } from '@react-navigation/native'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import Form from './component/Form'


// Pour l'utilisation de redux :
// npm i @reduxjs/toolkit react-redux

// package necessaire navigation :
// npm install @react-navigation/native
// npm install react-native-screens react-native-safe-area-context
// npm install @react-navigation/bottom-tabs

const Tab = createBottomTabNavigator()

export default function App() {
  return (
    <Provider store={store}>
    {/* <View>
      <Text>App</Text>
      <MyId />
    </View> */}
    <NavigationContainer>
      <Tab.Navigator>
        <Tab.Screen name='Home' component={MyId}/>
        <Tab.Screen name='Form' component={Form} />
      </Tab.Navigator>
    </NavigationContainer>
    </Provider>
  )
}

const styles = StyleSheet.create({})