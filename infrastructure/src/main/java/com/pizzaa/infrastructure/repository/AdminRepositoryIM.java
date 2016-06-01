package com.pizzaa.infrastructure.repository;

import com.pizzaa.domain.admin.Admin;
import com.pizzaa.domain.admin.repository.AdminRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjpikoov on 5/4/16.
 */
public class AdminRepositoryIM implements AdminRepository {

    private ArrayList<Admin> admins;

    public AdminRepositoryIM(){
        admins = new ArrayList<Admin>();
    }


    public void insert(Admin x) {
        admins.add(x);
    }

    public boolean delete(int id) {

        for (Admin a : admins){
            if (a.getId() == id){
                return admins.remove(a);
            }
        }
        return false;
    }


    public Admin find(int id) {
        Admin a = null;

        for (int i = 0; i < admins.size(); i++){
            a = admins.get(i);
            if (a.getId() == id){
                break;
            }
        }
        return a;

    }

    public List<Admin> findAll() {
        return admins;
    }
}
