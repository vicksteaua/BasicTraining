package com.basic.training;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import com.basic.training.exceptions.NullInputException;
import com.basic.training.exceptions.RomanAlphabetException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// String str1="abcd";
		// String str2="[a-z]*";
		String str3 = "asds V";
		// AcceptString a=new AcceptString(str);
		// System.out.println(a.getStr());
		// a.acceptConsole();
		// a.acceptFile();
		// a.acceptGUI();
		
		final Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("USA", 100);
		wordCounts.put("jobs", 200);
		wordCounts.put("software", 50);
		wordCounts.put("technology", 70);
		wordCounts.put("opportunity", 200);

		StringOperations b = new StringOperations();
		// System.out.println(b.countStringChars(str1));
		// System.out.println(b.revertStringChars(str1));
		// System.out.println(b.addStringChars(str1, "tt1",1));
		// System.out.println(b.reduceStringChars(str1, 0, 1));
		// b.regEx(str1,str2);
//		try {
//			System.out.println(b.convertStringToArrayList(str3));
//		} catch (NullInputException e) {
//			
//			
//		}
////		try {
////			System.out.println(b.convertStringToLinkedList(str3));
////		} catch (NullInputException e) {
////			
////		}
//
//		try {
//			System.out.println(b.extractWordsFromRegEx(str3, "(\\w+)")); 
//		} catch (NullInputException e) {
//
//			e.printStackTrace();
//		} catch (RomanAlphabetException e) {
//
//			e.printStackTrace();
//		}

		
			System.out.println(b.hashMapString(wordCounts));
	}

}
