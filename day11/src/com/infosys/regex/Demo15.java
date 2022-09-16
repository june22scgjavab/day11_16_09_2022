package com.infosys.regex;

public class Demo15 {

	public static void main(String[] args) {
		// I need first character in uppercase followed by minimum one smallcase
		
		// character and maximum 9 smallcase characters
		
		String str="Zabc";
		String regex="[A-Z][a-z]{1,9}"; 
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
