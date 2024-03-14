import { FlatList, ScrollView, StyleSheet, Text, TouchableHighlight, View } from 'react-native'
import React from 'react'
import { CATEGORIES } from '../data/data'


export default function Categories({navigation}) {

    return (
        <ScrollView>
            <FlatList
                data={CATEGORIES}
                numColumns={2}
                renderItem={(itemData) => {
                    return (
                        <TouchableHighlight style={[styles.container, {backgroundColor: itemData.item.color}]} onPress={() => navigation.navigate("RecipesList", {categoryId: itemData.item.id})}>
                            <View>
                                <Text style={styles.textCategories}>{itemData.item.title}</Text>
                            </View>

                        </TouchableHighlight>

                    )
                }}
                keyExtractor={(item) => item.id}
            />
        </ScrollView>
    )
}

const styles = StyleSheet.create({
    container: {
        margin: 10,
        marginHorizontal: 12,
        marginVertical: 15,
        padding: 10,
        borderRadius: 10,
        alignItems: 'center',
        justifyContent: 'center',
        width: 200,
        height: 200,
    },
    textCategories: {
        fontSize: 25,
        fontWeight: 'bold',
        color: 'white',
    }
})