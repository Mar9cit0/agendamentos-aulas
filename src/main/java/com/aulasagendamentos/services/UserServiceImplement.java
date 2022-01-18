package com.aulasagendamentos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aulasagendamentos.entity.User;
import com.aulasagendamentos.repository.UserRepository;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

@Service
public class UserServiceImplement implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional(readOnly = true)
	public User login(User user) {
		
		List<User> lista = userRepository.getSenha(user.getEmail());
		Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
		boolean iguales = argon2.verify(lista.get(0).getPassword(), user.getPassword().toCharArray());
		User userfind = lista.get(0);
		System.out.println(iguales);		 
		return userfind;
		
	
//
//		System.out.println(pass);
//		User users = userRepository.login(user.getEmail(),user.getPassword());
//		System.out.println(user.getEmail());
//		System.out.println(user.getPassword());
//		System.out.println(users);
	
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<User> findAll() {		
		return userRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<User> findAll(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}
	
	@Override
	@Transactional
	public User save(User user) {
		return userRepository.save(user);
	}
	

	@Override
	@Transactional
	public void deleteById(Long id) {
		userRepository.deleteById(id);
		
	}

}
