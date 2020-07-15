/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.jtpos_system.data_transfer.ReceiptDt;
import za.co.jtpos_system.data_transfer.Sales;
import za.co.jtpos_system.entities.LoginDetail;
import za.co.jtpos_system.entities.UserDetail;
import za.co.jtpos_system.service.CustomerPurchaseService;
import za.co.jtpos_system.service.LoginService;
import za.co.jtpos_system.service.UserDetailService;

/**
 *
 * @author ayuk
 */
@RestController
public class UserController {
    @Autowired
    private UserDetailService userService;
    @Autowired
    private LoginService loginService;
    
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, value = "registration/addUser")
    public void addUser(@RequestBody UserDetail user){
        LoginDetail login = user.getLogin();
        
     user.setLogin(login);
        loginService.addLogin(login);
           userService.addUser(user);
    }
    
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.GET, value ="signIn/login")
    public String userLogin(@RequestBody LoginDetail login){
        return loginService.logIn(login.getUsername(),login.getPassword());
    }
    
    
}
