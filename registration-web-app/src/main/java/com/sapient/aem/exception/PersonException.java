package com.sapient.aem.exception;

public class PersonException extends Exception{	
	private static final long serialVersionUID = 1L;


		public PersonException() {
			super("Person Exception ");
		}
		
		public PersonException(String message) {
			super(message);
		}
		
		
		public PersonException (String message, Throwable t) {
			super(message,t);
		}
		
}