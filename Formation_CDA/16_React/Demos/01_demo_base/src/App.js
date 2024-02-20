import logo from "./logo.svg";
import "./App.css";
import FirstComponent from "./components/FirstComponent/FirstComponent";
import ListingComponent from "./components/ListingComponent";
import Conditionnal from "./components/Conditionnal";

function App() {
  return (
    <div className="App">
      <FirstComponent />
      <ListingComponent />
      <Conditionnal />
    </div>
  );
}

export default App;
