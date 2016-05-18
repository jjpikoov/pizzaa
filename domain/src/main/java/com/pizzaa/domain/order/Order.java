package com.pizzaa.domain.order;

import com.pizzaa.domain.customer.Customer;
import com.pizzaa.domain.dish.Dish;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jjpikoov on 4/9/16.
 */
@Entity(name = "order")
@Table(name="order1")
public class Order {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dish> dishes;


    @OneToOne(mappedBy = "order", orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Delivery delivery;

    @Column
    private Date takenAt;

    @Column
    private Date finishedAt;

    @Column
    private String status;

    @ManyToOne
    private Customer customer;


    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Order(){
        this.dishes = new ArrayList<Dish>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        delivery.setOrder(this);
        this.delivery = delivery;
    }

    public Date getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Date takenAt) {
        this.takenAt = takenAt;
    }

    public Date getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
