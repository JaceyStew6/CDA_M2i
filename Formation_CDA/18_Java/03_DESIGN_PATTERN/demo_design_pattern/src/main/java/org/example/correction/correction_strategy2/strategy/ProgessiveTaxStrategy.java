package org.example.correction.correction_strategy2.strategy;

import org.example.correction.correction_strategy2.TaxStrategy;

public class ProgessiveTaxStrategy implements TaxStrategy {
    @Override
    public double clalculateTax(double income) {
        if (income < 20000)
            return income * 0.1;
        else if(income < 50000)
            return income * 0.2;
        else
            return income * 0.3;
    }
}
