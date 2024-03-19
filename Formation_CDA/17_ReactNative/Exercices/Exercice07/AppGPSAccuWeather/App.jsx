import { FlatList, StyleSheet, Text, View, Button } from 'react-native'
import React, { useEffect, useState } from 'react'
import Geolocation from '@react-native-community/geolocation'
import axios from 'axios'

export default function App() {

    const [latitude, setLatitude] = useState(null)
    const [longitude, setLongitude] = useState(null)
    const [location, setLocation] = useState([])

    useEffect(() => {
        Geolocation.requestAuthorization()
        Geolocation.getCurrentPosition(position => {
            setLatitude(position.coords.latitude);
            setLongitude(position.coords.longitude);
    },

    error => console.log(error),
    {enableHighAccuracy: true, timeout: 20000, maximumAge: 1000})},
    [])


    function getLocation(){
        axios.get(`http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=DPGuX0HWAF5wK5SQrexMHHfutNcIKyx3&q=${latitude}%2C${longitude}`)
        .then(response => setLocation([response.data]))
        .catch(error => console.error(error))
    }

    useEffect(() => {
        getLocation();
    } , [latitude, longitude])


    return (
        <View>
            <Text>Vous êtes :</Text>
            <FlatList
                data = {location}
                renderItem={(itemData) => {
                    return (
                        <View>
                            <Text>Ville: {itemData.item.LocalizedName}</Text>
                            <Text>Pays: {itemData.item.Country.LocalizedName}</Text>
                        </View>
                    )
                }}
                keyExtractor={(item, index) => {
                    return index;
                }}
            />
            <Button title='Obtenir position' onPress={getLocation}/>
        </View>
    )
}

const styles = StyleSheet.create({})