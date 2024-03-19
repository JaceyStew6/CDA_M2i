import { Platform, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function CategorySquare({ title, color, onPress}) {
  console.log(Platform.OS)
  return (
    <View style={styles.gridItem}>
      <Pressable onPress={onPress} style={({pressed}) => [styles.button, pressed && styles.buttonPressed ]}>
        <View style={[ styles.innerContainer, {backgroundColor : color}]}>
          <Text style={styles.title}>{title}</Text>
        </View>
      </Pressable>
    </View>
  )
}

const styles = StyleSheet.create({
  gridItem : {
    flex : 1,
    margin : 16,
    height : 150,
    borderRadius : 8,
    backgroundColor : "white",
    elevation : 4,
  
},
button : {
    flex : 1,
},
buttonPressed : {
    opacity : 0.5,
},
innerContainer : {
    flex : 1,
    padding : 16,
    borderRadius : 8,
    justifyContent : "center",
    alignItems : "center",
},
title : {
    fontWeight : 'bold',
    fontSize : Platform.OS === 'android' ? 20 : 30,
}
})