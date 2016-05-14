package com.pizzaa.application;

import com.pizzaa.application.interfaces.CustomerService;
import com.pizzaa.domain.customer.Customer;
import com.pizzaa.domain.order.Order;
import com.pizzaa.objectmother.CustomerObjectMother;
import junit.framework.TestCase;

/**
 * Created by jjpikoov on 5/11/16.
 */
public class CustomerServiceIMTest extends TestCase {

    private CustomerService customerServiceIM;

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
        Customer c = customerServiceIM.getCustomer(1);
        assertTrue(c == null);
        customerServiceIM.addCustomer(CustomerObjectMother.customerWithoutOrders(1));
        int size = customerServiceIM.getAllCustomers().size();
        assertTrue(customerServiceIM.getAllCustomers().size() == size);
    }

    public void testAddOrderToCustomer() throws Exception {
        Customer c = CustomerObjectMother.customerWithoutOrders(1);
        customerServiceIM.addCustomer(c);

        assertTrue(c.getOrders().size() == 0);
        Order o =  new Order();

        customerServiceIM.addOrderToCustomer(c, o);
        assertTrue(c.getOrders().size() != 0);

    }

    public void testRemoveOrderFromCustomer() throws Exception {
        Customer c = CustomerObjectMother.customerWithOneFakeOrder(1);
        customerServiceIM.addCustomer(c);
        assertTrue(customerServiceIM.getCustomer(c.getId()).getOrders().size() == 1);


        Order o = c.getOrders().get(0);

        customerServiceIM.removeOrderFromCustomer(c, o);
        assertTrue(customerServiceIM.getCustomer(c.getId()).getOrders().size() == 0);


    }

    public void testConfirmEmail() throws Exception {
        Customer c = CustomerObjectMother.customerWithoutOrdersNonConfirmedMail(1);
        customerServiceIM.addCustomer(c);
        assertTrue(c.isConfirmedEmail() == false);
        customerServiceIM.confirmEmail(c);
        assertTrue(c.isConfirmedEmail() == true);

    }

}