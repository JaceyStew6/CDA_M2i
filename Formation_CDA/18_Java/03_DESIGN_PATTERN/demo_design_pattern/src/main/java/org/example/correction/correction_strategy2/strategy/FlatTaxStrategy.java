package org.example.correction.correction_strategy2.strategy;

import org.example.correction.correction_strategy2.TaxStrategy;

public class FlatTaxStrategy implements TaxStrategy {
    @Override
    public double clalculateTax(double income) {
        return income * 0.15;
    }
}
