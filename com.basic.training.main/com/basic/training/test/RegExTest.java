package com.basic.training.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;

public class RegExTest {

//	@Test
//	public void regExNullTest() {
//		StringOperations stringOperations = new StringOperations();
//		assert
//	}

	@Test
	public void regExLowerCaseTest() {		
		StringOperations stringOperations = new StringOperations();
		assertEquals("abcd",stringOperations.regEx("eabcde","([a-z]+$)"));
	}
	
	@Test
	public void regExUpperCaseTest() {		
		StringOperations stringOperations = new StringOperations();
		String result = stringOperations.regEx("ABCD","([A-Z]+$)");
		assertEquals("ABCD", result);
	}
	
}
