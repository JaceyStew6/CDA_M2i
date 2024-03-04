import { createSlice } from "@reduxjs/toolkit";

const recipesSlice = createSlice({
    name: "recipe",
    initialState: {
        recipes: [],
    },

    reducers: {
        addRecipe: (state, action) => {
            const newRecipe = {
                id: Date.now(),
                title: action.payload.title,
                instructions: action.payload.instructions,
                cookTime: action.payload.cookTime,
                prepTime: action.payload.prepTime,
                ingredients: action.payload.ingredients,
            };
            state.recipes.push(newRecipe);
        },
        updateRecipe: (state, action) => {
            const recipe = state.recipes.find(recipe => recipe.id === action.payload.id);
            recipe.title = action.payload.title
            recipe.instructions = action.payload.instructions
            recipe.cookTime = action.payload.cookTime
            recipe.prepTime = action.payload.prepTime
            recipe.ingredients = action.payload.ingredients
        },
        deleteRecipe: (state, action) => {
            state.recipes = state.recipes.filter((recipe) => recipe.id !== action.payload)
        },
    },
});

export const { addRecipe, updateRecipe, deleteRecipe } = recipesSlice.actions;
export default recipesSlice.reducer;