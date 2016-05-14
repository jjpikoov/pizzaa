package com.pizzaa.application.interfaces;

import com.pizzaa.domain.dish.Dish;
import com.pizzaa.domain.dish.Ingredient;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public interface DishService {
    ArrayList<Dish> getAllDishes();
    void addDish(Dish d);
    boolean removeDish(int id);
    Dish getDish(int id);
    void toggleDishAvaiable(Dish d);
    void addIngredientToDish(Dish d, Ingredient i);
    boolean removeIngredientFromDish(Dish d, Ingredient i);
}
