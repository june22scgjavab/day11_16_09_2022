package com.infosys.regex;

public class Demo6 {

	public static void main(String[] args) {
		String str="a9a";
		String regex="[A-Za-z][0-9][a-z]"; // The first character will be
		// in upper case or lowercase and second character will be a digit
		// and the third character will be a smallcase character
		// A-H
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
