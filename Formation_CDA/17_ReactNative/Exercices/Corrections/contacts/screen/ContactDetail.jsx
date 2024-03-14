import { Button, Linking, StyleSheet, Text, View } from 'react-native'
import React, { useLayoutEffect } from 'react'

export default function ContactDetail({navigation, route}) {

  const contact = route.params.contact

  useLayoutEffect(() => {
    navigation.setOptions({title: contact.nom})
  },[])

  return (
    <View>
      <View>
      <Text>{contact.id}</Text>
    </View>
    <View>
      <Text>{contact.nom}</Text>
    </View>
    <View>
      <Text>{contact.prenom}</Text>
    </View>
    <View>
      <Text>{contact.telephone}</Text>
    </View>
    <Button title='appeler' onPress={() => Linking.openURL(`tel:${contact.telephone}`)} />
    </View>
  )
}


// A definir
const styles = StyleSheet.create({})