package com.example.Exercice05_Furniture.dao;

import com.example.Exercice05_Furniture.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
