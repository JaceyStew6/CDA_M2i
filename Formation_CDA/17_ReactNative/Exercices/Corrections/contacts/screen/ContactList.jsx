import { FlatList, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function ContactList({navigation}) {

  const contacts = [
    {
      "id": 1,
      "nom": "Doe",
      "prenom": "John",
      "telephone": "+1234567890"
    },
    {
      "id": 2,
      "nom": "Smith",
      "prenom": "Alice",
      "telephone": "+1987654321"
    },
    {
      "id": 3,
      "nom": "Johnson",
      "prenom": "Robert",
      "telephone": "+1122334455"
    },
    {
      "id": 4,
      "nom": "Brown",
      "prenom": "Emma",
      "telephone": "+1555098765"
    },
    {
      "id": 5,
      "nom": "Wilson",
      "prenom": "Michael",
      "telephone": "+1443322119"
    },
    {
      "id": 6,
      "nom": "Martinez",
      "prenom": "Sophia",
      "telephone": "+1777888999"
    },
    {
      "id": 7,
      "nom": "Taylor",
      "prenom": "David",
      "telephone": "+1666555444"
    },
    {
      "id": 8,
      "nom": "Anderson",
      "prenom": "Olivia",
      "telephone": "+1100110011"
    }
  ]


  return (
    <View>
      <FlatList
      data={contacts}
      renderItem={(itemData) => {
        return (
          <Pressable onPress={() => navigation.navigate("ContactDetail",{ contact : itemData.item})}>
            <View>
              <Text style={styles.textContact}>{itemData.item.nom}</Text>
            </View>
          </Pressable>
        )
      }}
      />
    </View>
  )
}

const styles = StyleSheet.create({
  textContact: {
    fontSize : 32
  }
})