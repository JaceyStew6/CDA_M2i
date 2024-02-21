import { useRef } from "react";

const LoginForm = (props) => {
  const {logUserInfos} = props

  const usernameRef = useRef()
  const passwordRef = useRef()

  const submitForm = () => {
    const username = usernameRef.current.value
    const password = passwordRef.current.value

    logUserInfos({username, password})

    usernameRef.current.value = ""
    passwordRef.current.value = ""
  }

  return (  
    <>
      <div>
        <label htmlFor="Username">Username :</label>
        <input type="text" ref={usernameRef}/>
      </div>
      <div>
        <label htmlFor="Password">Password :</label>
        <input type="password" ref={passwordRef}/>
      </div>
      <button onClick={submitForm}>Valider</button>
    </>
  );
}
 
export default LoginForm;