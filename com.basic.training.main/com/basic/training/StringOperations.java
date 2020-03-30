package com.basic.training;

import static com.jcabi.matchers.RegexMatchers.matchesPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hamcrest.MatcherAssert;

public class StringOperations {

	public int countStringChars(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		return count;
	}

	public String revertStringChars(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--)
			rev += str.charAt(i);
		return rev;
	}

	public String addStringChars(String str, String add, int pos) {
		String fin = "";
		for (int i = 0; i < str.length(); i++) {
			if (pos == str.length()) {

				fin = str + add;
				break;
			}
			if (i == pos)
				fin += add;
			fin += str.charAt(i);

		}
		return fin;
	}

	public String reduceStringChars(String str, int first, int last) {
		return str.substring(0, first) + str.substring(last, str.length());
	}

	public String stringInsertion(String current, String newString) {
		StringBuilder sb = new StringBuilder(current);
		sb.append(newString);
		return sb.toString();
	}
	
	public String regEx(String str1, String str2)
	{	
			String s = "";
			if(NullOrEmptySingleton.isNullOrEmpty(str1)||NullOrEmptySingleton.isNullOrEmpty(str2))
					System.out.println("The string is null or empty.");
			
			Pattern p = Pattern.compile(str1);
			Matcher m =p.matcher(str2);
			while (m.find()) {
	            System.out.print("Start index: " + m.start());
	            System.out.print(" End index: " + m.end() + " ");
	            System.out.println(" - " + m.group());
	             return s+=m.group();
			 
			}
			
			
		
			
			
		
		
	}
	
}
