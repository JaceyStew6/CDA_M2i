package org.example.correction.correction_observable;

public class StockManager implements Observer<Product> {
    @Override
    public void update(Product element) {
        System.out.println("The stock manager got the new stock level "+ element.getStockLevel());
    }
}
