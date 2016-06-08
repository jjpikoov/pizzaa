package com.pizzaa.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jjpikoov on 6/6/16.
 */

@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

}

