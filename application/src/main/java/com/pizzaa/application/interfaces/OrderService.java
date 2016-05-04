package com.pizzaa.application.interfaces;

import com.pizzaa.domain.order.Order;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public interface OrderService {
    ArrayList<Order> getAllOrders();
    void addOrder(Order o);
    boolean removeOrder(int id);
    Order getOrder(int id);
}
