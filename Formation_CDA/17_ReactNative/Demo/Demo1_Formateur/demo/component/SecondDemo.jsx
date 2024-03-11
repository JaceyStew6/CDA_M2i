import { Button, FlatList, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import TestModal from './TestModal'

export default function SecondDemo() {

  const [modalVisible,setModalVisible] = useState(false)
  const [textInput,setTextInput] = useState('')

  function RecupInput(enteredText){
    console.log(enteredText)
    setTextInput(enteredText)
  }

  const tab = [
    { text: "toto", id: 1},
    { text: "tata", id: 2},
    { text: "tutu", id: 3},
  ]

  function MessageConsole(){
    console.log("Clique sur le bouton")
    setModalVisible(true)
  }

  function closeModal(){
    setModalVisible(false)
  }

  return (
    <View>
      <Text>Ma seconde demo react native</Text>
      <Button title='Mon Bouton' onPress={MessageConsole}/>
      <TestModal visible={modalVisible} closeModal={closeModal}></TestModal>
      <FlatList
        data={tab} 
        renderItem={(itemData) => {
            return (
              <View>
                <Text>{itemData.item.text} {itemData.item.id}</Text>
              </View>
            )
        }}
        keyExtractor={(item,index) => {
          return index;
        }}
        />
        <TextInput onChangeText={RecupInput} value={textInput}/>
    </View>
  )
}

const styles = StyleSheet.create({})