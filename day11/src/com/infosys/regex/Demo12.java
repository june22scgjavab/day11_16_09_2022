package com.infosys.regex;

public class Demo12 {

	public static void main(String[] args) {
		// I need first character in uppercase followed by digit
		// followed by any number of smallcase characters
		
		String str="Z1a";
		String regex="[A-Z][0-9][a-z]+"; 
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
