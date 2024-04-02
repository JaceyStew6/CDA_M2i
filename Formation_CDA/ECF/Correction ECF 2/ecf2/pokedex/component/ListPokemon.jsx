import { FlatList, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import ButtonCardPokemon from './ButtonCardPokemon'
import { useNavigation } from '@react-navigation/native'

export default function ListPokemon({listPokemons}) {

    const navigation = useNavigation()

  return (
    <FlatList 
    data={listPokemons}
    renderItem={(itemData) => {
        return(
            <ButtonCardPokemon imageUrl={itemData.item.image} name={itemData.item.name} number={itemData.item.id} onPress={() => navigation.navigate("pokemon",{pokemon : itemData.item})} />
        )
    }
    }
    keyExtractor={(item,index) => {
        return index;
    }}
    numColumns={2}
    />
  )
}

const styles = StyleSheet.create({})