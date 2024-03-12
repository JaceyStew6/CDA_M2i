import { Button, FlatList, StyleSheet, Text, View, TouchableOpacity } from 'react-native'
import React, { useState } from 'react'
import AddItemModal from './AddItemModal'

export default function listCourses() {

    const [modalVisible, setModalVisible] = useState(false);
    const [inputValue, setInputValue] = useState('');
    const [coursesList, setCoursesList] = useState([]);

    function getModal() {
        setModalVisible(true)
    }

    function closeModal() {
        setModalVisible(false)
    }

    const addCourse = () => {
        setCoursesList([...coursesList, inputValue]);
        setModalVisible(false);
        setInputValue("");
    }

    const removeCourse = (indexToRemove) => {
        setCoursesList(coursesList.filter((_, index) => index !== indexToRemove));
    };

    return (
        <View style={styles.container}>
            <View style={styles.titleContainer}>
                <Text style={styles.title}>Ma liste de courses</Text>
            </View>
            <FlatList
                data={coursesList}
                renderItem={itemData => {
                    return (
                        <TouchableOpacity onPress={() => removeCourse(itemData.index)}>
                            <View style={styles.itemContainer}>
                                <Text style={styles.itemText}>{itemData.item}</Text>
                            </View>
                        </TouchableOpacity>
                    )
                }
                }
                keyExtractor={(item, index) => {
                    return index;
                }}

            />
            <View style={styles.button}>
                <Button title='Ajouter article' onPress={getModal} />
            </View>

            <AddItemModal visible={modalVisible} closeModal={closeModal} setInputValue={setInputValue} addCourse={addCourse}></AddItemModal>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        marginTop: 50,
        marginLeft: 15,
        marginRight: 15,
        flexDirection: 'column',
    },
    titleContainer: {
        alignItems: 'center',
        justifyContent: 'center',
    },
    title: {
        fontSize: 30,
        fontWeight: 'bold',
    },
    itemContainer: {
        padding: 10,
        marginTop: 10,
        marginBottom: 10,
        backgroundColor: '#621dd3',
        borderRadius: 10,
    },
    itemText: {
        color: 'white',
        fontSize: 20,
    },
    button: {
        marginTop: 20,
    }
})