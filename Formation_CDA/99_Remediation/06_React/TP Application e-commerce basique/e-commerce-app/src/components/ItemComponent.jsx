import React from 'react';

const ItemComponent = (props) => {

    const { items, setItems } = props;

    const addToCart = () => {
        
    }


    return (
        <div class='d-flex'>
            {/* On récupère les données (items) et un index depuis le tableau de items */}
            {items.map((item, index) =>
                <div key={index} class='card' style={{width: 30 + 'rem'}}>
                    <p>{item.title}</p>
                    <p>{item.description}</p>
                    <p>Prix: {item.price} €</p>
                    <button >Ajouter au panier</button>
                </div>)}
        </div>
    );
}

export default ItemComponent;