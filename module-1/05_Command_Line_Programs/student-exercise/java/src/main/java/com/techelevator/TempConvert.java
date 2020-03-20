package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the temperature: ");
		String userTemperature = input.nextLine();
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String celsiusOrFahrenheit = input.nextLine();
		double userTemperatureDouble = Double.parseDouble(userTemperature);
		if (celsiusOrFahrenheit.contentEquals("C")) {
			double celsiusConversion = (userTemperatureDouble * 1.8 + 32);
			System.out.println(userTemperature + celsiusOrFahrenheit + " is " + String.format("%.2f", celsiusConversion) + "F");
		} else if (celsiusOrFahrenheit.contentEquals("F")) {
			double fahrenheitConversion = (userTemperatureDouble - 32) / 1.8;
			System.out.println(userTemperature + celsiusOrFahrenheit + " is " + String.format("%.2f", fahrenheitConversion) + "C");
		
	}

}
}
//Please enter the temperature: 58
//Is the temperature in (C)elsius, or (F)ahrenheit? F
//58F is 14C.
//Tc = (Tf - 32) / 1.8
//Tf = Tc * 1.8 + 32