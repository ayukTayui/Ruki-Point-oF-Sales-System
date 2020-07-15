/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.jtpos_system.entities.UserDetail;

/**
 *
 * @author ayuk
 */
@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Integer>{
    
}
