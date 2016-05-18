package com.pizzaa.domain.dish;

import com.pizzaa.domain.dish.persistance.DishIngredient;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjpikoov on 4/9/16.
 */
@Entity
@Table
public class Ingredient {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double weight;

    @OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DishIngredient> dishes = new ArrayList<DishIngredient>();

    public List<DishIngredient> getDishes() {
        return dishes;
    }

    public void setDishes(List<DishIngredient> dishes) {
        this.dishes = dishes;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
