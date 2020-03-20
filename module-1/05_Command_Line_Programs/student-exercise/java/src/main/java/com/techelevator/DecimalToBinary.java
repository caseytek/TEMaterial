package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		String num = input.nextLine();
		String[] numArray = num.split(" ");
		for (int x=0; x < numArray.length; x++ ) {
			int numberInt = Integer.parseInt(numArray[x]);
			int binary[] = new int[40];
		     int index = 0;
		     while(numberInt > 0){
		       binary[index++] = numberInt%2;
		       numberInt = numberInt/2;
		     } for(int i = index-1;i >= 0;i--){
		       System.out.print(binary[i]);
		     } 
		     System.out.println(" binary is " + numArray[x] + " in decimal value. " ); 
		}
	}
}

//Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321
//
//460 in binary is 111001100
//8218 in binary is 10000000011010
//1 in binary is 1
//31313 in binary is 111101001010001
//987654321 in binary is 111010110111100110100010110001
