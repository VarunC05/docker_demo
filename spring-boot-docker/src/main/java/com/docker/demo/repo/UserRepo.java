/**
 * 
 */
package com.docker.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.demo.modal.User;

/**
 * @author Varun.C
 *
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
