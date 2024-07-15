package org.example.springsecurityjwt.dao;

import org.example.springsecurityjwt.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
