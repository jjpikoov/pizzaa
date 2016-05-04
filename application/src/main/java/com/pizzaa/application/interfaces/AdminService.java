package com.pizzaa.application.interfaces;

import com.pizzaa.domain.admin.Admin;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 5/4/16.
 */
public interface AdminService {
    ArrayList<Admin> getAllAdmins();
    void addAdmin(Admin a);
    boolean removeAdmin(int id);
    Admin getAdmin(int id);
}
