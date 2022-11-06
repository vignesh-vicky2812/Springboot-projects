package com.knockknock.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserRestExceptionHandler {


	@ExceptionHandler
	public ResponseEntity<String> handleException(Exception exc) {
		System.out.println(exc.getMessage()+"jas");
		UserErrorResponse error = new UserErrorResponse(exc.getMessage());
//		UserErrorResponse error = new UserErrorResponse(HttpStatus.BAD_REQUEST.value(), exc.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<>(exc.getMessage(), HttpStatus.BAD_REQUEST);
	}


}
