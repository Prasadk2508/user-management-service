package com.pd.usm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.usm.entities.User;
import com.pd.usm.repositories.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User createUser(User user){
		return userRepo.save(user);
	}

	public Optional<User> getUserById(long id) {
		return userRepo.findById(id);
	}

	public User updateUserById(long id, User user) {
		user.setId(id);
		return userRepo.save(user);
	}
	
	public void deleteUserById(long id){
		if(userRepo.findById(id).isPresent()) {
			userRepo.deleteById(id);
		}
		
	}

	public User getUserByName(String name) {
		return userRepo.findByUsername(name);
	}

	
}
