package com.pizzaa.application;

import com.pizzaa.application.interfaces.AdminService;
import com.pizzaa.domain.admin.Admin;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jjpikoov on 5/14/16.
 */


@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class App {

    public static void main(String [] args) {


//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        context.register(SpringConfiguration.class);
//        context.refresh();
        AdminService adminService = (AdminService) context.getBean("adminService");

        Admin a1 = new Admin();
        a1.setLogin("jjpikoov");
        a1.setPassword("jjpassw");
        a1.setEmail("emailjj");

        adminService.addAdmin(a1);

        context.close();
    }
}
