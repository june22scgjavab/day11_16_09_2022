package com.infosys.revise;

public class MathsDemo {

	public static void main(String[] args) {
		double d=12.343;
		d=Math.ceil(d);   // Returns the smallest whole number greater than 
		// or equal to the arguement
		System.out.println(d);
		d=12.543;
		d=Math.ceil(d);
		System.out.println(d);
		d=12.343;
		d=Math.floor(12.343); // Return the largest whole number lesser than
	    // or equal to the arguement
		System.out.println(d);

	}

}
