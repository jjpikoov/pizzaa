package com.pizzaa.application.interfaces;

import com.pizzaa.domain.dish.Ingredient;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public interface IngredientService {
    ArrayList<Ingredient> getAllIngredients();
    void addIngredient(Ingredient i);
    boolean removeIngredient(Ingredient i);
}
