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
		assertEquals(expectedOutput,stringOperations.regEx(testString,"(([A-Z])\\w+)"));
	}
	
	@Test
	public void regExUpperCaseTest() {		
		StringOperations stringOperations = new StringOperations();
		String result = stringOperations.regEx("ABCD","([A-Z]+$)");
		assertEquals("ABCD", result);
	}
	
}
