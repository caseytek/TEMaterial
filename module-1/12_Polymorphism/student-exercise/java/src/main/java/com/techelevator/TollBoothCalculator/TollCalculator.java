package com.techelevator.TollBoothCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TollCalculator{
	public static void main(String[] args) {
	
	Car vehicle1 = new Car(true);
	Car vehicle2 = new Car(false);
	Tank vehicle3 = new Tank();
	Truck vehicle4 = new Truck(4);
	Truck vehicle5 = new Truck(6);
	Truck vehicle6 = new Truck(8);
	
	List <Vehicle> vehicleList = new ArrayList<>(Arrays.asList(vehicle1, vehicle2,
			vehicle3, vehicle4, vehicle5, vehicle6));
	

	System.out.printf("%-18s   %-17s    %-8s\n","Vehicle"," Distance Traveled" ,"Toll $");
	System.out.println("-----------------------------------------------------");
	int totalMiles = 0;
	double totalRevenue = 0;
	for (Vehicle vehicle: vehicleList) {
		System.out.printf("%-18s",vehicle.getType());
		int randomNumber =(int) (Math.random() *  (240 - 10) + 10);
		System.out.printf("    %-5d", randomNumber);
		totalMiles += (int)randomNumber;
		double tollCost = vehicle.calculateToll(randomNumber);
		System.out.println("                $" + String.format("%.2f", tollCost ));
		totalRevenue += tollCost;
		}
	System.out.println("\nTotal Miles Traveled: " + totalMiles);
	System.out.println("Total Tollbooth Revenue: $" + String.format("%.2f", totalRevenue));

	}
}
