package org.example;

public class JapaneseIngredient extends Ingredient{
    @Override
    public void prepare(){
        System.out.println("Vous préparez un plat japonnais");
    }
}
