package com.basic.training.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.basic.training.StringOperations;
import com.basic.training.exceptions.NullInputException;

public class RegExTest {

	@Test
	public void regExNullTest() {
		StringOperations stringOperations = new StringOperations();
		Assertions.assertThrows(NullInputException.class, () -> stringOperations.regEx(null, null));
	}
	
	@Test
	public void regExNullTestWithException() {
		StringOperations stringOperations = new StringOperations();
		String regExResult= "";
		try {
			regExResult = stringOperations.regEx(null, null);
		} catch (NullInputException e) {
		}
		
		assertEquals("", regExResult);
	}

	@Test
	public void regExLowerCaseTest() {		
		String testString="RegExr was created by gskinner.com, and is proudly hosted by Media Temple.\r\n" + 
				"\r\n" + 
				"Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.\r\n" + 
				"\r\n" + 
				"The side bar includes a Cheatsheet, full Reference, and Help. You can also Save & Share with the Community, and view patterns you create or favorite in My Patterns.\r\n" + 
				"\r\n" + 
				"Explore results with the Tools below. Replace & List output custom results. Details lists capture groups. Explain describes your expression in plain English.\r\n" + 
				"";
		String expectedOutput="RegExrMediaTempleEditExpressionTextRollPCREJavaScriptRegExValidateTestsTheCheatsheetReferenceHelpYouSaveShareCommunityMyPatternsExploreToolsReplaceListDetailsExplainEnglish";
		StringOperations stringOperations = new StringOperations();
		
		String regExResult = null;
		try {
			regExResult = stringOperations.regEx(testString,"(([A-Z])\\w+)");
		} catch (NullInputException e) {
			fail(e.getMessage()); 
		}
		
		assertEquals(expectedOutput,regExResult);
	}
	
	@Test
	public void regExUpperCaseTest() {		
		StringOperations stringOperations = new StringOperations();
		String result=null;
		try {
			result = stringOperations.regEx("ABCD","([A-Z]+$)");
		} catch (NullInputException e) {
		
			fail(e.getMessage());
		}
		assertEquals("ABCD", result);
	}
	
}
