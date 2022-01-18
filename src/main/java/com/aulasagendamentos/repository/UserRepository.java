package com.aulasagendamentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aulasagendamentos.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	@Query(value="Select * from users where email = :email", nativeQuery = true)
	public List<User> getSenha(String email);
	
	@Query(value="Select * from users where email = :email and password= :password", nativeQuery = true)
	public User login(String email, String password);
	


}
