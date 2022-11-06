package com.knockknock.exception;

public class UserErrorResponse {
	
//	private int status;
	private String message;
//	private long timestamp;
	
	public UserErrorResponse() {
		
	}

//	public UserErrorResponse(int status, String message, long timestamp) {

	public UserErrorResponse(String message) {
//		this.status = status;
		this.message = message;
//		this.timestamp = timestamp;
	}

//	public int getStatus() {
//		return status;
//	}
//
//	public void setStatus(int status) {
//		this.status = status;
//	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	public long getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(long timestamp) {
//		this.timestamp = timestamp;
//	}
//
//	@Override
//	public String toString() {
//		return "UserErrorResponse [status=" + status + ", message=" + message + ", timestamp=" + timestamp + "]";
//	}
//	
}
