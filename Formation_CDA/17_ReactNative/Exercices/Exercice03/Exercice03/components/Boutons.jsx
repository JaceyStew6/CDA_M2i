import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function Boutons(props) {

    const buttonStyle = props.primary ? styles.primaryButton : styles.secondaryButton;
    const textStyle = props.primaryText ? styles.primaryText : styles.secondaryText;

    return (
        <Pressable onPress={props.onPress} style={({pressed})=> pressed && styles.pressedButton}>
            <View style={buttonStyle}>
                <Text style={textStyle}>{props.text}</Text>
            </View>
        </Pressable>
    )
}

const styles = StyleSheet.create({
    primaryButton: {
        backgroundColor: 'white',
        borderRadius: 50,
        width: 80,
        height: 80,
        justifyContent: 'center',
        margin: 15,
    },
    secondaryButton: {
        backgroundColor: 'grey',
        borderRadius: 20,
        width: 80,
        height: 80,
        justifyContent: 'center',
        margin: 15,
    },
    primaryText: {
        color: 'black',
        fontSize: 30,
        fontWeight: 'bold',
        textAlign: 'center',
    },
    secondaryText: {
        color: 'white',
        fontSize: 30,
        fontWeight: 'bold',
        textAlign: 'center',
    },
    pressedButton: {
        backgroundColor: 'grey',
        borderRadius: 30,
    }
})