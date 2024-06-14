package org.example.exercice6.service;

import org.example.exercice6.model.Product;
import org.example.exercice6.repository.ProductRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.time.LocalDate;
import java.util.List;

public class ProductService {
    private ProductRepository productRepository;
    private SessionFactory _sessionFactory;
    private Session session;

    public ProductService(SessionFactory sessionFactory){
        _sessionFactory = sessionFactory;
    }

    public Product getProduct(int id){
        Product product = null;
        session = _sessionFactory.openSession();
        productRepository = new ProductRepository(session);
        try {
            product = productRepository.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return product;
    }

    public boolean createProduct(String brand, String reference, LocalDate purchaseDate, double price, int stock){
        boolean result = false;
        session = _sessionFactory.openSession();
        session.beginTransaction();
        productRepository = new ProductRepository(session);
        Product product = new Product(brand, reference, purchaseDate, price, stock);
        try {
            productRepository.create(product);
            session.getTransaction().commit();
            result = true;
        }catch (Exception except){
            try {
                session.getTransaction().rollback();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }finally {
            session.close();
        }
        return result;
    }

    List<Product> getProducts(){
        List<Product> products = null;
        session = _sessionFactory.openSession();
        productRepository = new ProductRepository(session);
        try {
            products = productRepository.findAll();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return products;
    }

}
