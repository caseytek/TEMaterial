package com.techelevator.PostageCalculator;

public interface DeliveryDriver {
	public String getName();
	public double calculateRate(int distance, double weight, char unit);

}
