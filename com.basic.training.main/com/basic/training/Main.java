package com.basic.training;
import java.io.FileNotFoundException;

import com.basic.training.exceptions.NullInputException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String str1="abcd";
		String str2="[a-z]*";
		String str3= " abcd aa gg ";
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
		try {
			System.out.println(b.convertStringToArrayList(str3));
		} catch (NullInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
