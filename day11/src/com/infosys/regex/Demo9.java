package com.infosys.regex;

public class Demo9 {

	public static void main(String[] args) {
		// We need to have 0 or 1 character
		
		String str="a";
		String regex="[a-z]?"; // I am looking for 0 or 1 character
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
