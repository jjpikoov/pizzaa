package com.pizzaa.application;

import com.pizzaa.application.interfaces.AdminService;
import com.pizzaa.domain.admin.Admin;
import com.pizzaa.domain.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jjpikoov on 5/4/16.
 */

@Service("adminService")
@Transactional
public class AdminServiceIM implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

//    public AdminServiceIM(){
//        this.adminRepository = new AdminRepositoryIM();
//    }

//    public AdminServiceIM(AdminRepository adminRepository){
//        this.adminRepository = adminRepository;
//    }

//    @Transactional
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

//    @Transactional
    public void addAdmin(Admin a) {
        this.adminRepository.insert(a);
    }

//    @Transactional
    public boolean removeAdmin(int id) {
        return this.adminRepository.delete(id);
    }

//    @Transactional
    public Admin getAdmin(int id) {
        return this.adminRepository.find(id);
    }
}
