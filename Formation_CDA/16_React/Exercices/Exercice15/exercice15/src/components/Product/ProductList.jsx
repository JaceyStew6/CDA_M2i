import { useSelector } from "react-redux";
import ProductItem from "./ProductItem";

const ProductList = () => {

    const products = useSelector(state => state.product.products)

    return (
        <>
            <table>
                <thead>
                    <tr>
                        <th>Nom</th>
                        <th>Prix</th>
                        <th>Actions</th>
                    </tr>
                </thead>

                <tbody>
                {
                    products.map((product, index) => (
                        <ProductItem product={product} key={index} />
                    ))
                }
                </tbody>
            </table>
            {/* {
                products.map((product, index) => (
                    <ProductItem product={product} key={index} />
                ))
            } */}
        </>
    );
}

export default ProductList;