package com.aulasagendamentos.controllers;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulasagendamentos.entity.User;
import com.aulasagendamentos.services.UserService;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class UserController {
	
	@Autowired
    private UserService userService;
	Argon2 argon2 = Argon2Factory.create();
	
	/**
	 * Login an User
	 * @param user
	 * @return user
	 */
	@PostMapping("auth")
	public ResponseEntity<?> auth(@RequestBody User user) {
		User userRepo = userService.login(user);
		if(userRepo != null) {
			return ResponseEntity.ok(userRepo);
		} 
		
		return ResponseEntity.notFound().build();
		
	}
	/**
	 * Create a new User
	 * @param user
	 * @return user
	 */
	@PostMapping("users")
	public ResponseEntity<?> create (@RequestBody User user) {
		
		 Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id,32,64);
		 char[] password = user.getPassword().toCharArray();
		 String hash = argon2.hash(22, 65536, 1, password);
		 user.setPassword(hash);
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
		
	}
	

	
	
	/**
	 * Read an User
	 * @param user
	 * @return user
	 */
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long userId) {
	
		Optional<User> oUser = userService.findById(userId);
		
		if(!oUser.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oUser);
		
	}

	
	/**
	 * Update a User
	 * @param user
	 * @return user
	 */
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody User userDetails, @PathVariable(value="id") Long userId){
		
		Optional<User> oUser = userService.findById(userId);
		if(!oUser.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return null;
	}
	

}
