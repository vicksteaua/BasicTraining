package com.basic.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

<<<<<<< HEAD
import java.lang.Character;
import java.time.LocalDate;

import org.hamcrest.MatcherAssert;
=======
import com.basic.training.exceptions.NullInputException;
import com.basic.training.exceptions.RomanAlphabetException;
>>>>>>> refs/heads/LEAR-9-InputStringToArrayList

public class StringOperations implements AbstractListExtractWords {

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
			s += m.group()+" ";

		}
		System.out.println(s);
		return s;

	}
	
	public List<String> extractWords(String model){
		List<String> l = Collections.emptyList();
		String word = "";
		model = model.trim();
		for (int i = 0; i < model.length(); i++) {

			char currentChar = model.charAt(i);
			if (currentChar != ' ') {
				word += currentChar;
				if (i == model.length()-1) {
					l.add(word);
				}
			} else if (currentChar == ' ' && word != "") {
				l.add(word);
				word = "";
			}
		}
		return l;
	}

	public List<String> convertStringToArrayList(String inputString) throws NullInputException {
	if(	NullOrEmptySingleton.getInstance().isNullOrEmpty(inputString))
	{
		throw new NullInputException();
	}
		List<String> inp = new ArrayList<>();
		Collections.addAll(inp=new ArrayList<String>(), this.extractWords(inputString).toString());
	//	this.extractWords(inputString);
//		String word = "";
//		inputString = inputString.trim();
//		for (int i = 0; i < inputString.length(); i++) {
//
//			char currentChar = inputString.charAt(i);
//			if (currentChar != ' ') {
//				word += currentChar;
//				if (i == inputString.length()-1) {
//					inp.add(word);
//				}
//			} else if (currentChar == ' ' && word != "") {
//				inp.add(word);
//				word = "";
//			}
//		}

		return inp;

	}
	
	public List<String> convertStringToLinkedList(String inputString) throws NullInputException {
		if(	NullOrEmptySingleton.getInstance().isNullOrEmpty(inputString))
		{
			throw new NullInputException();
		}
		List<String> inp= new LinkedList<>();
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
	
	public String extractWordsFromRegEx(String inputString,String regex) throws NullInputException, RomanAlphabetException {
		if(	NullOrEmptySingleton.getInstance().isNullOrEmpty(inputString)||NullOrEmptySingleton.getInstance().isNullOrEmpty(regex))
		{
			throw new NullInputException();
		}
		if (regex.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
		{
			throw new RomanAlphabetException();
		}
			
		return regEx(inputString,regex);
		
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
		int result = 0;
		List<Integer> lint = new ArrayList<>();
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9') {
				if (Character.isDigit(inputString.charAt(i))) {
					result = Character.getNumericValue(inputString.charAt(i));
					lint.add(result);
				}
			}

		}

		return lint;
	}

	public LocalDate extractDatesFromString(String ddate, String regEx) {
		String rr = this.regEx(ddate, regEx);
		LocalDate date = LocalDate.parse(rr);
		return date;

	}

}
