package com.example.__exercice_product.controller;

import com.example.__exercice_product.model.Product;
import com.example.__exercice_product.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String getProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }

    @GetMapping("/product/{productId}")
    public String getProduct(Model model, @PathVariable("productId")UUID productId) {
        Product product = productService.getProductById(productId);
        model.addAttribute("product", product);
        return "product-detail";
    }

    @GetMapping("/products/filter")
    public String getProductsByCategoryAndMaxPrice(
            @RequestParam(value = "category", required = false) String category,
            @RequestParam(value = "maxPrice", required = false) Double maxPrice,
            Model model) {
        List<Product> filteredProducts = productService.getProductByCategoryAndMaxPrice(category, maxPrice);
        model.addAttribute("products", filteredProducts);
        return "product-list";
    }
}
