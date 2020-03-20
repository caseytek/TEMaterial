package com.techelevator.TollBoothCalculator;

public class Car implements Vehicle {
	
	
	private boolean hasTrailer;
	
	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	@Override
	public double calculateToll(int distance) {
		double toll = 0;
		if(hasTrailer) {
			toll = distance * 0.020 + 1;
		} else {
			toll = distance * 0.02;
		}
		return toll;
	}

	@Override
	public String getType() {
		if (hasTrailer) {
		return "Car (with trailer)";
	} else {
		return "Car";
	}


	}
	}
