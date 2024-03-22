import { Button, Linking, Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useLayoutEffect } from 'react'
import Icon from 'react-native-vector-icons/Feather'

export default function ContactDetail({navigation, route}) {

  const contact = route.params.contact

  useLayoutEffect(() => {
    navigation.setOptions({title: contact.name})
  },[])

  return (
    <View>
      <View>
      <Text>{contact.id}</Text>
    </View>
    <View>
      <Text>{contact.name}</Text>
    </View>
    <View>
      <Text>{contact.username}</Text>
    </View>
    <View>
      <Text>{contact.phone}</Text>
    </View>

    <View>
      <Text>{contact.address.street}</Text>
    </View>
    <View>
      <Text>{contact.address.city}</Text>
    </View>
    <Button title='appeler' onPress={() => Linking.openURL(`tel:${contact.phone}`)} />
    <Pressable onPress={() => Linking.openURL(`tel:${contact.phone}`)}>
        <Icon name="phone-call" size={32} />
    </Pressable>
    </View>
  )
}


// A definir
const styles = StyleSheet.create({})