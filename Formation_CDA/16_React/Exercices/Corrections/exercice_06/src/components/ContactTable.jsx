const ContactTable = ({contacts}) => {
  // const {contacts} = props

  return ( 
    <>
      {
        contacts.length > 0 ? 
        <table>
          <thead>
            <tr>
              <th>#</th>
              <th>Prénom</th>
              <th>Nom</th>
              <th>Email</th>
            </tr>
          </thead>
          <tbody>
            {contacts.map((contact, index) => (
                <tr key={index}>
                  <td>{index}</td>
                  <td>{contact.firstname}</td>
                  <td>{contact.lastname}</td>
                  <td>{contact.email}</td>
                </tr>
              ))}      
          </tbody>
        </table>
        :
        <p>Il n'y a pas de contact pour le moment</p>
      }
    </>
   );
}
 
export default ContactTable;