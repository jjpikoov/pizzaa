package com.pizzaa.application.controller;

import com.pizzaa.application.interfaces.AdminService;
import com.pizzaa.domain.admin.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jjpikoov on 6/6/16.
 */

@Controller
@RequestMapping("/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "helper", method = RequestMethod.GET)
    public String helper(){
        Admin a = new Admin();
        a.setLogin("foo");
        a.setPassword("foo");
        a.setEmail("foo");
        adminService.addAdmin(a);
        return "redirect:/admin.html";
    }


    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String admin(Model model){
        model.addAttribute("admins", adminService.getAllAdmins());
        model.addAttribute("title", "Admins");
        return "admin";
    }


    @RequestMapping(value = "addadmin", method = RequestMethod.GET)
    public String addadminGet(Model model){
        model.addAttribute("title", "Add Admin");
        return "addadmin";
    }


    @RequestMapping(value = "addadmin", method = RequestMethod.POST)
    public String addadminPost(@RequestParam String login,
                               @RequestParam String password,
                               @RequestParam String email){
        Admin a = new Admin();
        a.setLogin(login);
        a.setPassword(password);
        a.setEmail(email);
        adminService.addAdmin(a);
        return "redirect:/admin.html";
    }


    @RequestMapping(value = "removeadmin/{id}")
    public String removeadmin(@PathVariable int id){
        adminService.removeAdmin(id);

        return "redirect:/admin.html";
    }


}
