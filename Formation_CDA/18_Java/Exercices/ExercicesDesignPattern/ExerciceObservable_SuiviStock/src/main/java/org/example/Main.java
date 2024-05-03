package org.example;

public class Main {
    public static void main(String[] args) {
        int stock = 0;
        ProductStock productStock = new ProductStock();
        productStock.registerObserver(new StockManager());
        productStock.registerObserver(new Supplier());
        productStock.notifyObservers(stock);
        System.out.println("--------------");
        stock = 10;
        productStock.notifyObservers(stock);
        System.out.println("--------------");
        stock = 20;
        productStock.notifyObservers(stock);
        System.out.println("--------------");
        Supplier supplier1 = new Supplier();
        productStock.registerObserver(supplier1);
        productStock.notifyObservers(stock);
        System.out.println("--------------");
        productStock.removeObserver(supplier1);
        productStock.notifyObservers(stock);
    }
}