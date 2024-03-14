import { Button, StyleSheet, Text, View, Linking, TouchableOpacity } from 'react-native'
import React, { useLayoutEffect } from 'react'

//Attention à bien destructurer route dans les paramètres de la fonction en mettant des accolades
export default function ContactDetailScreen({ navigation, route }) {
    const lastname = route.params.lastname
    const firstname = route.params.firstname
    const phoneNumber = route.params.phoneNumber

    function handleCallPress() {
        Linking.openURL(`tel:${phoneNumber}`)
    }

    useLayoutEffect(() => {
        navigation.setOptions({ title: `${lastname} ${firstname}` })
    }
        , [])
    return (
        <View style={styles.container}>
            <Text style={styles.text}>{lastname}</Text>
            <Text style={styles.text}>{firstname}</Text>
            <Text style={styles.text}>{phoneNumber}</Text>
            <TouchableOpacity style={styles.button} onPress={handleCallPress}>
                <Text style={styles.textButton}>Appeler</Text>
            </TouchableOpacity>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: 'lightgrey',
        flex: 1,
        paddingTop: 50,
    },

    text: {
        fontSize: 25,
        fontWeight: 'bold',
        textAlign: 'center',
        marginBottom: 10,
        color: '#13363f',
        marginVertical: 15,
    },

    button: {
        marginVertical: 15,
        backgroundColor: '#29768b',
        alignItems: 'center',
        marginHorizontal: 10,
        height: 60,
        justifyContent: 'center',
        borderRadius: 10
    }

    , textButton: {
        fontSize: 25,
        fontWeight: 'bold',
        color: 'white'
    }

})