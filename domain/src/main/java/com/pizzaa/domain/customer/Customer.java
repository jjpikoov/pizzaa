package com.pizzaa.domain.customer;

import com.pizzaa.domain.order.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjpikoov on 4/9/16.
 */
@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String firstName;

    @Column
    private String secondName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private boolean confirmedEmail;

    @Column
    private int phoneNumber;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;

    public Customer(){
        orders = new ArrayList<Order>();
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isConfirmedEmail() {
        return confirmedEmail;
    }

    public void setConfirmedEmail(boolean confirmedEmail) {
        this.confirmedEmail = confirmedEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
