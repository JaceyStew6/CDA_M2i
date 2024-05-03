package org.example;

public class MexicanCuisineFactory extends GuiFactory{

    @Override
    public Ingredient createIngredient(){
        return new MexicanIngredient();
    }

    @Override
    public CookingUstensil createUstensil(){
        return new MexicanUstensil();
    }

    @Override
    public Dish createDish(){
        return new MexicanDish();
    }
}
