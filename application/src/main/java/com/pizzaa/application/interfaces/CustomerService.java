package com.pizzaa.application.interfaces;

import com.pizzaa.domain.customer.Customer;
import com.pizzaa.domain.order.Order;

import java.util.List;

/**
 * Created by jjpikoov on 4/9/16.
 */
public interface CustomerService {

    List<Customer> getAllCustomers();
    void addCustomer(Customer c);
    boolean removeCustomer(int id);
    Customer getCustomer(int id);
    void addOrderToCustomer(Customer c, Order o);
    boolean removeOrderFromCustomer(Customer c, Order o);
    void confirmEmail(Customer c);
}
