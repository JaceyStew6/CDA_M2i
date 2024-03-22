import { FlatList, Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import axios from 'axios'

export default function ContactList({navigation}) {

  const [contacts,setContacts] = useState([])


  useEffect(() => {
    axios.get("https://jsonplaceholder.typicode.com/users")
    .then(response => {
        setContacts(response.data)
    })
    .catch(error => console.log(error))
  },[])
  



  return (
    <View>
      <FlatList
      data={contacts}
      renderItem={(itemData) => {
        return (
          <Pressable onPress={() => navigation.navigate("ContactDetail",{ contact : itemData.item})}>
            <View>
              <Text style={styles.textContact}>{itemData.item.name}</Text>
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