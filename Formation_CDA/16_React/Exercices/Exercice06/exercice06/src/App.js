import logo from './logo.svg';
import './App.css';
import FormComponent from './components/FormComponent';
import ContactsComponent from './components/ContactsComponent';
import { useState } from 'react';


function App() {

  const [contacts, setContacts] = useState([]);

  const contactArrayHandler = (person) => {
    setContacts([
      ...contacts, person
    ]);
  }

  return (
    <div className="App">
      <FormComponent contactArrayHandler={contactArrayHandler} />
      <ContactsComponent contacts={contacts} />
    </div>
  );
}

export default App;
