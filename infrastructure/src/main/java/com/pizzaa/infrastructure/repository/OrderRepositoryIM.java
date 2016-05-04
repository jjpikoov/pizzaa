package com.pizzaa.infrastructure.repository;

import com.pizzaa.domain.order.Order;
import com.pizzaa.domain.order.repository.OrderRepository;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 5/4/16.
 */
public class OrderRepositoryIM implements OrderRepository {
    private ArrayList<Order> orders;

    public OrderRepositoryIM(){
        orders = new ArrayList<Order>();
    }

    public void insert(Order x) {
        orders.add(x);
    }

    public boolean delete(int id) {
        for (Order o : orders){
            if (o.getId() == id){
                return orders.remove(o);
            }
        }
        return false;
    }


    public Order find(int id) {
        Order o = null;
        for (Order order : orders){
            o = order;
            if (o.getId() == id)
                break;
        }
        return o;
    }

    public ArrayList<Order> findAll() {
        return orders;
    }
}
