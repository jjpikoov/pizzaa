package com.pizzaa.application;

import com.pizzaa.application.interfaces.AdminService;
import com.pizzaa.domain.admin.Admin;
import com.pizzaa.domain.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jjpikoov on 5/4/16.
 */

@Service
public class AdminServiceIM implements AdminService {

    @Autowired
    private AdminRepository adminRepository;


    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }


    public void addAdmin(Admin a) {
        this.adminRepository.insert(a);
    }


    public boolean removeAdmin(int id) {
        return this.adminRepository.delete(id);
    }


    public Admin getAdmin(int id) {
        return this.adminRepository.find(id);
    }
}
