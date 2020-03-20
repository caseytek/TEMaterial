package com.techelevator.PostageCalculator;

public class SecondClass implements DeliveryDriver {

	@Override
	public String getName() {
		return "Postal Service (2nd Class)";
	}

	@Override
	public double calculateRate(int distance, double weight,
			char unit) {
		double rate = 0;
		if (unit == 'P') {
			weight *= 16;
		} if (weight <= 2) {
			rate = 0.0035 * distance;
		} else if (weight <= 8 ) {
			rate = 0.0040 * distance;
		} else if (weight <= 15) {
			rate = 0.0047 * distance;
		} else if (weight <= 48) {
			rate = 0.0195 * distance;
		} else if (weight <= 128) {
			rate = 0.0450 * distance;
		} else {
			rate = 0.0500 * distance;
		} return rate;
	}

}
