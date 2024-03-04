import { useState } from "react";
import {useDispatch} from "react-redux"
import { deleteProducts, updateProducts } from "./productSlice";
import { useRef } from "react";

const ProductItem = (props) => {
  const dispatch = useDispatch()
  const product = props.product
  const [update, setUpdate] = useState(false)
  const nameRef = useRef()
  const priceRef = useRef()

  const updateProduct = () => {
    const newName = nameRef.current.value
    const newPrice = priceRef.current.value

    const updatedProduct = {
      id: product.id,
      name: newName,
      price: newPrice
    }

    dispatch(updateProducts(updatedProduct))
    setUpdate(!update)
  }
  
  return (  
    <>
      {
        update ? 
        <tr>
        <td><input type="text" className="form-control" ref={nameRef} defaultValue={product.name} /></td>
        <td><input type="number" className="form-control" ref={priceRef} defaultValue={product.price} /></td>
        <td>
          <button onClick={updateProduct}  className="btn btn-success">Valider</button>
          <button onClick={() => setUpdate(!update)}  className="btn btn-danger">Annuler</button>
        </td>
      </tr>
      :
      <tr>
        <td>{product.name}</td>
        <td>{product.price} €</td>
        <td>
          <button onClick={() => setUpdate(!update)} className="btn btn-warning">Modifier</button>
          <button onClick={() => dispatch(deleteProducts(product.id))}>Supprimer</button>
        </td>
      </tr>
      }
    </>
  );
}
 
export default ProductItem;