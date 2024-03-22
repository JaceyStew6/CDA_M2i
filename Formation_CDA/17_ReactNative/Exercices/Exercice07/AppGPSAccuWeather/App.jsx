import { FlatList, StyleSheet, Text, View, Button } from 'react-native'
import React, { useEffect, useState } from 'react'
import Geolocation from '@react-native-community/geolocation'
import axios from 'axios'
import { get } from 'react-native/Libraries/TurboModule/TurboModuleRegistry'

export default function App() {

    const APIKey = '' // API Key AccuWeather

    const [latitude, setLatitude] = useState(null)
    const [longitude, setLongitude] = useState(null)
    const [location, setLocation] = useState({ pays: '', ville: '' })
    const [getPosition, setGetPosition] = useState(false)

    //Pas fonctionnel pour le moment car l'API ne fonctionne pas avec les coordonnées GPS de l'utilisateur (erreur 503 et erreur 400).
    // Je parviens à obtenir les coordonnées GPS de l'utilisateur, mais je ne parviens pas à obtenir la ville et le pays de l'utilisateur. 
    // J'obtiens une erreur 503 et une erreur 400. 
    // J'obtiens un affichage de la ville et du pays de l'utilisateur, mais je ne parviens pas à actualiser la ville et le pays de l'utilisateur lorsque l'utilisateur appuie sur le bouton "Obtenir position". 
    // Je ne parviens pas à afficher une nouvelle ville et un nouveau pays lorsque l'utilisateur appuie sur le bouton "Obtenir position".

    useEffect(() => {
        Geolocation.requestAuthorization()
        Geolocation.getCurrentPosition(position => {
            setLatitude(position.coords.latitude);
            setLongitude(position.coords.longitude);
        },
            error => console.log(error),
            { enableHighAccuracy: true, timeout: 20000, maximumAge: 1000 })
        getLocation()
    }, [getPosition])


    function reloadPosition() {
        setGetPosition(currentState => !currentState)
    }

    function getLocation() {
        axios.get(`http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=${APIKey}&q=${latitude}%2C${longitude}`)
            .then(response => setLocation({ pays: response.data.Country.LocalizedName, ville: response.data.LocalizedName }))
            .catch(error => console.error(error))
    }


    return (
        <View>
            <Text>Vous êtes :</Text>
            <View>
                <Text>Ville: {ville}</Text>
                <Text>Pays: {pays}</Text>
            </View>

            <Button title='Actualiser' onPress={reloadPosition} />
        </View>
    )
}

const styles = StyleSheet.create({})