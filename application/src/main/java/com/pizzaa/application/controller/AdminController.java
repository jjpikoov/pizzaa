package com.pizzaa.application.controller;

import com.pizzaa.application.interfaces.AdminService;
import com.pizzaa.domain.admin.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jjpikoov on 6/6/16.
 */

@Controller
@RequestMapping("/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "haa", method = RequestMethod.GET)
    public String hello(){

        Admin a = new Admin();
        a.setLogin("cont1");
        a.setPassword("cont1pas");

        adminService.addAdmin(a);
        return "yes";
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String admin(Model model){
        model.addAttribute("x", "foo");
        return "admin";
    }
}
