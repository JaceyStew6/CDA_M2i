package org.example.correction.correction_strategy2.strategy;

import org.example.correction.correction_strategy2.TaxStrategy;

public class VATStrategy  implements TaxStrategy {

    private final double rate;

    public VATStrategy(double rate) {
        this.rate = rate;
    }

    @Override
    public double clalculateTax(double income) {
        return income * rate;
    }
}
