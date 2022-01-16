package com.aulasagendamentos.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulasagendamentos.entity.User;
import com.aulasagendamentos.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
    private UserService userService;
	//Create a new user
	@PostMapping
	public ResponseEntity<?> create (@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	}
	
	//Read an user
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long userId){
		
		Optional<User> oUser = userService.findById(userId);
		
		if(!oUser.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oUser);
		
	}
	
	//Update an user
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody User userDetails, @PathVariable(value="id") Long userId){
		
		Optional<User> oUser = userService.findById(userId);
		if(!oUser.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return null;
	}   
}
