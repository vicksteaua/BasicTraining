package com.basic.training.exceptions;

public class NullInputException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NullInputException() {
		super("The string is null or empty!");
	}
}
