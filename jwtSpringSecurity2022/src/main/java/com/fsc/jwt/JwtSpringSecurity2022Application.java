package com.fsc.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class JwtSpringSecurity2022Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtSpringSecurity2022Application.class, args);
		/*
		Map<String, PasswordEncoder> encoders = new HashMap<>();
		encoders.put("pbkdf2", new Pbkdf2PasswordEncoder(null, 0, 0, null));
		DelegatingPasswordEncoder passwordEncoder = new DelegatingPasswordEncoder("pbkdf2", encoders);
		passwordEncoder.setDefaultPasswordEncoderForMatches(new Pbkdf2PasswordEncoder(null, 0, 0, null));
		
		String result = passwordEncoder.encode("admin234");
		System.out.println("My hash" + result);

	*/
	}

}
