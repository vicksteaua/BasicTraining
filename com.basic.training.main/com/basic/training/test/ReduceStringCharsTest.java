package com.basic.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;

public class ReduceStringCharsTest {

	@Test
	public void reduceStringCharsNullTest() {
		StringOperations stringOperations = new StringOperations();
		assertThrows(NullPointerException.class, () -> stringOperations.reduceStringChars(null, 0, 1));

	}

	@Test
	public void reduceStringCharsVoidTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("", stringOperations.reduceStringChars("", 0, 0));

	}

	@Test
	public void reduceStringCharsOneTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("ab", stringOperations.reduceStringChars("abc", 2, 3));

	}

	@Test
	public void reduceStringCharsTwoTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("a", stringOperations.reduceStringChars("abc", 1, 3));
	}

	@Test
	public void reduceStringCharsOutOfBoundsTest() {
		StringOperations stringOperations = new StringOperations();
		assertThrows(StringIndexOutOfBoundsException.class, () -> stringOperations.reduceStringChars("abc", 3, 4));

	}
}