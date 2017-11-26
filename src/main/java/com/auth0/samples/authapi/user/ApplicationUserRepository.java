/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auth0.samples.authapi.user;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sarthak
 */
@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    
    ApplicationUser findByUsername(String username);
    
}
