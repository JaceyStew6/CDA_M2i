import React, { useRef } from 'react';

const LoginComponent = (props) => {

    const {getValuesFromInputs} = props

    const usernameRef = useRef("")
    const passwordRef = useRef("")

    function getUserLogin() {
        getValuesFromInputs(usernameRef.current.value, passwordRef.current.value)
    }

    return (
        <>
            <label htmlFor="username">Username</label>
            <input type="text" name="username" id="username" ref={usernameRef} />
            <label htmlFor="password">Password</label>
            <input type="text" name="password" id="password" ref={passwordRef} />
            <button onClick={getUserLogin}>Valider</button>
        </>
    );
}

export default LoginComponent;