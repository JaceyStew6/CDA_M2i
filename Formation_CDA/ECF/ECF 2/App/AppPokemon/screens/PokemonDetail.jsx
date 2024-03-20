import { StyleSheet, Text, View, FlatList, Image, Button, ScrollView, ProgressBarAndroid } from 'react-native'
import React, { useEffect, useLayoutEffect, useState } from 'react'
import axios from 'axios';
import AsyncStorage from '@react-native-async-storage/async-storage'
import HomeScreen from './HomeScreen';

export default function PokemonDetail({ navigation, route }) {

    const url = route.params.url;

    const [pokemon, setPokemon] = useState([]);

    useLayoutEffect(() => {
        if (pokemon.name) {
            navigation.setOptions({ title: `${pokemon.name.toUpperCase()}` })
        }

    }
        , [pokemon.name])

    useEffect(() => {
        axios.get(url)
            .then((response) => {
                setPokemon(response.data);
            })
            .catch((error) => {
                console.error(error);
            })
    })

    const addToPokedex = async () => {
        let pokedex = await AsyncStorage.getItem('pokedexStorage');
        pokedex = pokedex != null ? JSON.parse(pokedex) : [];

        if (pokedex.some(p => p.id === pokemon.id)) {
            console.log('This Pokemon is already in your Pokedex.');
        } else {
            pokedex.push(pokemon);
            await AsyncStorage.setItem('pokedexStorage', JSON.stringify(pokedex));
        }
    }

    return (
        <ScrollView>
            <Image
                source={{ uri: `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${pokemon.id}.png` }}
                style={{ width: '100%', height: 400 }} />

            <Button title='Add to Pokedex' onPress={addToPokedex} />

            <View style={styles.pokemonContainer}>

                {/* Prenom du pokemon et id */}
                <View style={styles.pokemonHead}>
                    <Text style={styles.pokemonName}>{pokemon.name}</Text>
                    <Text style={styles.pokemonName}>#{pokemon.id}</Text>
                </View>


                {/* Types du pokemon */}
                <Text style={styles.titles}>Types</Text>
                <FlatList
                    data={pokemon.types}
                    horizontal={true}
                    renderItem={(itemData) => {
                        return (
                            <View style={styles.typeContainer}>
                                <Text style={styles.textType}>{itemData.item.type.name}</Text>

                            </View>


                        )
                    }}
                    keyExtractor={(item, index) => index}
                    scrollEnabled={false}
                />

                {/* Description du pokemon */}
                <Text style={styles.titles}>Description</Text>
                <View style={styles.typeContainer}>
                    <Text style={styles.textDesc}>height: {pokemon.height}"</Text>
                    <Text style={styles.textDesc}>weight: {pokemon.weight}"</Text>
                </View>


                {/* Stats du pokemon */}
                <Text style={styles.titles}>Stats</Text>

                <FlatList
                    data={pokemon.stats}
                    renderItem={(itemData) => {
                        return (
                        
                            <View style={{ flexDirection: 'row', alignItems: 'center' }}>
                                <View style={styles.progressBarContainer}>
                                <Text style={styles.textType}>{itemData.item.stat.name.toUpperCase()}: {itemData.item.base_stat}</Text>
                                </View>
                                    <View style={[styles.progBar, { height: 10, backgroundColor: 'grey', marginHorizontal: 10, flex: 0.5, width: 100 }]}>
                                        <View style={{ width: `${(itemData.item.base_stat / 255) * 100}%`, backgroundColor: 'blue', height: '100%' }} />
                                    </View>
                                

                            </View>

                        )
                    }}
                    keyExtractor={(item, index) => index}
                    scrollEnabled={false}
                />

                {/* Evolutions du pokemon */}
                <Text style={styles.titles}>Evolutions</Text>
            </View>

        </ScrollView>
    )
}

const styles = StyleSheet.create({

    pokemonContainer: {
        display: 'flex',
        marginHorizontal: 15,
        marginVertical: 5,
    },

    pokemonName: {
        fontSize: 25,
        fontWeight: 'bold',
    },

    pokemonHead: {
        display: 'flex',
        flexDirection: 'row',
        justifyContent: 'space-between',
        alignContent: 'flex-start',
        width: '100%',
        paddingTop: 10,
        marginBottom: 10,
    },

    titles: {
        fontSize: 20,
        fontWeight: 'bold',
        paddingTop: 10,
        textAlign: 'center',
        marginVertical: 10,
    },

    typeContainer: {
        display: 'flex',
        backgroundColor: 'lightgrey',
        paddingHorizontal: 10,
        paddingVertical: 5,
        marginHorizontal: 5,
        borderRadius: 10,
        alignItems: 'center',
    },

    textType: {
        fontSize: 15,
        fontWeight: 'bold',
    },

    textDesc: {
        fontSize: 15,
        marginHorizontal: 5,
    },

    progBar: {
        display: 'flex',
        flexDirection: 'row',
        justifyContent: 'flex-start'
    },

    progressBarContainer: {
        display: 'flex',
        flex: 0.5,
        flexDirection: 'row',
        justifyContent: 'flex-end',
    }

})