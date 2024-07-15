package org.example.springsecurityjwt.service;

import org.example.springsecurityjwt.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    Product saveProduct(Product product);
    Product getProductById(int id);
    void deleteProduct(int id);
}