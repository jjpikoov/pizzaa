package com.pizzaa.objectmother;

import com.pizzaa.domain.admin.Admin;

/**
 * Created by jjpikoov on 5/4/16.
 */
public class AdminObjectMother {

    public static Admin typicalAdmin(int id){
        Admin a = new Admin();
        a.setId(id);
        a.setLogin("login" + Integer.toString(id));
        a.setPassword("password" + Integer.toString(id));
        a.setEmail("email" + Integer.toString(id));

        return a;
    }
}
