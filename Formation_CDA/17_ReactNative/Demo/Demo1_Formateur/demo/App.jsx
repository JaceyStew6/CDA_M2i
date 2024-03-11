import { Image, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import Exercice1 from './src/Exercice1'
import SecondDemo from './component/SecondDemo'

export default function App() {
  return (
    // Premiere démo
    // <View style={styles.container}>
    //   <Text style={[styles.monTexte,styles.tailleTexte]}>Hello World !!!</Text>
    //   <Image
    //     style={styles.monImage}

    //     source={{uri: 'https://veto-marcheprime.com/jd/wp-content/uploads/2015/12/vaccination-lapin-1.jpg'}}
    //   />
    // </View>
    // Exercice 1
    // <Exercice1></Exercice1>
    //Seconde démo
    <SecondDemo></SecondDemo>
  )
}

// Mauvaise pratique
// const container = {
//   backgroundColor: "red",
//   flex: 1
// }


const styles = StyleSheet.create({
  container: {
    backgroundColor: "blue",
    flex: 1,
    padding: 20
  },
  monTexte: {
    margin: 10,
    color: 'white'
  },
  tailleTexte: {
    fontSize: 32
  },
  monImage : {
    width: 100,
    height: 100,
    margin: 30
  }
})

