package com.example.backend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.Users;
import com.example.backend.services.UserService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/v1/user")
	public String saveUser(@RequestBody Users user) {
		service.SaveUser(user);
		return "saved";
	}
	
	@GetMapping("/v1/user/{user_id}")
	public Optional<Users> getUser(@PathVariable String user_id) {
		return service.GetUser(user_id);
	}
	
	@PatchMapping("/v1/user/{user_id}")
	public ResponseEntity<Users> updateUser(@PathVariable String user_id, @RequestBody Users user){
		
		return service.UpdateUser(user_id, user);
	}
}