import { FlatList, StyleSheet, Text, TouchableHighlight, View, SafeAreaView } from 'react-native'
import React from 'react'
import { CATEGORIES } from '../data/data'


export default function Categories({ navigation }) {

    return (
        <SafeAreaView>
            <FlatList
                //On utilise data pour afficher les catégories de recettes récupérées depuis le fichier data.js
                data={CATEGORIES}
                //On utilise numColumns pour afficher les catégories en 2 colonnes
                numColumns={2}
                //On utilise renderItem pour afficher chaque catégorie
                renderItem={(itemData) => {
                    return (
                        //On utilise TouchableHighlight pour rendre chaque catégorie cliquable et pour naviguer vers la liste des recettes de cette catégorie en utilisant la méthode navigate de la navigation passée en paramètre à la fonction Categories
                        //ON implémente le style de chaque catégorie en utilisant le style container et en changeant la couleur de chaque catégorie en utilisant la couleur de la catégorie récupérée depuis le fichier data.js
                        <TouchableHighlight style={[styles.container, { backgroundColor: itemData.item.color }]} onPress={() => navigation.navigate("RecipesList", { categoryId: itemData.item.id })}>
                            <View>
                                <Text style={styles.textCategories}>{itemData.item.title}</Text>
                            </View>
                        </TouchableHighlight>

                    )
                }}
                //On utilise keyExtractor pour extraire l'id de chaque catégorie et l'utiliser comme clé pour chaque catégorie dans la liste des catégories de recettes
                keyExtractor={(item) => item.id}
            />
        </SafeAreaView>
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
        shadowColor: 'grey',
        shadowOpacity: 0.26,
        shadowRadius: 10,
        elevation: 3,
    },
    textCategories: {
        fontSize: 25,
        fontWeight: 'bold',
        // color: 'white',
    }
})