package com.pizzaa.application;

import com.pizzaa.application.interfaces.AdminService;
import com.pizzaa.domain.admin.Admin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jjpikoov on 5/14/16.
 */



public class App {

    public static void main(String [] args) {


//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        AdminService adminService = (AdminService) context.getBean("adminService");

        Admin a1 = new Admin();
        a1.setLogin("jjpikoov");
        a1.setPassword("jjpassw");
        a1.setEmail("emailjj");

        adminService.addAdmin(a1);

        context.close();
    }
}
