import { useRef } from "react"
import {useDispatch, useSelector} from "react-redux"
import { addProduct } from "./productSlice"
import { useState } from "react"

const AddProduct = () => {
  const dispatch = useDispatch()
  const products = useSelector(state => state.products.products)
  const nameRef = useRef()
  const priceRef = useRef()
  const [nameError, setNameError] = useState(false)
  const [priceError, setPriceError] = useState(false)

  const formSubmit = (event) => {
    event.preventDefault()

    if(!nameRef.current.value) {
      setNameError(true)
      return
    }

    if(!priceRef.current.value) {
      setPriceError(true)
      return
    }

    const newProduct = {
      id: Date.now(),
      name: nameRef.current.value,
      price: priceRef.current.value
    }

    dispatch(addProduct(newProduct))
    nameRef.current.value = ""
    priceRef.current.value = ""
    setNameError(false)
    setPriceError(false)
  }

  return ( 
    <>
      <form onSubmit={formSubmit}>
        <h3>Ajouter un produit</h3>
        <div className="row m-1">
          <label htmlFor="productName">Nom du produit</label>
          <input type="text" className={`form-control ${nameError && "is-invalid"}`} ref={nameRef} />
          {nameError && <div className="invalid-feedback">Ce champ est obligatoire</div>}
        </div>
        <div className="row m-1">
          <label htmlFor="productName">Prix du produit</label>
          <input type="number" className={`form-control ${priceError && "is-invalid"}`} ref={priceRef} />
          {priceError && <div className="invalid-feedback">Ce champ est obligatoire</div>}
        </div>
        <div className="row m-1">
          <button type="submit">Valider</button>
        </div>
      </form>
    </>
   );
}
 
export default AddProduct;