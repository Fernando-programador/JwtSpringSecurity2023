package com.fsc.jwt.comtrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsc.jwt.Dto.UserDto;
import com.fsc.jwt.service.UserService;

@RestController
@RequestMapping("/auth")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> obterPorId(@PathVariable ("id") Long id){
		return new ResponseEntity<UserDto>(userService.readId(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<UserDto> criarUsuario(@RequestBody UserDto userDto){
		return new ResponseEntity<>(userService.create(userDto), HttpStatus.CREATED);
	}
}
