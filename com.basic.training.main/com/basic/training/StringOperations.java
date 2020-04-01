package com.basic.training;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.basic.training.exceptions.NullInputException;

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

	public String regEx(String inputString, String regExpression) throws NullInputException {
		String s = "";
		if (NullOrEmptySingleton.getInstance().isNullOrEmpty(inputString) ||
				NullOrEmptySingleton.getInstance().isNullOrEmpty(regExpression)) {
			System.out.println("The string is null or empty.");
			
			throw new NullInputException();
		}

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

	public List<String> convertStringToArrayList(String inputString) throws NullInputException {
	if(	NullOrEmptySingleton.getInstance().isNullOrEmpty(inputString))
	{
		throw new NullInputException();
	}
		List<String> inp = new ArrayList<>();
		String word = "";
		inputString = inputString.trim();
		for (int i = 0; i < inputString.length(); i++) {

			char currentChar = inputString.charAt(i);
			if (currentChar != ' ') {
				word += currentChar;
				if (i == inputString.length()-1) {
					inp.add(word);
				}
			} else if (currentChar == ' ' && word != "") {
				inp.add(word);
				word = "";
			}
		}

		return inp;

	}

}
