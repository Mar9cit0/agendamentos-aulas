package com.aulasagendamentos.services;

import java.util.Date;

import com.aulasagendamentos.entity.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTToken {
	private static long expirationTime = 180000;
	private String key = "secret";
	
	public String generateToken(User user) {
		
		return Jwts.builder()
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setSubject(user.getEmail())
				.setExpiration(new Date(System.currentTimeMillis() + expirationTime))
				.signWith(SignatureAlgorithm.HS256,key)
				.compact();
	}

}
