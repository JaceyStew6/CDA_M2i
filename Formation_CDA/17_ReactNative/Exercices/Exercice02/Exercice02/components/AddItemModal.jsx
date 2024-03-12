import { Image, Button, Modal, StyleSheet, Text, View, TextInput } from 'react-native'
import React, { useState } from 'react'

export default function AddItemModal(props) {

    return (
        <Modal visible={props.visible}>
            <View>
                <Image
                    style={styles.myImage}
                    source={{ uri: 'https://worldartfoundations.com/wp-content/uploads/2023/06/shopping-cart-icon-512x462-yrde1eu0.png' }}
                    resizeMode='contain' />
                <TextInput onChangeText={text => props.setInputValue(text)} style={styles.inputStyle} placeholder='Saisir un article' />
                <View style={styles.button}>
                    <Button title='Ajouter article' onPress={props.addCourse} />
                    <Button title='Annuler' onPress={props.closeModal} />
                </View>
            </View>
        </Modal>
    )
}

const styles = StyleSheet.create({
    button: {
        margin: 15,
        alignContent: 'space-between',
    },
    inputStyle: {
        borderBottomColor: 'grey',
        borderWidth: 1,
        margin: 15,
        borderRadius: 10,
    },
    myImage: {
        width: 50,
        height: 50,
        margin: 30,
    }
})