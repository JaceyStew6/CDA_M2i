package com.example.Exercice05_Furniture.service;

import com.example.Exercice05_Furniture.dao.CartItemRepository;
import com.example.Exercice05_Furniture.entity.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService implements ICartItemService{
    private CartItemRepository cartItemRepository;

    @Autowired
    public CartItemService (CartItemRepository cartItemRepository){
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    @Override
    public CartItem addToCart(CartItem cartItem) {
        cartItemRepository.save(cartItem);
        return cartItem;
    }

    @Override
    public void removeFromCart(CartItem cartItem) {
        cartItemRepository.delete(cartItem);
    }
}
