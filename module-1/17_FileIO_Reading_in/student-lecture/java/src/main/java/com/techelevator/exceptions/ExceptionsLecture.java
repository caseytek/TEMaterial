package com.techelevator.exceptions;

import java.util.Scanner;

public class ExceptionsLecture {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] cities = {"Detroit", "Dearborn", "Sterling Heights",
				"Toledo", "Canton"};
		System.out.println("The following cities: ");
		
		try { 
		for (int i = 0; i<= cities.length; i++) {
			System.out.println(cities[i]);
		}
		System.out.println("We don't like Toledo"); //this line will be skipped
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("*** uh-oh - something went wrong ***");
		}
		System.out.println("are great cities!");
		try {
		doSomethingDangerous();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("**** ERROR ****" );
		}
		//catch statement uses polymorphism. catch will handle and exception 
		try {
		System.out.println("How many hours did you work this week? ");
		int hoursWorked = Integer.parseInt(scan.nextLine());
		int overTimeHours = hoursWorked -40;
		System.out.println("You worked " + overTimeHours + " hours of overtime");
		} catch (NumberFormatException e) {
		System.out.println("No Fractions please");
		}
		catch (Exception e) {
		System.out.println("You did it wrong...");
		}

	// Utility functions:
	
	int nights = -3;
	int numberOfGuests = 2;
	try {
	double amountOwed = calculateHotelRoomCharges(nights, numberOfGuests);
	System.out.println("Total owed for " + numberOfGuests + " guests for " + nights + " night is $" + amountOwed);
	} catch (IllegalArgumentException e) {
		System.out.println("uh-oh - something went wrong");
	}
	double currentBalance = 250;
	double amountToWithdraw = 10000;
	try {
		double newBalance = withdraw(currentBalance , amountToWithdraw);
		System.out.println("Your new balance is " + newBalance);
	} catch (OverdraftException e) {
		System.out.println("So sorry, you cannot withdraw more money than you have...");
		System.out.println("The requested amount: " + amountToWithdraw);
		System.out.println("would overdraw your account by " + e.getOverdraftAmount());
	
	}
	}
	
	private static double calculateHotelRoomCharges(int nights, int numberOfGuests) {
		final double EXTRA_GUEST_CHARGE = 20;
		final double ROOM_RATE = 85;
		
		/* The throw statements below demonstrate how to throw a new Exception. */
		if(nights < 1) {
			throw new IllegalArgumentException("Minimum number of nights is 1");
		} else if(numberOfGuests < 1) {
			throw new IllegalArgumentException("Minimum number of guests is 1");
		}
		
		int numberOfExtraGuests = 0;
		if(numberOfGuests > 4) {
			numberOfExtraGuests = numberOfGuests - 4;
		}
		
		double dailyRate = ROOM_RATE + (EXTRA_GUEST_CHARGE * numberOfExtraGuests);
		return dailyRate * nights;
	}
	
	
	public static double withdraw(double currentBalance, double amountToWithdraw) throws OverdraftException {
		double newBalance;
		if(amountToWithdraw <= currentBalance) {
			newBalance = currentBalance - amountToWithdraw;
		} else {
			throw new OverdraftException("The requested withdrawal amount is greater than the current balance", Math.abs(currentBalance - amountToWithdraw));
		}
		return newBalance;		
	}

	
	private static void doSomethingDangerous() {
		int[] numbers = new int[5];
		for(int i = 0; i < 10; i++) {
			numbers[i] = i;  // this line will throw an Exception once i reaches 5
		}
		System.out.println("Look Ma, no Exceptions!");  // This line will not execute because an Exception will be thrown inside the for loop
	}

}
