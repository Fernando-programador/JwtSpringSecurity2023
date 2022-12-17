package com.fsc.jwt.exceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.fsc.jwt.exception.ExceptionResponse;
import com.fsc.jwt.exception.InvalidJwtAutheticationException;

public class CustomizedResponseEntity {

	@ExceptionHandler(InvalidJwtAutheticationException.class)
	public  final ResponseEntity<ExceptionResponse> handleInvalidJwtAutheticationException (Exception ex, WebRequest request){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
				
	}
}
