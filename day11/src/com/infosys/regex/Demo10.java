package com.infosys.regex;

public class Demo10 {

	public static void main(String[] args) {
		// We need to have 1 or more characters
		
		String str="Abce";
		String regex="[a-zA-z]+"; // I am looking for 0 or 1 character
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
