package com.pd.usm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.pd.usm.entities.User;

public interface UserRepo extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
