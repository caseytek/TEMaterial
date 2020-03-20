package com.techelevator.PostageCalculator;

public class SUPNext implements DeliveryDriver {

	@Override
	public String getName() {
		return "SPU (Next Day)";
	}

	@Override
	public double calculateRate(int distance, double weight, char unit) {
		double rate = 0;
		if(unit == 'O') {
			weight = weight/16;
		} rate = (weight * 0.075) * distance;
		return rate;
	}

}
