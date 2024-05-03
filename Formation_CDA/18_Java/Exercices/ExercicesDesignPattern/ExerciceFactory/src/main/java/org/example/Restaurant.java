package org.example;

public class Restaurant {
    private Ingredient ingredient;
    private CookingUstensil cookingUstensil;
    private Dish dish;

    public Restaurant(GuiFactory factory){
        ingredient = factory.createIngredient();
        cookingUstensil = factory.createUstensil();
        dish = factory.createDish();
    }
}
