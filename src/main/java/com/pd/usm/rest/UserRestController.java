package com.pd.usm.rest;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pd.usm.entities.User;
import com.pd.usm.services.UserService;

import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class UserRestController {

	@Autowired
	private UserService userservice;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userservice.getAllUsers();
	}
	
	@PostMapping("addUser")
	public User createUser(@RequestBody User user){
		return userservice.createUser(user);
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable long id) {
		return userservice.getUserById(id);
	}
	
	@PutMapping("/update/{id}")
	public User updateUserById(@PathVariable long id, @RequestBody User user) {
		return userservice.updateUserById(id,user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUserById(@PathVariable long id) {
		userservice.deleteUserById(id);
	}
	
	@GetMapping("/userByName/{name}")
	public User getUserByName(@PathVariable("username") String name) {
		return userservice.getUserByName(name);
	}
	
}
