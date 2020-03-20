package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("FizzBuzz.txt");
		PrintWriter writer = new PrintWriter(file);
		
		
		for(int x = 1; x <= 300; x++) {
			String xString = Integer.toString(x);
		if(x % 3 == 0 && x % 5 == 0) {
			writer.println(x + " returns FizzBuzz");
		} else if (x % 3 == 0 || xString.contains("3")) {
			writer.println(x + " returns Fizz");
		} else if (x % 5 == 0 || xString.contains("5")) {
			writer.println(x + " returns Buzz");
		} else {
			writer.println(x + " does not return Fizz, Buzz, or FizzBuzz");
			}
		}
		System.out.println("FizzBuzz.txt has been created.");
		writer.close();
	}
}