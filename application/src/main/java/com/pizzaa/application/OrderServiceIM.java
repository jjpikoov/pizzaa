package com.pizzaa.application;

import com.pizzaa.application.interfaces.OrderService;
import com.pizzaa.domain.dish.Dish;
import com.pizzaa.domain.order.Delivery;
import com.pizzaa.domain.order.Order;
import com.pizzaa.domain.order.repository.OrderRepository;
import com.pizzaa.infrastructure.repository.OrderRepositoryIM;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 5/4/16.
 */
public class OrderServiceIM implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceIM(){
        this.orderRepository = new OrderRepositoryIM();
    }

    public OrderServiceIM(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }


    public ArrayList<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    public void addOrder(Order o) {
        this.orderRepository.insert(o);
    }

    public boolean removeOrder(int id) {
        return this.orderRepository.delete(id);
    }

    public Order getOrder(int id) {
        return this.orderRepository.find(id);
    }

    public void addDishToOrder(Dish d, Order o) {
        o.getDishes().add(d);
    }

    public boolean removeDishFromOrder(Dish d, Order o) {
        return o.getDishes().remove(d);
    }

    public void setDeliveryToOrder(Delivery d, Order o) {
        o.setDelivery(d);
    }
}
