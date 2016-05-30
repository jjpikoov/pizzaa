package com.pizzaa.domain.dish.persistance;

import com.pizzaa.domain.dish.Dish;
import com.pizzaa.domain.dish.Ingredient;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by jjpikoov on 5/18/16.a
 */
@Entity
@Table
public class DishIngredient implements Serializable{

    @Id
    @ManyToOne
    private Dish dish;

    @Id
    @ManyToOne
    private Ingredient ingredient;

    public  DishIngredient(Dish dish, Ingredient ingredient){
        this.dish = dish;
        this.ingredient = ingredient;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        DishIngredient that = (DishIngredient) o;
        return Objects.equals( dish, that.dish ) &&
                Objects.equals( ingredient, that.ingredient );
    }

    @Override
    public int hashCode() {
        return Objects.hash(dish, ingredient);
    }
}
