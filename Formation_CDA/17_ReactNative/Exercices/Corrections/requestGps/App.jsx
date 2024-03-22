import { Button, StyleSheet, Text, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import Geolocation from '@react-native-community/geolocation'
import { APIKEY } from './util'
import axios from 'axios'

// Pour l'utilisation du GPS
// npm i @react-native-community/geolocation
// dans le repertoire : android/app/src/main/AndroidManifest.xml
// ajout d'une ligne : <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

// Pour l'utilisation de axios
// npm i axios



export default function App() {

  const [latitude,setLatitude] = useState(null)
  const [longitude,setLongitude] = useState(null)
  const [localisationFetch,setLocalisationFetch] = useState({ pays: "", ville: ""})
  const [localisationAxios,setLocalisationAxios] = useState({ pays: "", ville: ""})
  const [getPosition,setGetPosition] = useState(true)

  useEffect(() => {
    console.log("refresh !!!!")
    Geolocation.requestAuthorization()
    Geolocation.getCurrentPosition(position => {
      setLatitude(position.coords.latitude)
      setLongitude(position.coords.longitude)
    },
    error => console.log(error),
    {enableHighAccuracy: true, timeout: 20000, maximumAge: 1000}
    )
  },[getPosition])

  function reload(){
    setGetPosition(currentState => !currentState)
  }

  function getApiWithFetch(){
    fetch(`http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=${APIKEY}&q=${latitude}%2C${longitude}&toplevel=true`)
    .then(response => response.json())
    .then(data => setLocalisationFetch({ pays: data.Country.LocalizedName, ville: data.LocalizedName}))
    .catch(error => console.log(error))
  }

  function getApiWithAxios(){
    console.log(`http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=${APIKEY}&q=${latitude}%2C${longitude}&toplevel=true`)
    axios.get(`http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=${APIKEY}&q=${latitude}%2C${longitude}&toplevel=true`)
    .then(response => setLocalisationAxios({ pays: response.data.Country.LocalizedName, ville: response.data.LocalizedName}))
    .catch(error => console.log(error))
  }

  return (
    <View>
      <Button title='Actualiser' onPress={reload}/>
      <Text>Emplacement :</Text>
      <View>
      <View> 
        <Text>Pays : {localisationFetch.pays}</Text>  
      </View>
      <View>
        <Text>Ville : {localisationFetch.ville}</Text> 
      </View>
      
      <Button title='Actualiser Fetch' onPress={getApiWithFetch}/>
      </View>
      <View>
      <View> 
        <Text>Pays : {localisationAxios.pays}</Text>  
      </View>
      <View>
        <Text>Ville : {localisationAxios.ville}</Text> 
      </View>
      
      <Button title='Actualiser Axios' onPress={getApiWithAxios}/>
      </View>
    </View>
  )
}

const styles = StyleSheet.create({})