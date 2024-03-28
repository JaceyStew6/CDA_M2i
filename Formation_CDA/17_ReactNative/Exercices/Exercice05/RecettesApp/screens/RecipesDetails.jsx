import { StyleSheet, Text, View, Image, ScrollView, TouchableHighlight, Button, FlatList } from 'react-native'
import React, { useState } from 'react'
import Categories from './Categories';

export default function RecipesDetails({ navigation, route }) {
    //On récupère la recette passée en paramètre à la fonction RecipesDetails pour afficher les détails de cette recette dans l'écran RecipesDetails
    const meal = route.params.meal;


    return (
        <ScrollView style={styles.container}>
            <Image
                source={{ uri: meal.imageUrl }}
                style={{ width: '100%', height: 400 }}
            />
            <View>
                {/* En-tête de la recette avec le titre, la durée, la complexité et le coût */}
                <View style={styles.headerContainer}>
                    <Text style={styles.textTitle}>{meal.title}</Text>
                    <View style={styles.row}>
                        <Text style={styles.textDesc}>{meal.duration}m</Text>
                        <Text style={styles.textDesc}>{meal.complexity.toUpperCase()}</Text>
                        <Text style={styles.textDesc}>{meal.affordability.toUpperCase()}</Text>
                    </View>
                    {/* Ajout du bouton Favoris - Non fonctionnel */}
                    {/* <Button title="Favoris" onPress={() => addFavorite(meal)}></Button> */}
                </View>

                {/* Liste des ingrédients */}
                <View style={styles.descriptionContainer}>
                    <Text style={styles.descriptionTitle}>Ingredients</Text>
                    <View style={styles.separator}></View>


                    {/* Méthode avec FlatList à ne pas favoriser si on stocke une Flatlist qui est scrollable dans un autre élément scrollable avec la ScrollView. 
                    Il peut donc y avoir des conflits. Pour éviter cela, on a deux solutions: passer par un .map ou désactiver le côté scrollable de la FlatList */}
                    <FlatList
                        data={meal.ingredients}
                        renderItem={(itemData) => {
                            return (
                                <View style={styles.oneDescContainer}>
                                    <Text style={styles.descriptionText}>{itemData.item}</Text>
                                </View>
                            )
                        }}
                        keyExtractor={(item, index) => index}
                        scrollEnabled={false}
                    />
                </View>

                {/* Liste des étapes de la recette */}
                <View style={styles.descriptionContainer}>
                    <Text style={styles.descriptionTitle}>Steps</Text>
                    <View style={styles.separator}></View>


                    {/* Méthode avec FlatList à ne pas favoriser si on stocke une Flatlist qui est scrollable dans un autre élément scrollable avec la ScrollView. 
                    Il peut donc y avoir des conflits. Pour éviter cela, on a deux solutions: passer par un .map ou désactiver le côté scrollable de la FlatList */}
                    <FlatList
                        data={meal.steps}
                        renderItem={(itemData) => {
                            return (
                                <View style={styles.oneDescContainer}>
                                    <Text style={styles.descriptionText}>{itemData.item}</Text>
                                </View>
                            )
                        }}
                        keyExtractor={(item, index) => index}
                        scrollEnabled={false}
                    />
                </View>

            </View>
        </ScrollView>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        // alignItems: 'center',
    },
    headerContainer: {
        justifyContent: 'center',
        alignItems: 'center',
        padding: 10,

    },
    textTitle: {
        fontSize: 30,
        fontWeight: 'bold',
        textAlign: 'center',
        color: '#333333',
    },
    textDesc: {
        fontSize: 15,
        color: '#333333',
        paddingHorizontal: 10,
    },
    descriptionContainer: {
        padding: 10,
        justifyContent: 'center',
        alignItems: 'center',
    },
    oneDescContainer: {
        padding: 10,
        backgroundColor: '#e1b497',
        marginVertical: 5,
        width: 350,
        alignItems: 'center',
        borderRadius: 10,
    },
    descriptionText: {
        fontSize: 18,
        color: 'white',
        textAlign: 'center',
    },
    descriptionTitle: {
        fontSize: 25,
        fontWeight: 'bold',
        color: '#e1b497',
    },
    stepsContainer: {
        padding: 10,
    },
    row: {
        flexDirection: 'row',
        marginVertical: 10,
    },
    separator: {
        width: '80%',
        height: 2,
        backgroundColor: '#e1b497',
        marginVertical: 10,
    }
})