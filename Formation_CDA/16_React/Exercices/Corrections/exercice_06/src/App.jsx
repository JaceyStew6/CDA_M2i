import { useState } from 'react'
import './App.css'
import ContactTable from './components/ContactTable'
import ContactForm from './components/ContactForm'

function App() {
  const [contacts, setContacts] = useState([])

  const addContact = (contact) => {
    setContacts(previousContacts => [...previousContacts, contact])
  }

  return (
    <>
      <ContactForm addContact={addContact} />
      <ContactTable contacts={contacts} />
    </>
  )
}

export default App
