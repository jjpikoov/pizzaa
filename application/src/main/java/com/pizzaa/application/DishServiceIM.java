package com.pizzaa.application;

import com.pizzaa.application.interfaces.DishService;
import com.pizzaa.domain.dish.Dish;
import com.pizzaa.domain.dish.repository.DishRepository;
import com.pizzaa.infrastructure.repository.DishRepositoryIM;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public class DishServiceIM implements DishService {

    private DishRepository dishRepository = new DishRepositoryIM();

    public DishServiceIM(){
        dishRepository = new DishRepositoryIM(); //???
    }

    public ArrayList<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    public void addDish(Dish d) {
        dishRepository.insert(d);
    }

    public boolean removeDish(Dish d) {
        Dish dish = dishRepository.delete(d.getId());
        if (dish != null)
            return true;
        return false;
    }
}
