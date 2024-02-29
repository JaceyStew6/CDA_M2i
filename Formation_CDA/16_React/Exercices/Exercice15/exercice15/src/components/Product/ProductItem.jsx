import { useDispatch } from "react-redux";
import { deleteProduct, updateProduct } from "./ProductsSlice";
import { useRef, useState } from "react";


const ProductItem = (props) => {

    const product = props.product
    const dispatch = useDispatch()

    const [edit, setEdit] = useState(false)
    const newNameRef = useRef('')
    const newPriceRef = useRef()

    const handleSubmit = (event) => {
        event.preventDefault()
        dispatch(updateProduct({ name: newNameRef.current.value, price: newPriceRef.current.value, id: product.id }))
        setEdit(!edit)
    }


    return (
        <tr>
            {edit ?
                <>
                    <td><input type="text" ref={newNameRef} defaultValue={product?.name} /></td>
                    <td><input type="number" ref={newPriceRef} defaultValue={product?.price} /></td>
                    <td><button type="submit" onClick={handleSubmit}>Modifier</button>
                        <button onClick={() => setEdit(!edit)}>Annuler</button></td>
                </> :

                <>
                    <td>{product.name}</td>
                    <td>{product.price} €</td>
                    <td>
                        <button onClick={() => setEdit(!edit)}>Modifier</button>
                        <button onClick={() => dispatch(deleteProduct(product.id))}>Supprimer</button>
                    </td>
                </>
            }
        </tr>
    );
}

export default ProductItem;