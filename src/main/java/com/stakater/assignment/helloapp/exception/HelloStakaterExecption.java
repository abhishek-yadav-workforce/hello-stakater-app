package com.stakater.assignment.helloapp.exception;

import org.springframework.http.HttpStatus;

public class HelloStakaterExecption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpStatus httpStatus;

	public HelloStakaterExecption(String message) {
		super(message);
		this.setHttpStatus(HttpStatus.BAD_REQUEST);
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
}
