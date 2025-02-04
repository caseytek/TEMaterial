package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {
	
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException { // have to handle this exception

		printApplicationBanner();
		
		File inputFile = getInputFileFromUser();
		try(Scanner fileScanner = new Scanner(inputFile)) {
			while(fileScanner.hasNextLine()) { //MAKE SURE THERE IS SOMETHING THERE
				String line = fileScanner.nextLine(); // PICKS UP ONE LINE FROM A FILE AT A TIME
				String rtn = line.substring(0); 
				
				if(checksumIsValid(rtn) == false) { 
					System.out.println(line);
				}
			}
		}
	}

	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);//this connects the user 
		//entered file name to a file object
		
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt("" + routingNumber.charAt(i));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
