package com.basic.training.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;

public class CountStringCharsTest {

	@Test
	public void countStringCharsNullTest() {
		StringOperations stringOperations = new StringOperations();
		assertThrows(NullPointerException.class, () -> stringOperations.countStringChars(null));
	}

	@Test
	public void countStringCharsVoidStringTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals(0, stringOperations.countStringChars(""));
	}

	@Test
	public void countStringCharsOneTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals(1, stringOperations.countStringChars("a"));
	}

	@Test
	public void countStringCharsTenTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals(10, stringOperations.countStringChars("abcdefghij"));
	}

}
