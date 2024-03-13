import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import Calculatrice from './components/Calculatrice'

export default function App() {
  return (
    <View style={styles.container}>
      <Calculatrice></Calculatrice>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'black',
  }
})