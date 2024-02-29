import { useDispatch, useSelector } from "react-redux";
import { addProduct } from "./ProductsSlice";
import { useRef } from "react";

const AddProduct = () => {

    const nameRef = useRef()
    const priceRef = useRef()
    const dispatch = useDispatch()
    const products = useSelector(state => state.product.products) //Pas obligatoire. Sert essentiellement pour vérifier en console.log

    const handleSubmit = (event) => {
        event.preventDefault()
        dispatch(addProduct({name: nameRef.current.value, price: priceRef.current.value}))
        console.log(products)
    }

    return (
        <>
            <h2>Ajouter un produit</h2>
            <form onSubmit={handleSubmit}>
                <input type="text" ref={ nameRef } placeholder="Nom du produit" required/>
                <input type="number" ref={ priceRef } placeholder="Prix" required/>
                <button type="submit">Valider</button>
            </form>
        </>
    );
}

export default AddProduct;