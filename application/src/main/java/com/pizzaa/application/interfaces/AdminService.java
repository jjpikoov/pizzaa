package com.pizzaa.application.interfaces;

import com.pizzaa.domain.admin.Admin;

import java.util.List;

/**
 * Created by jjpikoov on 5/4/16.
 */
public interface AdminService {
    List<Admin> getAllAdmins();
    void addAdmin(Admin a);
    boolean removeAdmin(int id);
    Admin getAdmin(int id);
}
