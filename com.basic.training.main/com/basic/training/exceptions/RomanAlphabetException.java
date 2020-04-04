package com.basic.training.exceptions;

public class RomanAlphabetException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RomanAlphabetException() {
		super("The number contains roman alphabet words!!! (You cannot use number such as IV,V,L,C,M, etc.)");
	}
}
