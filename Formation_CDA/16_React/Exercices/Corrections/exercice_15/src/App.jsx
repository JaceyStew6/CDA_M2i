import { useState } from 'react'
import './App.css'
import ProductList from './components/products/ProductList'
import AddProduct from './components/products/AddProduct'

function App() {

  return (
    <>
      <h1>Application de gestion de produits</h1>
      <ProductList />
      <AddProduct />
    </>
  )
}

export default App
