import { Text, StyleSheet, View, Image } from 'react-native'
import React, { Component } from 'react'

export default class Exercice1 extends Component {
  render() {
    return (
      <View style={styles.container}>
        <View>
          <Image
          style={styles.monImage}
           source={{
            uri: 'https://cdn001.tintin.com/public/tintin/img/characters/le-capitaine-haddock/le-capitaine-haddock.png'
           }}
          />
        </View>
        <View>
          <Text style={styles.monTexte}>Nom : <Text style={styles.info}> Capitaine </Text> </Text>
          <Text style={styles.monTexte}>Prenom : <Text style={styles.info}> Haddock </Text> </Text>
          <Text style={styles.monTexte}>Télephone : <Text style={styles.info}> 01.23.45.67.89 </Text> </Text>
          <Text style={styles.monTexte}>Adresse : <Text style={styles.info}> 35 rue des pias 59200 Tourcoing </Text> </Text>
        </View>
      </View>
    )
  }
}

const styles = StyleSheet.create({
  container: {
    backgroundColor: 'antiquewhite',
    flex : 1,
    alignItems: 'center',
    justifyContent: 'center'
  },
  monImage: {
    width: 150,
    height: 150,
    marginBottom: 50
  },
  monTexte: {
    textAlign: 'left',
    fontSize: 23,
    color: 'black',
  },
  info: {
    fontWeight: 'bold'
  }
})