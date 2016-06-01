package com.pizzaa.infrastructure.dbrepository;

import com.pizzaa.domain.admin.Admin;
import com.pizzaa.domain.admin.repository.AdminRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jjpikoov on 5/30/16.
 */

@Service
public class AdminRepositoryIM implements AdminRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void insert(Admin x) {
        sessionFactory.getCurrentSession().save(x);
    }


    public boolean delete(int id) {
        Session s = sessionFactory.getCurrentSession();
        Admin a = s.byId(Admin.class).load(id);
        s.delete(a);

        if (a == null)
            return false;

        return true;
    }

    public Admin find(int id) {
        return sessionFactory.getCurrentSession().byId(Admin.class).load(id);
    }

    public List<Admin> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(Admin.class).list();
    }

//    public List<Admin> findAll() {
//        return sessionFactory.getCurrentSession().createCriteria(Admin.class).list();
//    }
}
