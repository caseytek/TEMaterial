package com.techelevator.PostageCalculator;

public class FexEd implements DeliveryDriver {

	@Override
	public String getName() {
		return "FexEd";
	}

	@Override
	public double calculateRate(int distance, double weight, char unit) {
		double rate = 20;
		if (unit == 'P') {
			weight *= 16;
		} if (distance > 500) {
			rate += 5;
		} if (weight > 48) {
			rate += 3;
		}
		return rate;
	}

}
