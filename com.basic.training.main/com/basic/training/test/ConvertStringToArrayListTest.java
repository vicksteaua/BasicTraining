package com.basic.training.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;
import com.basic.training.exceptions.NullInputException;

public class ConvertStringToArrayListTest {

	@Test
	public void convertStringToArrayListOneTest() throws NullInputException {
		StringOperations stringOperations = new StringOperations();
		assertEquals("abcd1", stringOperations.convertStringToArrayList("abcd1").get(0));
	}

	@Test
	public void convertStringToArrayListTwoTest() throws NullInputException {
		StringOperations stringOperations = new StringOperations();
		List<String> convertedStringToArrayList = stringOperations.convertStringToArrayList("abcd1 adsa");
		assertEquals("abcd1", convertedStringToArrayList.get(0));
		assertEquals("adsa", convertedStringToArrayList.get(1));
	}

	@Test
	public void convertStringToArrayListMultipleSpacesTest() throws NullInputException {
		StringOperations stringOperations = new StringOperations();
		List<String> convertedStringToArrayList = stringOperations.convertStringToArrayList("abcd1       adsa");
		assertEquals("abcd1", convertedStringToArrayList.get(0));
		assertEquals("adsa", convertedStringToArrayList.get(1));
	}
}
