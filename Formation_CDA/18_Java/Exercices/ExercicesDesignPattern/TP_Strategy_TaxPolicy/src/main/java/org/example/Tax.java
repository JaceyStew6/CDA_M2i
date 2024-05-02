package org.example;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class Tax {

    private double income;

    public void calculateTax(TaxStrategy taxStrategy){
        taxStrategy.calculateTax(income);
    }
}
