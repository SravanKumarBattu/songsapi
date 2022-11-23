package com.example.backend.services;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.backend.entity.Users;

@Service
public interface UserService {

	public String SaveUser(Users user);
	
	public Optional<Users> GetUser(String _id);

	public ResponseEntity<Users> UpdateUser(String user_id, Users user);
	
}
