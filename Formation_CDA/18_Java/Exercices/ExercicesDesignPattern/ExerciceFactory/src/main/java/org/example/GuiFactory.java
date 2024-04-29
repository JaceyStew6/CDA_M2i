package org.example;

public abstract class GuiFactory {

    public abstract Ingredient createIngredient();
    public abstract CookingUstensil createUstensil();
    public abstract Dish createDish();

}
