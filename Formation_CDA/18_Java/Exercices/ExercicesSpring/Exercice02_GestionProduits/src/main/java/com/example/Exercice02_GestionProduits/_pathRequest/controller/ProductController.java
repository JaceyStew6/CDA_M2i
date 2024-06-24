package com.example.Exercice02_GestionProduits._pathRequest.controller;

import com.example.Exercice02_GestionProduits._pathRequest.model.Product;
import com.example.Exercice02_GestionProduits._pathRequest.service.ProductService;
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
    public String homePage(){
        return "homePage";
    }

    @GetMapping("/detail/{id}")
    public String detailPage(@PathVariable("id")UUID id, Model model){
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "detailPage";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "listPage";
    }

    @GetMapping("/search") // /search?productName=PS5
    public String showProduct(@RequestParam(name = "productName", required = false) String name, Model model){
        Product product = productService.getProductByName(name);

        if(product != null){
            model.addAttribute("product", product);
            return "detailPage";
        } else {
            return "homePage";
        }
    }
}