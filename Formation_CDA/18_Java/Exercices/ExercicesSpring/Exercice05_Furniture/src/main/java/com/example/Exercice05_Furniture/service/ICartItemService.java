package com.example.Exercice05_Furniture.service;

import com.example.Exercice05_Furniture.entity.CartItem;

import java.util.List;

public interface ICartItemService {
    List<CartItem> getAllCartItems();
    CartItem addToCart(CartItem cartItem);
    void removeFromCart(CartItem cartItem);
    //TODO ajouter méthode clearCart
}