package com.pizzaa.infrastructure.dbrepository;

import com.pizzaa.domain.admin.Admin;
import com.pizzaa.domain.admin.repository.AdminRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



/**
 * Created by jjpikoov on 5/30/16.
 */

@Repository
@Transactional
public class AdminRepositoryIM implements AdminRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Admin x) {
        entityManager.persist(x);
    }


    public boolean delete(int id) {
        Admin a = entityManager.find(Admin.class, id);
        entityManager.remove(a);

        if (a == null)
            return false;

        return true;
    }

    public Admin find(int id) {
        return (Admin) entityManager.find(Admin.class, id);
    }

    public List<Admin> findAll() {
        return entityManager.createQuery("SELECT e FROM Admin e").getResultList();
    }
}
