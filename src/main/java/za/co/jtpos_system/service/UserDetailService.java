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
import za.co.jtpos_system.entities.UserDetail;
import za.co.jtpos_system.repositories.LoginDetailRepository;
import za.co.jtpos_system.repositories.UserDetailRepository;

/**
 *
 * @author ayuk
 */
@Service
public class UserDetailService {
    
    @Autowired
    private UserDetailRepository userRepo;
    @Autowired
    private LoginDetailRepository loginRepo;
    
    public void addUser(UserDetail user){
        userRepo.save(user);
    }
    
    
}
