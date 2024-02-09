/**
 * 
 */
package com.docker.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.demo.modal.User;
import com.docker.demo.repo.UserRepo;

/**
 * @author Varun.C
 *
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Docker demo updated...";
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@PostMapping("/saveUser")
	public User createUser(@RequestBody User user) {
		return userRepo.save(user);
	}

}
