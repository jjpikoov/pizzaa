package com.pizzaa.infrastructure.repository;

import com.pizzaa.domain.customer.Customer;
import com.pizzaa.domain.customer.repository.CustomerRepository;

import java.util.ArrayList;



/**
 * Created by jjpikoov on 5/4/16.
 */
public class CustomerRepositoryIM implements CustomerRepository {

    private ArrayList<Customer> customers;

    public CustomerRepositoryIM(){
        customers = new ArrayList<Customer>();
    }

    public void insert(Customer x) {
        customers.add(x);
    }

    public boolean delete(int id) {
        for (Customer c : customers){
            if (c.getId() == id){
                return customers.remove(c);
            }
        }
        return false;
    }


    public Customer find(int id) {
        Customer c;

        for (int i = 0; i < customers.size(); i++){
            c = customers.get(i);
            if (c.getId() == id){
                return c;
            }
        }

        return null;
    }

    public ArrayList<Customer> findAll() {
        return customers;
    }
}
