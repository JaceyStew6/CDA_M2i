import './App.css';
import { useState } from 'react';
import ItemComponent from './components/ItemComponent';
import 'bootstrap/dist/css/bootstrap.min.css';


function App() {

  const [items, setItems] = useState([
    {
      title: 'Nintendo Mario vs. Donkey Kong',
      description: 'Donkey Kong a volé tous les jouets mini-Mario, et Mario est déterminé à se lancer à ses trousses pour les récupérer.',
      price: 36.99
    },
    {
      title: 'Banishers: Ghosts of New Eden PS5',
      description: 'Jouez à la fois Antea et Red, et utilisez magie, armes et pouvoirs spirituels pour combattre les forces surnaturelles',
      price: 59.99
    },
    {
      title: 'Super Mario Bros. Wonder',
      description: 'Préparez-vous à de nombreuses surprises avec Super Mario Bros. Wonder, le tout nouveau Super Mario Bros en 2D exclusivement sur Nintendo Switch !',
      price: 44.16
    },
    {
      title: 'Final Fantasy VII Rebirth',
      description: 'Le voyage vers l\'inconnu continue; Après avoir échappé à la cité dystopique de Midgar, Cloud et ses amis se lancent dans un voyage à travers toute la planète.',
      price: 69.99
    },
    {
      title: 'Princess Peach : Showtime !',
      description: 'Peach revient sur le devant de la scène !',
      price: 44.99
    },
    {
      title: 'The Last of Us Part II Remastered ',
      description: 'Cinq ans après leur voyage périlleux à travers une Amérique ravagée par une pandémie, Ellie et Joel ont trouvé refuge à Jackson, dans le Wyoming.',
      price: 49.99
    },
    {
      title: 'Marvel\'s Spider-Man 2',
      description: 'Jouez avec deux Spider-Man (Peter Parker et Miles Morales), affrontez de nouveaux ennemis et partez à l’aventure dans un New York de Marvel plus vaste que jamais;',
      price: 79.99
    },
    {
      title: 'Prince of Persia: The Lost Crown',
      description: 'Plongez dans un jeu de plateforme d\'action-aventure élégant et palpitant se déroulant dans un monde mythologique perse.',
      price: 36.59
    },
    {
      title: 'The Legend of Zelda : Tears of the Kingdom',
      description: 'Une aventure épique à travers les terres et les cieux d\'Hyrule vous attend dans The Legend of Zelda: Tears of the Kingdom sur Nintendo Switch.',
      price: 50.49
    }
  ])


  

  return (
    <div className="App">

      <ItemComponent items={items} setItems={setItems}/>

    </div>
  );
}

export default App;
