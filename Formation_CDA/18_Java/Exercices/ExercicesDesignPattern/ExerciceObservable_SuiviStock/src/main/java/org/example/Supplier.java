package org.example;

public class Supplier implements Observer{
    @Override
    public void update(Product product) {
        System.out.println("Actualisation du stock pour le Supplier " + product.getStockLevel());
    }
}
