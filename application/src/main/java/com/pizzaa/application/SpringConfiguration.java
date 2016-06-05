package com.pizzaa.application;

import com.pizzaa.infrastructure.dbrepository.AdminRepositoryIM;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;


/**
 * Created by jjpikoov on 5/31/16.
 */

@ComponentScan(basePackageClasses = {AdminRepositoryIM.class, AdminServiceIM.class})
//@Configuration
//@EnableTransactionManagement
//@ComponentScan({"com.pizzaa.infrastructure", "com.pizza.application"})
public class SpringConfiguration {

    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] {"com.pizzaa.domain"});
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/pizza");
        dataSource.setUsername("jjpikoov");
        dataSource.setPassword("pizza"); //bad practise!!!!
        return dataSource;
    }

    private Properties hibernateProperties(){
        Properties properties = new Properties();
        properties.put("connection_pool_size", 1);
        properties.put("hbm2ddl.auto", "create");
        properties.put("show_sql", "true");

        return properties;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sf){
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sf);
        return txManager;
    }

}
