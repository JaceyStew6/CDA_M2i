import { StyleSheet, Text, View, ScrollView, FlatList, Image, TouchableOpacity } from 'react-native'
import React from 'react'
import { MEALS } from '../data/data'

export default function RecipesList({ navigation, route }) {
    const { categoryId } = route.params;

    const displayedMeals = MEALS.filter(
        meal => meal.categoryIds.indexOf(categoryId) >= 0
    );

    return (
        <ScrollView>
            <FlatList
                data={displayedMeals}
                renderItem={(itemData) => {
                    return (
                        <TouchableOpacity style={styles.container} onPress={() => navigation.navigate("RecipesDetails", { meal: itemData.item })}>
                            <View>
                                <Image
                                    source={{ uri: itemData.item.imageUrl }}
                                    style={{ width: '100%', height: 250 }}
                                />
                                <View style={styles.textContainer}>
                                    <Text style={styles.textTitle}>{itemData.item.title}</Text>
                                    <View style={styles.row}>
                                        <Text style={styles.textDesc}>{itemData.item.duration}m</Text>
                                        <Text style={styles.textDesc}>{itemData.item.complexity.toUpperCase()}</Text>
                                        <Text style={styles.textDesc}>{itemData.item.affordability.toUpperCase()}</Text>
                                    </View>
                                </View>
                            </View>
                        </TouchableOpacity>

                    )
                }}
                keyExtractor={(item) => item.id}
            />
        </ScrollView>
    )
}

const styles = StyleSheet.create({

    container: {
        marginHorizontal: 30,
        marginVertical: 20,
        borderRadius: 10,
        justifyContent: 'center',
        backgroundColor: 'white',
        overflow: 'hidden',
        shadowColor: 'grey',
        shadowOpacity: 0.26,
        shadowRadius: 10,
        elevation: 3,
    },
    textContainer: {
        padding: 10,
        alignItems: 'center',
    },
    row: {
        flexDirection: 'row',
        marginVertical: 10,
    },
    textTitle: {
        fontSize: 20,
        fontWeight: 'bold',
        textAlign: 'center',
    },
    textDesc: {
        fontSize: 15,
        color: 'gray',
        paddingHorizontal: 5,
    }

})