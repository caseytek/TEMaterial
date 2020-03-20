package com.techelevator;

public class KataFizzBuzz {
	
	
	public static String fizzBuzz(int num) {
		String number = Integer.toString(num);
		if (num > 100 || num < 1) {
			return "";
		}else if (num%3 == 0 && num%5 == 0 
				|| number.contains("3") && number.contains("5")) {
			return "FizzBuzz";
		} else if (num%3 == 0 
				|| number.contains("3")){
			return "Fizz";
		} else if (num%5 == 0 || number.contains("5")) {
			return "Buzz";
		} else 
		return number;
	}
	
	

}
