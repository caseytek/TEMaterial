package com.techelevator.PostageCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PostageCalculator {

	public static void main(String[] args) {

		Scanner entry = new Scanner (System.in);
		System.out.println("Please enter the weight of "
				+ "the package?");
		double packageWeight = Double.parseDouble
				(entry.nextLine());
		System.out.println("(P)ounds or (O)unces?");
		char unitType = (entry.nextLine()).charAt(0);
		System.out.println("What distance will it be traveling?");
		int distanceTraveled = Integer.parseInt(entry.nextLine());
		entry.close();
	
		FirstClass rate1 = new FirstClass();
		SecondClass rate2 = new SecondClass();
		ThirdClass rate3 = new ThirdClass();
		FexEd rate4 = new FexEd();
		SPU4 rate5 = new SPU4();
		SPU2 rate6 = new SPU2();
		SUPNext rate7 = new SUPNext();
		
		List <DeliveryDriver> rateList = new ArrayList<>(Arrays.asList(
				rate1, rate2, rate3, rate4, rate5, rate6, rate7));
		
		System.out.println("Delivery Method" + "          \t$ cost");
		System.out.println("--------------------------------------");
		for(DeliveryDriver rate: rateList) {
			System.out.printf("\n%-30s", rate.getName());
			System.out.printf("  %-18s", "$" + String.format("%.2f", rate.calculateRate(
					distanceTraveled, packageWeight, unitType)));
		}
		
	
	}

}
