package org.example;

public class StockManager implements Observer{

    @Override
    public void update(Product product) {
        System.out.println("Actualisation du stock pour le StockManager " + product.getStockLevel());
    }
}
