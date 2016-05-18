package com.pizzaa.domain.dish;

import com.pizzaa.domain.dish.persistance.DishIngredient;
import com.pizzaa.domain.order.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjpikoov on 4/9/16.
 */
@Entity
@Table
public class Dish {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private boolean isAvaiable;

    @Column
    private double cost;

    @Column
    private double totalWeight;

    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DishIngredient> ingredients;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @ManyToOne
    private Order order;

    public Dish(){
        this.ingredients = new ArrayList<DishIngredient>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvaiable() {
        return isAvaiable;
    }

    public void setAvaiable(boolean avaiable) {
        isAvaiable = avaiable;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }


    public List<DishIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<DishIngredient> ingredients) {
        this.ingredients = ingredients;
    }
}
