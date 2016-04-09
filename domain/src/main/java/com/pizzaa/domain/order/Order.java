package com.pizzaa.domain.order;

import com.pizzaa.domain.dish.Dish;

import java.text.DateFormat;
import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public class Order {
    private int id;
    private ArrayList<Dish> dishes;
    private Delivery delivery;
    private DateFormat takenAt;
    private DateFormat finishedAt;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public DateFormat getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(DateFormat takenAt) {
        this.takenAt = takenAt;
    }

    public DateFormat getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(DateFormat finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
