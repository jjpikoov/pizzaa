package com.pizzaa.application.interfaces;

import com.pizzaa.domain.dish.Dish;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public interface DishService {
    ArrayList<Dish> getAllDishes();
    void addDish(Dish d);
    boolean removeDish(Dish d);
}
