import { StyleSheet, Text, View, FlatList, TouchableOpacity } from 'react-native'
import React, { useEffect, useState } from 'react'
import axios from 'axios'


export default function ContactListScreen({navigation}) {

    const [contacts, setContacts] = useState([])

    useEffect(() => {
        getContacts();
    }, []);

    function getContacts() {
        axios.get('https://jsonplaceholder.typicode.com/users')
        .then(response => setContacts(response.data))
        .catch(error => console.error(error))
    }


    return (
        <View style={styles.container}>
            <Text style={styles.title}>Contacts</Text>
            {/* On utilise FlatList pour afficher la liste des contacts présents dans contactList.json qu'on a importé */}
            <FlatList
                //On passe les données à afficher dans data
                data={contacts}
                //On utilise renderItem pour afficher chaque contact
                renderItem={(itemData) => {
                    return (
                        //Attention à bien passer les paramètres dans le navigate. 
                        //L'appel des paramètres peut être optimisé en utilisant ...itemData.item et en appelant un objet global, puis en destructurant les paramètres dans le composant ContactDetailScreen. Cela permet de mieux gérer les paramètres et de ne pas avoir à les passer un par un.
                        <TouchableOpacity style={styles.button} onPress={() => navigation.navigate("ContactDetail",{ contact: itemData.item})}>
                            <View>
                                <Text style={styles.text}>{itemData.item.name} {itemData.item.username}</Text>
                            </View>
                        </TouchableOpacity>

                    )
                }}
                //On utilise keyExtractor pour donner une clé unique à chaque élément de la liste
                keyExtractor={(item, index) => {
                    return index;
                }}
            />
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#1B262C',
        flex: 1,
        paddingTop: 20,
    },

    button: {
        padding: 10,
        marginVertical: 15,
        backgroundColor: '#0F4C75',
        alignItems: 'center',
        marginHorizontal: 10,
        height: 'auto',
        justifyContent: 'center',
        borderRadius: 10,
    },

    text: {
        fontSize: 25,
        fontWeight: 'bold',
        color: 'white',
    },

    title: {
        fontSize: 30,
        fontWeight: 'bold',
        textAlign: 'center',
        marginBottom: 20,
        color: '#3282B8',
    }
})