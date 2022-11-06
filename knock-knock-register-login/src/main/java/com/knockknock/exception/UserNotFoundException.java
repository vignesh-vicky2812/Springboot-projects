package com.knockknock.exception;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
		System.out.println("hello");
		
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}