package org.example.correction.correction_observable;

public class Supplier implements Observer<Product> {
    @Override
    public void update(Product element) {
        System.out.println("The supplier got the new stock level "+ element.getStockLevel());
    }
}
