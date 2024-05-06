package org.example.correction.correction_strategy2;

public class TaxCalculator {
    private TaxStrategy taxStrategy;

    public TaxCalculator() {

    }

    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax(double income) {
        return taxStrategy.clalculateTax(income);
    }
}
