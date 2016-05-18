package com.pizzaa.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by jjpikoov on 5/15/16.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory(){
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            configuration.addAnnotatedClass(com.pizzaa.domain.admin.Admin.class);
            configuration.addAnnotatedClass(com.pizzaa.domain.order.Order.class);
            configuration.addAnnotatedClass(com.pizzaa.domain.order.Delivery.class);
            configuration.addAnnotatedClass(com.pizzaa.domain.dish.Dish.class);
            configuration.addAnnotatedClass(com.pizzaa.domain.dish.Ingredient.class);
            configuration.addAnnotatedClass(com.pizzaa.domain.dish.persistance.DishIngredient.class);
            configuration.addAnnotatedClass(com.pizzaa.domain.customer.Customer.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            return sessionFactory;
        }
        catch(Throwable ex){
            System.err.println("Initial Session Factory creation failed");
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null)
            sessionFactory = buildSessionFactory();
        return sessionFactory;
    }


}
