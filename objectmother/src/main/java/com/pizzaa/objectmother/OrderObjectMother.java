package com.pizzaa.objectmother;

import com.pizzaa.domain.dish.Dish;
import com.pizzaa.domain.order.Order;

/**
 * Created by jjpikoov on 5/14/16.
 */
public class OrderObjectMother {



    public static Order orderWithoutDeliveryAndDishes(int id){
        Order o = new Order();
        o.setId(id);
        o.setStatus(Integer.toString(id) + "status");
        return o;
    }

    public static Order orderWithOneDish(int id){
        Order o = new Order();
        o.setId(id);
        o.setStatus(Integer.toString(id) + "status");
        Dish d = new Dish();
        o.getDishes().add(d);
        return o;
    }
}
