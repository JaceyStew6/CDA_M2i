package org.example.springsecurityjwt.controller;

import org.example.springsecurityjwt.entity.Product;
import org.example.springsecurityjwt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        product.setName(product.getName());
        product.setPrice(product.getPrice());
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(product));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id){
        productService.deleteProduct(id);
        return ResponseEntity.ok("Product deleted");
    }

}


/*  @PutMapping("/employee/{id}")
    public ResponseEntity<EmployeeDtoGet> updateEmployee(@PathVariable("id") int id, @Validated @RequestBody EmployeeDtoPost employeeDtoPost){
        return ResponseEntity.ok(service.update(id, employeeDtoPost));
    }
}*/
