package com.infosys.regex;

public class Demo14 {

	public static void main(String[] args) {
		// I need first character in uppercase followed by minimum one smallcase
		
		// character and we can have multiple smallcase characters
		//
		
		String str="Zabc";
		String regex="[A-Z][a-z]{1,}"; 
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
