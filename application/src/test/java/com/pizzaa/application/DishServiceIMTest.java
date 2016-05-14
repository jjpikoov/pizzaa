package com.pizzaa.application;

import com.pizzaa.application.interfaces.DishService;
import com.pizzaa.domain.dish.Dish;
import com.pizzaa.domain.dish.Ingredient;
import com.pizzaa.objectmother.DishObjectMother;
import junit.framework.TestCase;

/**
 * Created by jjpikoov on 5/14/16.
 */
public class DishServiceIMTest extends TestCase {

    private DishService dishService;
    Dish d1, d2;

    public void setUp() throws Exception {
        super.setUp();
        dishService = new DishServiceIM();
        d1 = DishObjectMother.dishWithoutIngredients(1);
        d2 = DishObjectMother.dishWithOneIngredient(2);

    }

    public void tearDown() throws Exception {
        dishService = null;
        d1 = null;
        d2 = null;
    }

    public void testGetAllDishes() throws Exception {
        assertTrue(dishService.getAllDishes().size() == 0);
    }

    public void testAddDish() throws Exception {
        dishService.addDish(d1);
        dishService.addDish(d2);
        assertTrue(dishService.getAllDishes().size() == 2);
    }

    public void testRemoveDish() throws Exception {
        dishService.addDish(d1);
        dishService.addDish(d2);


        dishService.removeDish(1);
        assertTrue(dishService.getAllDishes().size() == 1);
        assertTrue(dishService.getDish(1) == null);
    }

    public void testGetDish() throws Exception {
        dishService.addDish(d1);
        dishService.addDish(d2);

        Dish res = dishService.getDish(1);
        assertTrue(d1 == res);
    }

    public void testToggleDishAvaiable() throws Exception {
        d1 = DishObjectMother.dishNotAvailable(1);
        assertTrue(d1.isAvaiable() == false);
        dishService.toggleDishAvaiable(d1);
        assertTrue(d1.isAvaiable() == true);

        d2 = DishObjectMother.dishAvailable(2);
        assertTrue(d2.isAvaiable() == true);
        dishService.toggleDishAvaiable(d2);;
        assertTrue(d2.isAvaiable() == false);

    }

    public void testAddIngredientToDish() throws Exception {
        assertTrue(d1.getIngredients().size() == 0);
        Ingredient i = new Ingredient();
        i.setId(1);
        i.setName(Integer.toString(i.getId()) + "name");
        dishService.addIngredientToDish(d1, i);
        assertTrue(d1.getIngredients().size() == 1);

    }

    public void testRemoveIngredientFromDish() throws Exception {

        assertTrue(d1.getIngredients().size() == 0);
        Ingredient i = new Ingredient();
        i.setId(1);
        i.setName(Integer.toString(i.getId()) + "name");
        dishService.addIngredientToDish(d1, i);
        assertTrue(d1.getIngredients().size() == 1);

        dishService.removeIngredientFromDish(d1, i);
        assertTrue(d1.getIngredients().size() == 0);
    }

}