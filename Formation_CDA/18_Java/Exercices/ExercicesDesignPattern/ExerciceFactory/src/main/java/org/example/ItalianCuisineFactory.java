package org.example;

public class ItalianCuisineFactory extends GuiFactory{

    @Override
    public Ingredient createIngredient(){
        return new ItalianIngredient();
    }

    @Override
    public CookingUstensil createUstensil(){
        return new ItalianUstensil();
    }

    @Override
    public Dish createDish(){
        return new ItalianDish();
    }

}
