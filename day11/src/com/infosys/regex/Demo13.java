package com.infosys.regex;

public class Demo13 {

	public static void main(String[] args) {
		// I need first character in uppercase followed by exactly two characters in
		// smallcase
		//
		
		String str="Zab";
		String regex="[A-Z][a-z]{2}"; 
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
