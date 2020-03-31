package com.basic.training.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;

import java.util.List;

public class ConvertStringToArrayListTest {

	@Test
	public void convertStringToArrayListOneTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("abcd1", stringOperations.convertStringToArrayList("abcd1").get(0));
	}

	@Test
	public void convertStringToArrayListTwoTest() {
		StringOperations stringOperations = new StringOperations();
		assertEquals("abcd1 adsa", stringOperations.convertStringToArrayList("abcd1 adsa").get(0));
	}
	
	@Test
	public void convertStringToArrayListThreeTest() {
	StringOperations stringOperations= new StringOperations();
	assertEquals("abcd1 adsa sdsa",stringOperations.convertStringToArrayList("abcd1 adsa sdsa").get(0));
}
}
