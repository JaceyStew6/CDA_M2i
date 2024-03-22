import { StyleSheet, Text, View, ScrollView, FlatList, Image, TouchableOpacity } from 'react-native'
import React from 'react'
import { MEALS } from '../data/data'

export default function RecipesList({ navigation, route }) {
    //On récupère l'id de la catégorie de recettes passée en paramètre à la fonction RecipesList
    //On utilise cet id pour afficher les recettes de cette catégorie
    const { categoryId } = route.params;

    //On utilise la méthode filter pour récupérer les recettes de cette catégorie
    //On utilise la méthode indexOf pour vérifier si l'id de la catégorie de la recette est égale à l'id de la catégorie passée en paramètre à la fonction RecipesList
    const displayedMeals = MEALS.filter(
        meal => meal.categoryIds.indexOf(categoryId) >= 0
    );

    return (
        //On utilise ScrollView pour afficher les recettes de cette catégorie dans une liste défilable
        <ScrollView>
            {/* On utilise FlatList pour afficher les recettes de cette catégorie */}
            <FlatList
                //On utilise data pour afficher les recettes de cette catégorie récupérées depuis le fichier data.js en utilisant la méthode filter
                //On utilise renderItem pour afficher chaque recette
                //On utilise keyExtractor pour extraire l'id de chaque recette et l'utiliser comme clé pour chaque recette dans la liste des recettes de cette catégorie
                data={displayedMeals}
                renderItem={(itemData) => {
                    return (
                        //On utilise TouchableOpacity pour rendre chaque recette cliquable et pour naviguer vers les détails de cette recette en utilisant la méthode navigate de la navigation passée en paramètre à la fonction RecipesList
                        //On passe la recette cliquée en paramètre à la fonction navigate pour afficher les détails de cette recette dans l'écran RecipesDetails
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