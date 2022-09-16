package com.infosys.regex;

public class Demo4 {

	public static void main(String[] args) {
		String str="Hello";
		String regex="[A-H]ello";// Here we are looking for first character between
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
