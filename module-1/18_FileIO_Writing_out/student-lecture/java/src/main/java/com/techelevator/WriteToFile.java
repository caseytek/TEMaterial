package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the file name to write to: ");
		String fileName = input.nextLine();
		
//		File file = new File(fileName);
		PrintWriter writer = null;
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(fileName, true);
			writer = new PrintWriter(fileWriter);
		} catch (IOException e) {
			System.out.println("File cannot be written to");
			e.printStackTrace();
			System.exit(0);
		}
		
		writer.println("Employee Name                    Hours    Rate    Salary");
		writer.println("========================================================");
		for(int i=0; i < 3; i++) {
		System.out.println("Enter employee name: ");
		String name = input.nextLine();
		System.out.println("Enter number of hours worked: ");
		int hoursWorked = Integer.parseInt(input.nextLine());
		System.out.println("Enter rate of pay: ");
		double payRate = Double.parseDouble(input.nextLine());
		double salary = hoursWorked * payRate;
		
		writer.printf("%-30s %6d %8.2f %8.2f\n", name, hoursWorked, payRate, salary);
		}
		writer.close(); //closes the file
	}		
}
