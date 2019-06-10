package com.exception;

import java.util.Date;

public class CustomRestError extends RuntimeException{
	Date date;
	String message;
	String requestDescription;
	
	public CustomRestError(Date date, String message, 
			String requestDescription) {
		this.date = date;
		this.message = message;
		this.requestDescription = requestDescription;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestDescription() {
		return requestDescription;
	}

	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}
	
	
}
