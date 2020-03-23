package com.basic.training.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;

public class RevertStringCharsTest {

	@Test
	public void revertStringCharsNullTest() {
		StringOperations stringOperations = new StringOperations();
		assertThrows(NullPointerException.class, () -> stringOperations.revertStringChars(null));

	}

	@Test
	public void revertStringCharsVoidStringTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("", stringOperations.revertStringChars(""));
	}

	@Test
	public void revertStringCharsOneStringTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("a", stringOperations.revertStringChars("a"));
	}

	@Test
	public void revertStringCharsTwoStringTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("ab", stringOperations.revertStringChars("ba"));
	}

	@Test
	public void revertStringCharsSameStringTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("aaa", stringOperations.revertStringChars("aaa"));
	}

	@Test
	public void revertStringCharsMultipleStringTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("a1cdse", stringOperations.revertStringChars("esdc1a"));
	}
}
