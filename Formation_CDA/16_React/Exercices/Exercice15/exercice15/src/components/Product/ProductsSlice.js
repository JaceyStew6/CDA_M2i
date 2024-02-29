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