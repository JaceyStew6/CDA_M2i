import { Button, StyleSheet, Text, View, Linking, TouchableOpacity } from 'react-native'
import React, { useLayoutEffect } from 'react'

//Attention à bien destructurer route dans les paramètres de la fonction en mettant des accolades
export default function ContactDetailScreen({ navigation, route }) {
    //On récupère les paramètres passés dans le navigate via route.params et on les utilise pour afficher les détails du contact sélectionné
    const lastname = route.params.lastname
    const firstname = route.params.firstname
    const phoneNumber = route.params.phoneNumber

    //On utilise Linking.openURL dans la fonction handleCallPress() pour ouvrir l'application de téléphone et appeler le numéro de téléphone du contact sélectionné
    function handleCallPress() {
        Linking.openURL(`tel:${phoneNumber}`)
    }

    //On utilise useLayoutEffect pour changer le titre de la page en utilisant les paramètres passés dans le navigate
    useLayoutEffect(() => {
        navigation.setOptions({ title: `${lastname} ${firstname}` })
    }
        , [])

    return (
        //On affiche les détails du contact sélectionné et on utilise handleCallPress() pour appeler le numéro de téléphone du contact
        <View style={styles.container}>
            <View style={styles.first}>
                <Text style={styles.textName}>{firstname} <Text style={styles.textName}>{lastname}</Text></Text>
                <Text style={styles.text}>{phoneNumber}</Text>
            </View>

            {/* On utilise TouchableOpacity afin de créer un élément "pressable" auquel on peut appliquer du style */}

            <View style={styles.second}>
                <TouchableOpacity style={styles.button} onPress={handleCallPress}>
                    <Text style={styles.textButton}>Appeler</Text>
                </TouchableOpacity>
            </View>

        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#1B262C',
        flex: 1,
        paddingTop: 50,
    },

    text: {
        fontSize: 25,
        fontWeight: 'bold',
        textAlign: 'center',
        marginBottom: 10,
        color: '#F39422',
        marginVertical: 40,
    },

    textName: {
        fontSize: 45,
        fontWeight: 'bold',
        textAlign: 'center',
        marginBottom: 10,
        color: '#3282B8',
        marginVertical: 15,
    },

    button: {
        marginVertical: 30,
        backgroundColor: '#0F4C75',
        alignItems: 'center',
        marginHorizontal: 30,
        height: 60,
        justifyContent: 'center',
        borderRadius: 10
    },

    textButton: {
        fontSize: 25,
        fontWeight: 'bold',
        color: 'white'
    },

    first: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
    },

    second: {
        flex: 1,
        justifyContent: 'center',
    }

})