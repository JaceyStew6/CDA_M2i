import axios from 'axios'
import { useEffect, useState, useRef } from 'react';
import Card from 'react-bootstrap/Card';

const CountryList = () => {

    const [countries, setCountries] = useState([])
    const findCountry = useRef('')

    useEffect(() => {
        axios.get('https://restcountries.com/v3.1/all')
            .then(response => {
                setCountries(response.data)
            })
    }, [])

    const searchRef = (() => {
        if (findCountry.current.value === "") {
            axios.get('https://restcountries.com/v3.1/all')
                .then(response => {
                    setCountries(response.data)
                }).catch(error => console.error(error))
        } else {
            axios.get('https://restcountries.com/v3.1/name/' + findCountry.current.value)
                .then(response => {
                    setCountries(response.data)
                }).catch(error => console.error(error))
        }
    })

    return (
        <>
            <h1>Liste de Pays</h1>

            <input type="text" name="searchCountry" id="searchCountry" ref={findCountry} onChange={searchRef} style={{marginTop: '1rem', marginBottom: '1rem', width:'100%', textAlign: 'center'}}/>

            <div className='row' style={{ padding: '0' }}>
                {countries.map((country, index) => (
                    <div className='col-md-4 mb-4' key={index}>
                        <Card style={{ width: '20rem', height: '22rem', padding: '0', margin: 'auto', marginBottom: '1rem' }} border="dark">
                            <Card.Img variant="top" src={country.flags.png} style={{ width: 'auto', height: '11rem' }} />
                            <Card.Body style={{ padding: '0.5rem' }}>
                                <Card.Title>{country.translations.fra.official}</Card.Title>
                                <Card.Text style={{ marginBottom: '0.5rem' }}>Capitale: {country.capital}</Card.Text>
                                <Card.Text style={{ marginBottom: '0.5rem' }}>Région: {country.region}</Card.Text>
                                <Card.Text style={{ marginBottom: '0.5rem' }}>Population: {country.population}</Card.Text>
                            </Card.Body>
                        </Card>
                    </div>
                ))}
            </div>
        </>
    );
}

export default CountryList;