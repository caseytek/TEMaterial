package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) throws FileNotFoundException {

		
		//new order
		FlowerShopOrder order = new FlowerShopOrder("peonies", 5);
		
		//prints the order using the modified toString
		System.out.println(order.toString());
		
		//add file path here
		List <FlowerShopOrder> orderList = new ArrayList <> ();

		File file = new File("FlowerInput.csv");
		Scanner fileScanner = new Scanner(file);
		
		//prints the lines of the file
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			String [] orderArray = line.split(",");
			orderList.add(new FlowerShopOrder(orderArray[0], Integer.parseInt(orderArray[1])));
		}
		
		for (FlowerShopOrder item: orderList) {
			System.out.println(item);
		}
		
		fileScanner.close();
	}

}
