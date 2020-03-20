package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Fibonacci number: ");
		String fibonacciNumberInput = input.nextLine();
		int fibonacciNumber = Integer.parseInt(fibonacciNumberInput);
		int num = 0;
		int holderOne = 0;
		int holderTwo = 1;
		System.out.print("0, 1");
		while (holderOne + holderTwo <= fibonacciNumber) {
		num = holderOne + holderTwo;
		System.out.print(", " + num);
		holderOne = holderTwo;
		holderTwo = num;
		}
	}

}


//Please enter the Fibonacci number: 25
//0, 1, 1, 2, 3, 5, 8, 13, 21