package com.infosys.regex;

public class Demo16 {

	public static void main(String[] args) {
		// Match a mobile number of 10 digits
		
		// character and maximum 9 smallcase characters
		
		String str="9087654321";
		//String regex="[0-9]{10}";
		String regex="\\d{10}";
		if(str.matches(regex)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
