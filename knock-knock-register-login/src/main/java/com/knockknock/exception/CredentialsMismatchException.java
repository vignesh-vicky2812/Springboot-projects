package com.knockknock.exception;



public class CredentialsMismatchException extends RuntimeException {

	public CredentialsMismatchException(String message) {
		super(message);
		
	}

	public CredentialsMismatchException(Throwable cause) {
		
		super(cause);
	}

	public CredentialsMismatchException(String message, Throwable cause) {
		super(message, cause);

	}

}
