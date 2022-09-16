package com.infosys.regex;

public class Demo11 {

	public static void main(String[] args) {
		// I need first character in uppercase followed by lowercase characters
		
		String str="Za";
		String regex="[A-Z][a-z]+"; // I am looking for 0 or 1 character
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
