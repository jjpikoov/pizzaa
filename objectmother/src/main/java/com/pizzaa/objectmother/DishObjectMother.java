package com.pizzaa.objectmother;

import com.pizzaa.domain.dish.Dish;
import com.pizzaa.domain.dish.Ingredient;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public class DishObjectMother {

    public static Dish dishWithoutIngredients(int id){

        Dish d = new Dish();
        d.setId(id);
        d.setName("1");
        d.setAvaiable(true);
        d.setCost(10);
        d.setTotalWeight(10);

        return d;
    }

    public static Dish dishWithOneIngredient(int id){
        Dish d = new Dish();
        d.setId(id);
        d.setName("1");
        d.setAvaiable(true);
        d.setCost(10);
        d.setTotalWeight(10);
        Ingredient i1 = new Ingredient();
        i1.setId(1);
        ArrayList<Ingredient> il1 = new ArrayList<Ingredient>();
        il1.add(i1);
        d.setIngredients(il1);

        return d;
    }

    public static Dish dishAvailable(int id){
        Dish d = new Dish();
        d.setAvaiable(true);
        return d;
    }

    public static Dish dishNotAvailable(int id){
        Dish d = new Dish();
        d.setAvaiable(false);
        return d;
    }
}
