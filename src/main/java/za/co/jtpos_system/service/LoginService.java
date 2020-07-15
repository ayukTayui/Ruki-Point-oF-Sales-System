/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.jtpos_system.entities.LoginDetail;
import za.co.jtpos_system.repositories.LoginDetailRepository;

/**
 *
 * @author ayuk
 */
@Service
public class LoginService {
    
    @Autowired
    private LoginDetailRepository loginRepo;
    
    public void addLogin(LoginDetail login){
        loginRepo.save(login);
    }
    
    public String logIn(String id,String password){
    List<LoginDetail> logs = loginRepo.findAll();
        for (LoginDetail log : logs) {
            if(log.getUsername().equals(id) && log.getPassword().equals(password)){
                return "Hello And " + log.getUsername()+ "   Welcome To Ruki Point Of Sales Sytem";
            }else{
                return "Invalid Username And Password";
            }
        }
    return "Bye";
    }
}
