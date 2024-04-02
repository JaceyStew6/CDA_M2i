import { StyleSheet, Text, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import ListPokemon from '../component/ListPokemon'
import { NB_POKEMONS, getInfoPokemonById } from '../utils/utils'

export default function Home() {

  const [pokemons,setPokemons] = useState([])

  useEffect(()=> {
    const recup = async () => {
      let tab = []
      for(let i = 1; i < NB_POKEMONS; i++){
        tab.push(await getInfoPokemonById(i))
      }
      setPokemons(tab)
    }
    recup()
  },[])


  return (
   <ListPokemon listPokemons={pokemons}/>
  )
}

const styles = StyleSheet.create({})