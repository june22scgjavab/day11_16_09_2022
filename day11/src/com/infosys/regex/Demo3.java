package com.infosys.regex;

public class Demo3 {

	public static void main(String[] args) {
		String str="matter";
		String regex="ma(tt|kk)er";
		if(str.matches(regex))  // ()  is used for grouping a set of characters
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found!!!!!");
		}
	}

}
