import { FlatList, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { CATEGORIES } from '../data/data'
import CategorySquare from '../components/CategorySquare'

export default function CategoriesScreen({ navigation }) {
  return (
   <FlatList 
   data={CATEGORIES}
   keyExtractor={(item) => item.id}
   numColumns={2}
   renderItem={(itemData) => {
    return (
     // <Text>{itemData.item.title}</Text>
     <CategorySquare title={itemData.item.title} color={itemData.item.color} onPress={() => navigation.navigate('MealsShowScreen',{categoryId : itemData.item.id})}/>
    )
   }}
   />
  )
}

const styles = StyleSheet.create({})