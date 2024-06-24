package com.example.Exercice02_GestionProduits._pathRequest.service;

import com.example.Exercice02_GestionProduits._pathRequest.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ProductService {
    private final Map<UUID, Product> products;

    public ProductService(){
        products = new HashMap<>();

        Product product1 = Product.builder()
                .id(UUID.randomUUID())
                .name("PS5")
                .category("Gaming console")
                .price(550.00)
                .build();

        Product product2= Product.builder()
                .id(UUID.randomUUID())
                .name("Xbox Series S")
                .category("Gaming console")
                .price(399.00)
                .build();

        Product product3 = Product.builder()
                .id(UUID.randomUUID())
                .name("Nintendo Switch")
                .category("Gaming console")
                .price(329.00)
                .build();

        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);
    }

    public List<Product> getAllProducts(){
        return products.values().stream().toList();
    }

    public Product getProductById(UUID id){
        return products.get(id);
    }

    public Product getProductByName(String name){
        return products.values().stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
    }
}
