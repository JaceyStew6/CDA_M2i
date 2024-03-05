# ReactJS

<details>
  <summary>Sommaire</summary>
  <ol>
    <li>
      <a href="#commandes-de-base">Commandes de base</a>
      <ul>
        <li><a href="#creer-le-projet">Créer le projet</a></li>
        <li><a href="#packages-utiles">Packages Utiles</a></li>
      </ul>
    </li>
    <li>
      <a href="#extensions">Extensions</a>
      <ul>
        <li><a href="#extension-vscode">Extension VSCode</a></li>
        <li><a href="#extension-google">Extension Google</a></li>
      </ul>
    </li>
    <li>
        <a href="#exemples">Exemples</a>
        <ul>
            <li><a href="#creer-un-store">Créer un store</a></li>
      </ul>
    </li>
  </ol>
</details>


## Commandes de base
### Créer le projet

```bash
npx create-react-app nom-du-projet
```

ou

```bash
npm create vite@latest
```

*Cette deuxième méthode permet de créer plus rapidement l'application sans importer tous les packages, contrairement à la première méthode.*

### Packages utiles

- `React Router` pour implémenter un routing dynamique

```bash
npm i react-router-dom
```

- `JSON Server` Simuler une API Rest Backend

```bash
npm i -g json-server
```

*Pour lancer notre JSON*

```bash
json-server nom-fichier-json
```

- Installer `Bootstrap React`

```bash
npm install react-bootstrap bootstrap
```

- Installer `Bootstrap` 

```bash
npm i bootstrap
```

*Ajouter l'import dans `app.jsx`*

```js
import 'bootstrap/dist/css/bootstrap.min.css'
```

- Installer `Redux` pour la gestion des stores

```bash
npm i @‌reduxjs/toolkit react-redux
```
*Créer un fichier `store.js` et un fichier de slice dans les components, par exemple `ProductsSlice.js`. C'est dans le slice qu'on va faire notre CRUD.*


- Installer `Axios` pour l'appel d'API
```bash
npm install axios
```


## Extensions
### Extension VSCode

Simple React Snippets

### Extension Google

React Developer Tools



## Exemples
### Créer un store

Fichier `ProductsSlice.js` (voir détail exercice 15 ReactJS): 

```js
import { createSlice } from '@reduxjs/toolkit'

const productSlice = createSlice({
    name: "product",
    initialState: {
        products: [],
    },
    reducers: {

        addProduct: (state, action) => {
            const newProduct = {
                name: action.payload.name,
                price: action.payload.price,
                id: Date.now(),
            };

            state.products.push(newProduct);
        },
        deleteProduct: (state, action) => {
            state.products = state.products.filter((product) => product.id !== action.payload);
        },
        updateProduct: (state, action) => {
            const product = state.products.find(product => product.id === action.payload.id);
            product.name = action.payload.name
            product.price = action.payload.price
        },
    },
});

export const { addProduct, deleteProduct, updateProduct } = productSlice.actions;
export default productSlice.reducer;
```

Fichier `store.js`:

```js
import { configureStore } from "@reduxjs/toolkit";
import ProductsSlice from "./components/Product/ProductsSlice";

export default configureStore({
    reducer: {
        product: ProductsSlice,
    },
});
```

Fichier `main.jsx`:

```js
import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import { Provider } from 'react-redux'
import store from './store.js'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <Provider store={store}>
      <App />
    </Provider>

  </React.StrictMode>,
)
```