package com.pizzaa.infrastructure.repository;

import com.pizzaa.domain.dish.Dish;
import com.pizzaa.domain.dish.Ingredient;
import com.pizzaa.domain.dish.repository.DishRepository;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public class DishRepositoryIM implements DishRepository {
    private ArrayList<Dish> dishes;

    public DishRepositoryIM(){
        dishes = new ArrayList<Dish>();

        Dish d1 = new Dish();
        d1.setId(1);
        d1.setName("1");
        d1.setAvaiable(true);
        d1.setCost(10);
        d1.setTotalWeight(10);
        Ingredient i1 = new Ingredient();
        i1.setId(1);
        ArrayList<Ingredient> il1 = new ArrayList<Ingredient>();
        il1.add(i1);
        d1.setIngredients(il1);

        dishes.add(d1);


        Dish d2 = new Dish();
        d2.setId(2);
        d2.setName("2");
        d2.setAvaiable(false);
        d2.setCost(20);
        d2.setTotalWeight(20);
        Ingredient i2 = new Ingredient();
        i2.setId(2);
        ArrayList<Ingredient> il2 = new ArrayList<Ingredient>();
        il2.add(i2);
        d2.setIngredients(il2);

        dishes.add(d2);
    }

    public void insert(Dish x) {
        dishes.add(x);
    }

    public Dish delete(int id) {
        Dish d = null;
        for (int i = 0; i < dishes.size(); i++){
            Dish dish = dishes.get(i);
            if (dish.getId() == id){
                d = dish;
                dishes.remove(d);
            }
        }
        return d;
    }

    public Dish find(int id) {
        for (Dish d : dishes){
            if (d.getId() == id)
                return d;
        }
        return null;
    }

    public ArrayList<Dish> findAll() {
        return dishes;
    }
}
