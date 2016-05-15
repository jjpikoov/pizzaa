package com.pizzaa.infrastructure;

import com.pizzaa.domain.admin.Admin;
import com.pizzaa.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Admin a = new Admin();
        a.setId(1);
        a.setLogin("login1");
        a.setPassword("password1");

        Admin a2 = new Admin();
        a2.setId(2);
        a2.setLogin("login2");
        a2.setPassword("password2");



        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(a);
        session.save(a2);
        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();
    }
}
