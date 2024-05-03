package org.example;

import lombok.Builder;

@Builder

public class Product {
    private int stockLevel;

    public Product(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
}
