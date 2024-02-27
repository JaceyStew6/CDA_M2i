import './App.css';
import { useEffect, useState } from 'react';

function App() {

  const [data, setData] = useState()

  useEffect(() => {
    axios.get("http://localhost:3000/todo")
    .then((response) => {
      console.log(response);
      setData(response.data)
    }).catch(error => console.error(error))
  }, [data])


  const addTask = () => {
    axios.post("http://localhost:3000/todo")
  }



  return (
    <div className="App">
      
    </div>
  );
}

export default App;
