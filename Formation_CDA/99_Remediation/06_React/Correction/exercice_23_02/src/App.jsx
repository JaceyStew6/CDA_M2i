import { useState } from 'react'
import "bootstrap-icons/font/bootstrap-icons.css";
import "bootstrap/dist/css/bootstrap.css";
import './App.css'
import ProductDisplay from './components/ProductDisplay';
import Cart from './components/Cart';
import Modal from './components/Modal/Modal';

function App() {
  const [products] = useState([
    {
      id: 1,
      name: "Montre élégante en acier inoxydable",
      description:
        "Une montre sophistiquée avec un bracelet en acier inoxydable et un cadran élégant.",
      price: 99.99,
    },
    {
      id: 2,
      name: "Enceinte Bluetooth portable",
      description:
        "Une enceinte compacte avec une qualité sonore exceptionnelle, idéale pour les voyages et les fêtes.",
      price: 49.99,
    },
    {
      id: 3,
      name: "Livre de cuisine 'Recettes du monde'",
      description:
        "Un livre de cuisine inspirant avec une collection de recettes authentiques du monde entier.",
      price: 29.99,
    },
    {
      id: 4,
      name: "Sac à dos de randonnée imperméable",
      description:
        "Un sac à dos durable et imperméable, conçu pour les aventures en plein air avec de multiples compartiments.",
      price: 79.99,
    },
    {
      id: 5,
      name: "Kit d'outils de bricolage 20 pièces",
      description:
        "Un ensemble complet d'outils de bricolage de haute qualité pour les projets à la maison ou en atelier.",
      price: 59.99,
    },
    {
      id: 6,
      name: "Écouteurs sans fil sportifs",
      description:
        "Des écouteurs sans fil conçus pour les amateurs de sport, offrant un son clair et une tenue confortable.",
      price: 79.99,
    },
    {
      id: 7,
      name: "Tapis de yoga antidérapant",
      description:
        "Un tapis de yoga épais et antidérapant, parfait pour les séances d'entraînement à domicile ou en studio.",
      price: 39.99,
    },
    {
      id: 8,
      name: "Ensemble de pinceaux de maquillage professionnel",
      description:
        "Un ensemble de pinceaux de maquillage de qualité professionnelle pour une application précise et sans effort.",
      price: 24.99,
    },
    {
      id: 9,
      name: "Jeu de société familial 'Stratégie & Fun'",
      description:
        "Un jeu de société interactif et amusant qui mettra à l'épreuve vos compétences stratégiques tout en vous divertissant en famille.",
      price: 39.99,
    },
    {
      id: 10,
      name: "Machine à café automatique avec mousseur à lait",
      description:
        "Une machine à café polyvalente qui prépare votre café préféré avec une mousse de lait onctueuse en quelques minutes.",
      price: 149.99,
    },
    {
      id: 11,
      name: "Ensemble de couteaux de cuisine professionnels",
      description:
        "Un ensemble complet de couteaux de cuisine tranchants et durables pour préparer vos repas avec facilité.",
      price: 89.99,
    },
    {
      id: 12,
      name: "Bracelet fitness intelligent",
      description:
        "Un bracelet fitness élégant qui suit votre activité physique, surveille votre sommeil et vous aide à atteindre vos objectifs de santé.",
      price: 69.99,
    },
    {
      id: 13,
      name: "Appareil photo numérique compact",
      description:
        "Un appareil photo numérique compact avec une résolution haute définition et des fonctionnalités avancées pour capturer des moments inoubliables.",
      price: 199.99,
    },
    {
      id: 14,
      name: "Kit de démarrage pour jardinage urbain",
      description:
        "Un ensemble complet de fournitures de jardinage pour cultiver vos propres herbes aromatiques et légumes frais à la maison.",
      price: 49.99,
    },
    {
      id: 15,
      name: "Ensemble de bagages léger 3 pièces",
      description:
        "Un ensemble de valises durables et légères pour tous vos voyages, offrant style et praticité.",
      price: 129.99,
    },
    {
      id: 16,
      name: "Casque audio haute performance",
      description:
        "Un casque audio haute performance avec un son immersif et un design confortable pour une expérience d'écoute exceptionnelle.",
      price: 119.99,
    },
    {
      id: 17,
      name: "Lampe de bureau LED avec port de charge USB",
      description:
        "Une lampe de bureau élégante avec éclairage LED réglable et un port de charge USB pratique pour vos appareils électroniques.",
      price: 34.99,
    },
    {
      id: 18,
      name: "Robot aspirateur intelligent",
      description:
        "Un robot aspirateur intelligent qui nettoie efficacement les sols de votre maison, programmable et facile à utiliser.",
      price: 299.99,
    },
    {
      id: 19,
      name: "Ensemble de casseroles et poêles antiadhésifs",
      description:
        "Un ensemble de casseroles et poêles de cuisine antiadhésifs de haute qualité pour une cuisson sans effort et un nettoyage facile.",
      price: 79.99,
    },
    {
      id: 20,
      name: "Détecteur de fumée intelligent",
      description:
        "Un détecteur de fumée intelligent avec une alarme sonore puissante et des notifications sur votre smartphone pour une sécurité domestique optimale.",
      price: 44.99,
    },
  ]);
  const [cart, setCart] = useState([])
  const [displayCart, setDisplayCart] = useState(false)

  const addItemToCart = (item) => {
    const existingItemIndex = cart.findIndex((cartItem) => cartItem.id === item.id)

    if (existingItemIndex != -1) {
      const updatedCart = [...cart]
      updatedCart[existingItemIndex].quantity += 1
      setCart(updatedCart)
    } else {
      setCart([...cart, {...item, quantity: 1}])
    }
  }

  const removeItemFromCart = (index) => {
    const newCart = [...cart]
    newCart[index].quantity -= 1

    if (newCart[index].quantity <= 0) {
      newCart.splice(index, 1)
    }

    setCart(newCart)
  }

  return (
    <>
      {
        displayCart && (
          <Modal closeModal={() => setDisplayCart(false)}>
            <Cart cart={cart} removeFromCart={removeItemFromCart} />
          </Modal>
        )
      }
      <nav className='navbar navbar-expand-lg bg-body-tertiary' data-bs-theme='dark'>
        <div className='navbar-brand'>
          <i className='bi bi-globe'></i> E-commerce App
        </div>
        <button className='btn btn-primary ms-auto' onClick={() => setDisplayCart(true)}>Panier</button>
      </nav>
      <div className='container mt-4'>
        <div className='row'>
        {
          products.map((product) => (
            <div key={product.id} className='col-md-4 mb-4'>
              <ProductDisplay product={product} addToCart={addItemToCart} />
            </div>
          ))
        }
        </div>
      </div>
    </>
  )
}

export default App