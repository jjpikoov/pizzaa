package com.pizzaa.application;

import com.pizzaa.application.interfaces.CustomerService;
import com.pizzaa.domain.customer.Customer;
import com.pizzaa.domain.customer.repository.CustomerRepository;
import com.pizzaa.infrastructure.repository.CustomerRepositoryIM;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 5/4/16.
 */
public class CustomerServiceIM implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceIM(){
        this.customerRepository = new CustomerRepositoryIM();
    }

    public  CustomerServiceIM(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public ArrayList<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomer(Customer c) {
        this.customerRepository.insert(c);
    }

    public boolean removeCustomer(int id) {
        return this.customerRepository.delete(id);
    }

    public Customer getCustomer(int id) {
        return this.customerRepository.find(id);
    }
}
