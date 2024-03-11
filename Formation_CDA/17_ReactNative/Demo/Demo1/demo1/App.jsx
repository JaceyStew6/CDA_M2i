import { Image, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function App() {
    return (
        <View style={styles.container}>
            <Image style={styles.myImage} source={{uri: "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/React-icon.svg/539px-React-icon.svg.png"}} />
            <Text style={[styles.textColor, styles.textSize]}>Hello World !!</Text>
        </View>
    )
}

// Attention, ne prend pas en charge d'autres unités que les pixels. On ne peut pas utiliser em, rem, %, etc. pour définir la taille de la police. Vous devez utiliser des pixels.
const styles = StyleSheet.create({
    container: {
        backgroundColor: '#125B85',
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center'
    },
    textColor: {
        color: 'white',
    },
    textSize: {
        fontSize: 30
    },
    myImage: {
        width: 100,
        height: 100,
        margin: 30
    }

})