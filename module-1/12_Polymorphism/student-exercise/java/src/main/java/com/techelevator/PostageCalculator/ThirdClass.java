package com.techelevator.PostageCalculator;

public class ThirdClass implements DeliveryDriver {

	@Override
	public String getName() {
		return "Postal Service (3rd Class)";
	}

	@Override
	public double calculateRate(int distance, double weight, char unit) {
		double rate = 0;
		if (unit == 'P') {
			weight *= 16;
		} if (weight <= 2) {
			rate = 0.0020 * distance;
		} else if (weight <= 8 ) {
			rate = 0.0022 * distance;
		} else if (weight <= 15) {
			rate = 0.0024 * distance;
		} else if (weight <= 48) {
			rate = 0.0150 * distance;
		} else if (weight <= 128) {
			rate = 0.0160 * distance;
		} else {
			rate = 0.0170 * distance;
		} return rate;
	}

}
