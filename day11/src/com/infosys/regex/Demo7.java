package com.infosys.regex;

public class Demo7 {

	public static void main(String[] args) {
		String str="a9a";
		String regex="[^a-z][0-9][a-z]"; // The first character should not
		// be a smallcase character
		//  and second character will be a digit
		// and the third character will be a smallcase character
		// ^ within [] is for not matching the mentioned characters
		// within the square brackets
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
