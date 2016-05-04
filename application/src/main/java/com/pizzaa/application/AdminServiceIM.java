package com.pizzaa.application;

import com.pizzaa.application.interfaces.AdminService;
import com.pizzaa.domain.admin.Admin;
import com.pizzaa.domain.admin.repository.AdminRepository;
import com.pizzaa.infrastructure.repository.AdminRepositoryIM;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 5/4/16.
 */
public class AdminServiceIM implements AdminService {

    private AdminRepository adminRepository;

    public AdminServiceIM(){
        this.adminRepository = new AdminRepositoryIM();
    }

    public AdminServiceIM(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }

    public ArrayList<Admin> getAllAdmins() {
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
