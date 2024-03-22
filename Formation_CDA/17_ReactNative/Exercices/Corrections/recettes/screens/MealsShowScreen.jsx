import { FlatList, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { MEALS } from '../data/data'
import MealCard from '../components/MealCard'

export default function MealsShowScreen({ navigation, route }) {

  const categoryId = route.params.categoryId

  const meals = MEALS.filter((item) => {
    return item.categoryIds.includes(categoryId)
  })

  return (
   <FlatList 
   data={meals}
   keyExtractor={(item) => item.id}
   renderItem={(itemData) => <MealCard meal={itemData.item}/>}
   />
  )
}

const styles = StyleSheet.create({})