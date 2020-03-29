package com.basic.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;

public class StringInsertionTest {

	@Test
	public void stringInsertionNullTest() {
		StringOperations stringOperations = new StringOperations();
		assertThrows(NullPointerException.class, () -> stringOperations.stringInsertion(null, "abc"));
	}

	@Test
	public void stringInsertionVoidTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("ab", stringOperations.stringInsertion("ab", ""));
	}

	@Test
	public void stringInsertionOneTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("abc", stringOperations.stringInsertion("ab", "c"));

	}

	@Test
	public void stringInsertionTwoTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("abcd", stringOperations.stringInsertion("ab", "cd"));

	}

}
