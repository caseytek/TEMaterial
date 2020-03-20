package com.techelevator.TollBoothCalculator;

public class Truck implements Vehicle {
	
	private int numberOfAxles;
	
	public Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public int getNumberOfAxles() {
		return numberOfAxles;
	}

	@Override
	public double calculateToll(int distance) {
		double toll = 0;
		if (this.numberOfAxles == 4) {
			toll = 0.040 * distance;
		} else if (this.numberOfAxles == 6) {
			toll = 0.045 * distance;
		} else { 
			toll = 0.048 * distance;
		}
		return toll;
	}

	@Override
	public String getType() {
		return "Truck " + "(" + Integer.toString(numberOfAxles) + " axles)";

	}
	
}
