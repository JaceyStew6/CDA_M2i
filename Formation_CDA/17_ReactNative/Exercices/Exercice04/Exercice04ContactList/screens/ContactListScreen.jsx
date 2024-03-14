import { StyleSheet, Text, View, FlatList, TouchableOpacity } from 'react-native'
import React from 'react'
import contactList from '../data/contactList'


export default function ContactListScreen({navigation}) {
    return (
        <View style={styles.container}>
            <Text style={styles.title}>Contacts</Text>
            <FlatList
                data={contactList}
                renderItem={(itemData) => {
                    return (
                        <TouchableOpacity style={styles.button} onPress={() => navigation.navigate("ContactDetail",{ lastname: itemData.item.lastname, firstname: itemData.item.firstname, phoneNumber: itemData.item.phoneNumber})}>
                            <View>
                                <Text style={styles.text}>{itemData.item.lastname} {itemData.item.firstname}</Text>
                            </View>
                        </TouchableOpacity>

                    )
                }}
                keyExtractor={(item, index) => {
                    return index;
                }}
            />
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: 'lightgrey',
        flex: 1,
        paddingTop: 10,
    },

    button: {
        padding: 10,
        marginVertical: 15,
        backgroundColor: '#29768b',
        alignItems: 'center',
        marginHorizontal: 10,
        height: 60,
        justifyContent: 'center',
        borderRadius: 10
    },

    text: {
        fontSize: 25,
        fontWeight: 'bold',
        color: 'white'
    },

    title: {
        fontSize: 30,
        fontWeight: 'bold',
        textAlign: 'center',
        marginBottom: 10,
        color: '#13363f'
    }
})