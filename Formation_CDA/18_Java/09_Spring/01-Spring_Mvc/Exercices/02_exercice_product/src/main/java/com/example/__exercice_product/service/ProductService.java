package com.example.__exercice_product.service;

import com.example.__exercice_product.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private final Map<UUID, Product> products;

    public ProductService() {
        products = new HashMap<>();

        Product product1 = Product.builder()
                .id(UUID.randomUUID())
                .name("Produit 1")
                .price(150)
                .category("Informatique")
                .build();

        Product product2 = Product.builder()
                .id(UUID.randomUUID())
                .name("Produit 2")
                .price(1500)
                .category("Informatique")
                .build();

        Product product3 = Product.builder()
                .id(UUID.randomUUID())
                .name("Produit 3")
                .price(15)
                .category("Formation")
                .build();

        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);
    }

    public List<Product> getAllProducts() {
        return products.values().stream().toList();
    }

    public Product getProductById(UUID id) {
        return products.get(id);
    }

    public List<Product> getProductByCategoryAndMaxPrice(String category, double maxPrice) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getCategory().equalsIgnoreCase(category) && product.getPrice() < maxPrice) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
