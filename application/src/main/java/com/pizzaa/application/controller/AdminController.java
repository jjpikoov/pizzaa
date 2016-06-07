package com.pizzaa.application.controller;

import com.pizzaa.application.interfaces.AdminService;
import com.pizzaa.domain.admin.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jjpikoov on 6/6/16.
 */

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/haa", method = RequestMethod.GET)
    @ResponseBody
    public String shellosdfsdfsdfss(){

        Admin a = new Admin();
        a.setLogin("cont1");
        a.setPassword("cont1pas");

        adminService.addAdmin(a);
        return "yes";
    }
}
