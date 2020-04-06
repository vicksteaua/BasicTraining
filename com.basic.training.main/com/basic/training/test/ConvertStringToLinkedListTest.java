package com.basic.training.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;
import com.basic.training.exceptions.NullInputException;

public class ConvertStringToLinkedListTest {

	@Test
	public void convertStringToLinkedListOneTest() throws NullInputException {
		StringOperations stringOperations = new StringOperations();
		assertEquals("abcd1", stringOperations.convertStringToLinkedList("abcd1").get(0));
	}

	@Test
	public void convertStringToLinkedListTwoTest() throws NullInputException {
		StringOperations stringOperations = new StringOperations();
		List<String> convertedStringToLinkedList = stringOperations.convertStringToLinkedList("abcd1 adsa");
		assertEquals("abcd1", convertedStringToLinkedList.get(0));
		assertEquals("adsa", convertedStringToLinkedList.get(1));
	}

	@Test
	public void convertStringToLinkedListMultipleSpacesTest() throws NullInputException {
		StringOperations stringOperations = new StringOperations();
		List<String> convertedStringToLinkedList = stringOperations.convertStringToLinkedList("abcd1       adsa");
		assertEquals("abcd1", convertedStringToLinkedList.get(0));
		assertEquals("adsa", convertedStringToLinkedList.get(1));
	}
}
