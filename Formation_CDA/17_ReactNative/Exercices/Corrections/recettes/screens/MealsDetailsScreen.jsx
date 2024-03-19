import { Image, ScrollView, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { MEALS } from '../data/data'

export default function MealsDetailsScreen({ navigation, route}) {
  const id = route.params.id 
  const meal = MEALS.find((meal) => meal.id == id)

  return (
    <ScrollView>
      <Image  source={{uri: meal.imageUrl}} style={styles.image}/>
      <Text>{meal.title}</Text>
      <View style={styles.details} >
          <Text style={styles.detailItem} >{meal.duration}m</Text>
          <Text style={styles.detailItem}>{meal.complexity.toUpperCase()}</Text>
          <Text style={styles.detailItem}>{meal.affordability.toUpperCase()}</Text>
      </View>
      <View>
        <View>
          <View>
            <Text>Ingredients</Text>
          </View>
        </View>
        {meal.ingredients.map((item,i) => {
          return (
            <View key={i}>
              <Text>{item}</Text>
            </View>
          )
        })}

        <View>
            <Text>Steps</Text>
          </View>
          {meal.steps.map((item,i) => {
          return (
            <View key={i}>
              <Text>{item}</Text>
            </View>
          )
        })}

      </View>
    </ScrollView>
  )
}

const styles = StyleSheet.create({
  image: {
    width: '100%',
    height: 350
  },
  details: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    padding: 8,
  },
  detailItem: {
    marginHorizontal: 4,
    fontSize: 12,
    color: "black",
  },
})