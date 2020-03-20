package com.techelevator;

import java.util.Scanner; //ctrl + shift + o resolves any package errors. creates a scanner object.

public class PricesProgram {

	public static void main(String[] args) {
		// create a constant - final, should be in all caps 
		final double TAX = 0.06;
		//create connection between program and keyboard
		Scanner input = new Scanner(System.in);
		
		//create an empty array that holds 3 elements.
		double [] prices = new double [3];
		
		for (int x = 0; x <prices.length; x++) {
			System.out.println("Enter a price: ");
			String priceStr = input.nextLine();
			prices[x] = Double.parseDouble(priceStr);
		}
		
		//output the amount of tax
		for (int x=0; x < prices.length; x++) {
			double tax = prices[x] * TAX;
			System.out.println("Price: " + String.format("%8.2f", prices[x]) + "Tax: " + String.format("%8.2f", tax));
		}
		String s1 = new String("Hello");
		String s2 = new String ("Hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("Enter three numbers: ");
		String numberStr = input.nextLine();
		System.out.println(numberStr);
	
	String[] numArray = numberStr.split(" "); //look for spaces and put numbers in numArray, one per position
	System.out.println(numArray);
	
	for (int x = 0; x < numArray.length; x++) {
		System.out.println(numArray[x]);
	}
	}
		
}
