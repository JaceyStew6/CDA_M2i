import React from 'react';

const ContactsComponent = (props) => {
    const { contacts } = props

    return (
        <div>
            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Lastname</th>
                        <th>Firstname</th>
                        <th>Phone Number</th>
                    </tr>
                </thead>
                <tbody>
                    {contacts.map((contact, index) => <tr key={index}>
                        <td>{index + 1}</td>
                        <td>{contact.lastname}</td>
                        <td>{contact.firstname}</td>
                        <td>{contact.phoneNumber}</td>
                    </tr>)}
                </tbody>
            </table>
        </div>
    );
}
export default ContactsComponent;