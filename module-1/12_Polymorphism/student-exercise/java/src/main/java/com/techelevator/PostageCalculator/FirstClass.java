package com.techelevator.PostageCalculator;

public class FirstClass implements DeliveryDriver {
	
	@Override
	public String getName() {
		return "Postal Service (1st Class)";
	}

	@Override
	public double calculateRate(int distance, double weight, char unit) {
		double rate = 0;
		if (unit == 'P') {
			weight *= 16;
		}
		if (weight <= 2) {
			rate = 0.035 * distance;
		} else if (weight <= 8 ) {
			rate = 0.040 * distance;
		} else if (weight <= 15) {
			rate = 0.047 * distance;
		} else if (weight <= 48) {
			rate = 0.195 * distance;
		} else if (weight <= 128) {
			rate = 0.450 * distance;
		} else {
			rate = 0.500 * distance;
		} return rate;
	}

}
