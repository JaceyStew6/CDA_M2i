package org.example;

public class ItalianIngredient extends Ingredient{

    @Override
    public void prepare(){
        System.out.println("Vous préparez un plat italien");
    }
}
