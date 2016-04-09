package com.pizzaa.application;

import com.pizzaa.application.interfaces.DishService;
import com.pizzaa.domain.dish.Dish;
import com.pizzaa.objectmother.DishObjectMother;
import junit.framework.TestCase;

/**
 * Created by jjpikoov on 4/9/16.
 */
public class DishServiceIMTest extends TestCase {

    public void testGetAllDishes() throws Exception {
        DishService dishService = new DishServiceIM();

        Dish d1 = DishObjectMother.dishWithOneIngredient(3);
        Dish d2 = DishObjectMother.dishWithoutIngredients(4);

        dishService.addDish(d1);
        dishService.addDish(d2);

        assertEquals(true, dishService.getAllDishes().size() == 4);

    }

    public void testAddDish() throws Exception {

        DishService dishService = new DishServiceIM();
        assertEquals(true, dishService.getAllDishes().size() == 2);

        Dish d = DishObjectMother.dishWithoutIngredients(3);
        assertEquals(true, d.getIngredients() == null);

        dishService.addDish(d);
        assertEquals(true,  dishService.getAllDishes().size() == 3);

    }

    public void testRemoveDish() throws Exception {
        DishService dishService = new DishServiceIM();

        Dish d = DishObjectMother.dishWithoutIngredients(3);
        assertEquals(true, dishService.getAllDishes().size() == 2);
        for (Dish dish : dishService.getAllDishes()){
            assertEquals(true, dish.getIngredients() != null);
        }
        dishService.addDish(d);
        assertEquals(true, dishService.getAllDishes().size() == 3);
        boolean x = dishService.removeDish(d);
        assertEquals(true, x);
        assertEquals(true, dishService.getAllDishes().size() == 2);
        for (Dish dish : dishService.getAllDishes()){
            assertEquals(true, dish.getIngredients() != null);
        }

        Dish d2 = DishObjectMother.dishWithOneIngredient(5);
        x = dishService.removeDish(d2);
        assertEquals(true, dishService.getAllDishes().size() == 2);
        assertEquals(false, x);
        assertEquals(true, dishService.getAllDishes().size() == 2);


    }

}