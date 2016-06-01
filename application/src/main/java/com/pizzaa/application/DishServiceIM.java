package com.pizzaa.application;

import com.pizzaa.application.interfaces.DishService;
import com.pizzaa.domain.dish.Dish;
import com.pizzaa.domain.dish.Ingredient;
import com.pizzaa.domain.dish.persistance.DishIngredient;
import com.pizzaa.domain.dish.repository.DishRepository;
import com.pizzaa.infrastructure.repository.DishRepositoryIM;

import java.util.List;

/**
 * Created by jjpikoov on 4/9/16.
 */
public class DishServiceIM implements DishService {

    private DishRepository dishRepository = new DishRepositoryIM();

    public DishServiceIM(){
        dishRepository = new DishRepositoryIM(); //???
    }
    public DishServiceIM(DishRepository dishRepository){
        this.dishRepository = dishRepository;
    }

    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    public void addDish(Dish d) {
        dishRepository.insert(d);
    }

    public boolean removeDish(int id) {
        return this.dishRepository.delete(id);
    }

    public Dish getDish(int id) {
        return dishRepository.find(id);
    }

    public void toggleDishAvaiable(Dish d) {
        if (d.isAvaiable())
            d.setAvaiable(false);
        else
            d.setAvaiable(true);
    }

    public void addIngredientToDish(Dish d, Ingredient i) {
        d.getIngredients().add(new DishIngredient(d, i));
    }

    public boolean removeIngredientFromDish(Dish d, Ingredient i) {
        return d.getIngredients().remove(i);
    }


}
