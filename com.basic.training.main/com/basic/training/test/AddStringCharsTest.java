package com.basic.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;

public class AddStringCharsTest {

	@Test
	public void addStringCharsNullTest() {
		StringOperations stringOperations = new StringOperations();
		assertThrows(NullPointerException.class, () -> stringOperations.addStringChars(null, "123", 0));

	}

	@Test
	public void addStringCharsVoidTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("abc", stringOperations.addStringChars("abc", "", 1));

	}

	@Test
	public void addStringCharsOneTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("abcd", stringOperations.addStringChars("abc", "d", 3));

	}

	@Test
	public void addStringCharsTwoTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("abdec", stringOperations.addStringChars("abc", "de", 2));

	}

}
