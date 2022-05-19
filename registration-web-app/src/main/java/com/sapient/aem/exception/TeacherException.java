package com.sapient.aem.exception;

public class TeacherException extends Exception{
	
	
	private static final long serialVersionUID = 1L;


	public TeacherException() {
		super("Person Exception ");
	}
	
	public TeacherException(String message) {
		super(message);
	}
	
	
	public TeacherException (String message, Throwable t) {
		super(message,t);
	}

}
