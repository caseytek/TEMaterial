package com.techelevator.PostageCalculator;

public class SPU4 implements DeliveryDriver {

	@Override
	public String getName() {
		return "SPU (4-Day Ground)";
	}

	@Override
	public double calculateRate(int distance, double weight, 
			char unit) {
		double rate = 0;
		if(unit == 'O') {
			weight = weight/16;
		} rate = (weight * 0.0050) * distance;
		return rate;
	}

}
