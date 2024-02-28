import { useEffect, useState } from "react";
import axios from 'axios';
import Card from 'react-bootstrap/Card';


const BookList = () => {

    const [books, setBooks] = useState([])

    useEffect(() => {
        axios.get('https://openlibrary.org/subjects/science_fiction.json?limit=10')
            .then(response => {
                setBooks(response.data.works)

            })
    }, [])

    console.log(books)

    return (

        <>
            <h1>Livres de science fiction</h1>
            <div className='row' >
                {books.map((book, index) => (
                    <div className='col-md-2 mb-4' key={index}>
                        <Card border='white' style={{ width: '15rem', height: '22rem', padding: '0', margin: 'auto', marginBottom: '1rem' }}>
                            <Card.Img variant="top" src={`https://covers.openlibrary.org/b/id/${book.cover_id}-M.jpg`} style={{ width: 'auto', height: '20rem'  }} />
                            <Card.Body style={{ padding: '0.5rem' }}>
                                <Card.Title>{book.title}</Card.Title>
                            </Card.Body>
                        </Card>
                    </div>
                ))}
            </div>
        </>

    );
}

export default BookList;