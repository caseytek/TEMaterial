package com.techelevator.TollBoothCalculator;

public interface Vehicle {

	//interfaces do not have data members
	public double calculateToll(int distance); //abstract method - implementer will provide body
	public String getType();
	
}
