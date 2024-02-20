import React, { useState } from 'react';

const FormComponent = (props) => {

    const{contactArrayHandler}=props

    const [lastname, setLastname] = useState("")
    const [firstname, setFirstname] = useState("")
    const [phoneNumber, setPhoneNumber] = useState("")


    const lastnameHandler = (e) => {
        setLastname(e.target.value)
    }

    const firstnameHandler = (e) => {
        setFirstname(e.target.value)
    }

    const phoneNumberHandler = (e) => {
        setPhoneNumber(e.target.value)
    }

    function addContact() {
        let person = {lastname: lastname, firstname: firstname, phoneNumber: phoneNumber }
        contactArrayHandler(person)
    }


    return (
        <>
            <input type="text" placeholder='lastname' value={lastname} onInput={lastnameHandler} />
            <input type="text" placeholder='firstname' value={firstname} onInput={firstnameHandler} />
            <input type="text" placeholder='phone number' value={phoneNumber} onInput={phoneNumberHandler} />
            <button disabled={lastname == "" || firstname == "" || phoneNumber == ""} onClick={addContact}>Add contact</button>

            
        </>
    );
}

export default FormComponent;
