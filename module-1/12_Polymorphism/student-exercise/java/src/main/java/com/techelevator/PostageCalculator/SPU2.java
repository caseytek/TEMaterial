package com.techelevator.PostageCalculator;

public class SPU2 implements DeliveryDriver {

	@Override
	public String getName() {
		return "SPU (2-Day Business)";
	}

	@Override
	public double calculateRate(int distance, double weight, char unit) {
		double rate = 0;
		if(unit == 'O') {
			weight = weight/16;
		} rate = (weight * 0.050) * distance;
		return rate;
	}

}
