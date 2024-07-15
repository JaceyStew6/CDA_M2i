package org.example.springsecurityjwt.service;

import org.example.springsecurityjwt.dao.ProductRepository;
import org.example.springsecurityjwt.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}