package com.fsc.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import com.fsc.jwt.Dto.AccountCredentialsDto;
import com.fsc.jwt.repository.UserRepository;
import com.fsc.jwt.security.Jwt.JwtTokenProvider;

@Service
public class AuthService {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenProvider tokenProvider;

	@Autowired
	private UserRepository userRepository;
	
	public ResponseEntity signin(AccountCredentialsDto) {
		try {
			
		} catch (Exception e) {
			throws new BadCredentialsException("Invalid username/password supplied!")
		}
	}

}
