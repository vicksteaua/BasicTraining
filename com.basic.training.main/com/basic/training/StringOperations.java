package com.basic.training;

import static com.jcabi.matchers.RegexMatchers.matchesPattern;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.lang.Character;

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

	public String regEx(String inputString, String regExpression) {
		String s = "";
		if (NullOrEmptySingleton.isNullOrEmpty(inputString) || NullOrEmptySingleton.isNullOrEmpty(regExpression))
			System.out.println("The string is null or empty.");

		Pattern p = Pattern.compile(regExpression);
		Matcher m = p.matcher(inputString);
		while (m.find()) {
			System.out.print("Start index: " + m.start());
			System.out.print(" End index: " + m.end() + " ");
			System.out.println(" - " + m.group());
			s += m.group();

		}
		System.out.println(s);
		return s;

	}

	public List<String> convertStringToArrayList(String InputString) {

		List<String> inp = new ArrayList<String>();
		inp.add(InputString);

		for (int i = 0; i < InputString.length(); i++) {

			if (InputString.charAt(i) == ' ')
				i++;
		}

		return inp;

	}

	public String removeExtraSpaces(String inputString) {
		inputString = inputString.trim();
		String cuvant = "";
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) != ' ' && i != inputString.length()) {
				cuvant += inputString.charAt(i);
			} else if (inputString.charAt(i) == ' ') {
				if (inputString.charAt(i + 1) == ' ') {
					cuvant += inputString.charAt(i);
					i++;
				}
				cuvant += inputString.charAt(i);
			}

		}

		return cuvant;
	}
	
	public List<Integer> extractIntegers(String inputString) {
		int result=0;
		List<Integer> lint=new ArrayList<>();
		for(int i=0;i<inputString.length();i++) {
			if(inputString.charAt(i)>='0'&&inputString.charAt(i)<='9') {
				if (Character.isDigit(inputString.charAt(i))) {
					result=Character.getNumericValue(inputString.charAt(i));
					lint.add(result);
				}
			}
			
		}
		
		
		return lint;
	}

}
