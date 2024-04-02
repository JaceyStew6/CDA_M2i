import { Image, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function ButtonCardPokemon({ onPress, imageUrl, number, name}) {
  return (
    <View>
      <Pressable onPress={onPress}>
            <View>
                <Text>N° {number}</Text>
                <Text>N° {name}</Text>
            </View>
            <View>
                <Image style={styles.img}  source={{
                    uri: imageUrl,
                }}/>
         
            </View>
      </Pressable>
    </View>
  )
}

const styles = StyleSheet.create({
    img: {
        height: 100,
        width:100
    }
})