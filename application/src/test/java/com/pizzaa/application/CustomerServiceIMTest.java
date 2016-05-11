package com.pizzaa.application;

import com.pizzaa.domain.customer.Customer;
import com.pizzaa.objectmother.CustomerObjectMother;
import junit.framework.TestCase;

/**
 * Created by jjpikoov on 5/11/16.
 */
public class CustomerServiceIMTest extends TestCase {

    private CustomerServiceIM customerServiceIM;

    public void setUp() throws Exception {
//        super.setUp();
        customerServiceIM = new CustomerServiceIM();
    }

    public void tearDown() throws Exception {
        customerServiceIM = null;
    }

    public void testGetAllCustomers() throws Exception {
        customerServiceIM.addCustomer(CustomerObjectMother.customerWithoutOrders(1));
        customerServiceIM.addCustomer(CustomerObjectMother.customerWithoutOrders(2));

        assertTrue(customerServiceIM.getAllCustomers().size() == 2);
    }

    public void testAddCustomer() throws Exception {
        int size = customerServiceIM.getAllCustomers().size();
        customerServiceIM.addCustomer(CustomerObjectMother.customerWithoutOrders(1));
        assertTrue(customerServiceIM.getAllCustomers().size() == size + 1);
    }

    public void testRemoveCustomer() throws Exception {
        customerServiceIM.addCustomer(CustomerObjectMother.customerWithoutOrders(1));
        customerServiceIM.addCustomer(CustomerObjectMother.customerWithoutOrders(2));

        int size = customerServiceIM.getAllCustomers().size();

        boolean b = customerServiceIM.removeCustomer(1);
        assertTrue(b == true);
        assertTrue(customerServiceIM.getAllCustomers().size() == size - 1);
        Customer c = customerServiceIM.getCustomer(3);
        assertTrue(c == null);
        b = customerServiceIM.removeCustomer(1);
        assertTrue(b == false);


    }

    public void testGetCustomer() throws Exception {

    }

    public void testAddOrderToCustomer() throws Exception {

    }

    public void testRemoveOrderFromCustomer() throws Exception {

    }

    public void testConfirmEmail() throws Exception {

    }

}