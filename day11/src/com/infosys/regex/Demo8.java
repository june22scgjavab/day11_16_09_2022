package com.infosys.regex;

public class Demo8 {

	public static void main(String[] args) {
		// We need to have 0 or more characters
		
		String str="abc";
		String regex="[A-Za-z]*"; // I am looking for 0 or more characters
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
