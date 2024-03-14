import { StyleSheet, Text, View, ScrollView, FlatList, TouchableHighlight, Image } from 'react-native'
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
                        <TouchableHighlight onPress={() => navigation.navigate("RecipesDetails")}>
                            <View>
                                <Image 
                                    source={{uri: itemData.item.imageUrl}}
                                    style={{width: '100%', height: 200}}
                                />
                                <Text >{itemData.item.title}</Text>
                                <Text >{itemData.item.affordability}</Text>
                                <Text >{itemData.item.complexity}</Text>
                                <Text >{itemData.item.duration}</Text>
                            </View>

                        </TouchableHighlight>

                    )
                }}
                keyExtractor={(item) => item.id}
            />
        </ScrollView>
    )
}

const styles = StyleSheet.create({})