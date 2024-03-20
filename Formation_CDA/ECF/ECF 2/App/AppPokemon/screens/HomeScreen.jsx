import { FlatList, ScrollView, StyleSheet, Text, View, TouchableOpacity, Image, TextInput } from 'react-native'
import { useSelector, useDispatch } from 'react-redux'
import { getPokemons } from '../store/pokemonSlice'
import React, { useEffect, useState } from 'react'

export default function HomeScreen({ navigation }) {

    const [search, setSearch] = useState('');

    const dispatch = useDispatch();
    const pokemons = useSelector(state => state.pokemons.pokemons);
    const isLoading = useSelector(state => state.pokemons.isLoading);

    useEffect(() => {
        dispatch(getPokemons());
    }, []);

    if (isLoading) {
        return <Text>Loading...</Text>;
    }

    const filteredPokemons = (pokemons.results ?? []).filter(pokemon => {
        const name = pokemon.name.toLowerCase();
        const id = pokemon.url.split('/')[6];
        return name.includes(search.toLowerCase()) || id.includes(search);
    })

    return (
        <ScrollView>

            <TextInput style={styles.inputStyle}
                onChangeText={text => setSearch(text)}
                value={search}
                placeholder="Search by name or ID"
            />

            <FlatList
                data={filteredPokemons}
                numColumns={2}
                renderItem={(itemData) => {
                    const id = itemData.item.url.split('/')[6];
                    const imageUrl = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${id}.png`;
                    return (
                        <TouchableOpacity style={styles.touchableContainer} onPress={() => navigation.navigate("PokemonDetail", { url: itemData.item.url })}>
                            <View style={styles.cardContainer}>
                                <Image
                                    source={{ uri: imageUrl }}
                                    style={{ width: '90%', height: 160 }} />
                                <View style={styles.row}>
                                    <Text style={styles.textStyle}>{itemData.item.name.toUpperCase()}</Text>
                                    <Text style={styles.textStyle}>#{id}</Text>
                                </View>

                            </View>
                        </TouchableOpacity>
                    )
                }}
                keyExtractor={(item, index) => index}
                scrollEnabled={false}
            />
        </ScrollView>
    )
}

const styles = StyleSheet.create({

    touchableContainer: {
        display: 'flex',
        backgroundColor: 'lightgrey',
        marginHorizontal: 11,
        marginVertical: 10,
        // padding: 10,
        borderRadius: 10,
        width: 200,
        height: 200,
        justifyContent: 'center',
    },
    cardContainer: {
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
    },
    row: {
        display: 'flex',
        flexDirection: 'row',
        justifyContent: 'space-around',
        width: '100%',
        paddingTop: 10,
    },
    textStyle: {
        fontSize: 20,
        fontWeight: 'bold',
        color: 'white',
    },
    inputStyle: {
        height: 40,
        marginVertical: 10,
        marginLeft: 10,
        width: '80%',
        borderWidth: 1,
        padding: 10,
        borderRadius: 10,
        borderColor: 'grey',
    }
})
