package com.pizzaa.application.interfaces;

import com.pizzaa.domain.customer.Customer;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public interface CustomerService {
    ArrayList<Customer> getAllCustomers();
    void addCustomer(Customer c);
    boolean removeCustomer(Customer c);
}
