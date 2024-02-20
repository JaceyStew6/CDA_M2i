import { useState } from "react";

const ContactForm = ({addContact}) => {
  const [firstname, setFirstname] = useState("")
  const [lastname, setLastname] = useState("")
  const [email, setEmail] = useState("")

  const onSubmitHandler = () => {
    const newContact = {firstname: firstname, lastname: lastname, email:email}
    addContact(newContact)
    setFirstname("")
    setLastname("")
    setEmail("")
  }

  return ( 
    <>
      <div>
        <label htmlFor="firstname">Firstname</label>
        <input type="text" value={firstname}  onInput={(e) => setFirstname(e.target.value)}/>
      </div>
      <div>
        <label htmlFor="lastname">Lastname</label>
        <input type="text" value={lastname}  onInput={(e) => setLastname(e.target.value)}/>
      </div>
      <div>
        <label htmlFor="email">email</label>
        <input type="text" value={email}  onInput={(e) => setEmail(e.target.value)}/>
      </div>
      <button onClick={onSubmitHandler}>Add contact</button>
    </>
   );
}
 
export default ContactForm;