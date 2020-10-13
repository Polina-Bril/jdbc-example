package com.freeIT.library.exception;

@SuppressWarnings("serial")
public class MyServiceException extends Exception {
	public MyServiceException(String message) {
		super(message);
	}
}