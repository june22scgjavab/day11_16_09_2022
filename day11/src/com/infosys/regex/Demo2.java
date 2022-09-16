package com.infosys.regex;

public class Demo2 {

	public static void main(String[] args) {
		String str="mat";
		String regex="cat|fat|bat";
		if(str.matches(regex))  // | is used for OR which means either the pattern
			// cat or fat or bat should be present then only it returns true
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found!!!!!");
		}
	}

}
