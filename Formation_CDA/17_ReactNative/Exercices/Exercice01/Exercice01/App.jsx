import { Image, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function App() {
    return (
        <View style={styles.container}>
            <View style={styles.imgContainer}>
                <Image style={styles.myImage} source={{ uri: "https://cdn001.tintin.com/public/tintin/img/characters/le-capitaine-haddock/le-capitaine-haddock.png" }} />
            </View>
            <View style={styles.textContainer}>
                <Text style={styles.text}>Nom:<Text style={styles.textWeight}> Capitaine</Text></Text>
                <Text style={styles.text}>Prénom:<Text style={styles.textWeight}> Haddock</Text></Text>
                <Text style={styles.text}>Téléphone:<Text style={styles.textWeight}> 01.23.45.67.89</Text></Text>
                <Text style={styles.text}>Adresse:<Text style={styles.textWeight}> 35 rue des pias 59200 Tourcoing</Text></Text>
            </View>

        </View>
    )
}

// Attention, ne prend pas en charge d'autres unités que les pixels. On ne peut pas utiliser em, rem, %, etc. pour définir la taille de la police. Vous devez utiliser des pixels.
const styles = StyleSheet.create({
    container: {
        backgroundColor: '#007a67',
        flex: 1,
        justifyContent: 'center',
    },
    text: {
        color: 'white',
        fontSize: 25,
    },
    myImage: {
        width: 100,
        height: 100,
        margin: 30,
        borderRadius: 50
    },
    imgContainer: {
        alignItems: 'center'
    },
    textContainer: {
        marginLeft: 20
    },
    textWeight: {
        fontWeight: 'bold'
    }
})