package com.pizzaa.objectmother;

import com.pizzaa.domain.customer.Customer;

/**
 * Created by jjpikoov on 5/11/16.
 */
public class CustomerObjectMother {

    public static Customer customerWithoutOrders(int id){
        Customer c = new Customer();
        c.setId(id);
        c.setFirstName(Integer.toString(id) + "name");
        c.setSecondName(Integer.toString(id) + "second name");
        c.setEmail(Integer.toString(id) + "email");
        c.setPassword(Integer.toString(id) + "password");
        c.setPhoneNumber(id);
        c.setConfirmedEmail(true);
        //no orders

        return c;
    }


}
