package com.basic.training;

import java.io.FileNotFoundException;

import com.basic.training.exceptions.NullInputException;
import com.basic.training.exceptions.RomanAlphabetException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
<<<<<<< HEAD
		String str1="abcd";
		String str2="[a-z]*";
		String str3= "2015-01-02";
		//AcceptString a=new AcceptString(str);
		//System.out.println(a.getStr());
		//a.acceptConsole();
		//a.acceptFile();
		//a.acceptGUI();
		
		StringOperations b=new StringOperations();
//		System.out.println(b.countStringChars(str1));
//		System.out.println(b.revertStringChars(str1));
//		System.out.println(b.addStringChars(str1, "tt1",1));
//		System.out.println(b.reduceStringChars(str1, 0, 1));
		//b.regEx(str1,str2);
		//System.out.println(b.convertStringToArrayList(str3));
		//System.out.println(b.removeExtraSpaces(str3));
		//System.out.println(b.extractIntegers(str3));
		System.out.println(b.extractDatesFromString(str3,"\\d{4}-\\d{2}-\\d{2}"));
=======
		// String str1="abcd";
		// String str2="[a-z]*";
		String str3 = "asds V";
		// AcceptString a=new AcceptString(str);
		// System.out.println(a.getStr());
		// a.acceptConsole();
		// a.acceptFile();
		// a.acceptGUI();

		StringOperations b = new StringOperations();
		// System.out.println(b.countStringChars(str1));
		// System.out.println(b.revertStringChars(str1));
		// System.out.println(b.addStringChars(str1, "tt1",1));
		// System.out.println(b.reduceStringChars(str1, 0, 1));
		// b.regEx(str1,str2);
		try {
			System.out.println(b.convertStringToArrayList(str3));
		} catch (NullInputException e) {
			
			
		}
//		try {
//			System.out.println(b.convertStringToLinkedList(str3));
//		} catch (NullInputException e) {
//			
//		}

		try {
			System.out.println(b.extractWordsFromRegEx(str3, "(\\w+)")); 
		} catch (NullInputException e) {

			e.printStackTrace();
		} catch (RomanAlphabetException e) {

			e.printStackTrace();
		}

>>>>>>> refs/heads/LEAR-9-InputStringToArrayList
	}

}
