import { Button, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import AsyncStorage from '@react-native-async-storage/async-storage'

export default function App() {

  const [value,setValue] = useState("")
  const [identity,setIdentity] = useState({firstname : "", lastname: ""})

  // Stockage avec String (chaine de caractéres)

  const addData = async () => {
    try{
      await AsyncStorage.setItem('key',"toto")
    }catch(error){
      console.log(error)
    }
  }

  const recupData = async () => {
    try{
      const value =  await AsyncStorage.getItem('key')
      if(value !== null){
        setValue(value)
      }
    }catch(error){
      console.log(error)
    }
  }

  const deleteData = async () => {
    try{
      await AsyncStorage.removeItem('key')
      setValue('')
    }catch(error){
      console.log(error)
    }
  }


  // Demo avec des Objets

  const addDataObject = async () => {
    try{
      await AsyncStorage.setItem('identity',JSON.stringify({firstname : "tata", lastname: "toto"}))
    }catch(error){
      console.log(error)
    }
  }

  const recupDataObject = async () => {
    try{
      const value =  await AsyncStorage.getItem('identity')
      if(value !== null){
        setIdentity(JSON.parse(value))
      }
    }catch(error){
      console.log(error)
    }
  }

  const deleteDataObject = async () => {
    try{
      await AsyncStorage.removeItem('identity')
      setIdentity({firstname : "", lastname: ""})
    }catch(error){
      console.log(error)
    }
  }

  return (
    <View>
      <Text>Valeur stockée : {value}</Text>
      <Button title='Ajout' onPress={addData}/>
      <Button title='Recup' onPress={recupData}/>
      <Button title='Delete' onPress={deleteData}/>
      <View>
        <Text style={styles.texte}>fistname : {identity.firstname} , lastname : {identity.lastname}</Text>
        <Button title='Ajout' onPress={addDataObject}/>
      <Button title='Recup' onPress={recupDataObject}/>
      <Button title='Delete' onPress={deleteDataObject}/>
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  texte: {
    fontSize: 24
  }
})