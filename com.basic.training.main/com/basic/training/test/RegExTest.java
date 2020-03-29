package com.basic.training.test;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;

public class RegExTest {

	@Test
	public void regExNullTest() {
		StringOperations stringOperations = new StringOperations();
		assertThrows(AssertionError.class, () -> stringOperations.regEx(null, "[a-z]"));
	}

	@Test
	public void regExLowerCaseTest() {		
		StringOperations stringOperations = new StringOperations();
		stringOperations.regEx("abcd","([a-z]+$)");
	}
	
	@Test
	public void regExUpperCaseTest() {		
		StringOperations stringOperations = new StringOperations();
		stringOperations.regEx("ABCD","([A-Z]+$)");
	}
	
}
