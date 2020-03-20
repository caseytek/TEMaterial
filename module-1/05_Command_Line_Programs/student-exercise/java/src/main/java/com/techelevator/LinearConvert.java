package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the length: ");
		String userLengthString = input.nextLine();
		System.out.println("Is the measurement in (m)eter, or (f)eet? ");
		String meterOrFeet = input.nextLine();
		double userLengthDouble = Double.parseDouble(userLengthString);
		if (meterOrFeet.equals("m")) {
			double feetConversion = (userLengthDouble * 3.2808399);
			System.out.println(userLengthDouble + meterOrFeet + " is " + String.format("%.2f", feetConversion) + "f");
		} else if (meterOrFeet.equals("f")) {
			double meterConversion = (userLengthDouble * 0.3048);
			System.out.println(userLengthDouble + meterOrFeet + " is " + String.format("%.2f", meterConversion) + "m");
		
	}

	}

}
//m = f * 0.3048
//f = m * 3.2808399
//Please enter the length: 58
//Is the measurement in (m)eter, or (f)eet? f
//58f is 17m.