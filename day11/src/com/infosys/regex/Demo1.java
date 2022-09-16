package com.infosys.regex;

public class Demo1 {

	public static void main(String[] args) {
	String str="bat";
	String regex="b.t"; // . replaces any one character and that character can
	// be alphabet or special characters or digits
	if(str.matches(regex))
	{
		System.out.println("Pattern found!!!");
	}
	else
	{
		System.out.println("Pattern not found!!!!");
	}
	
	}

}
