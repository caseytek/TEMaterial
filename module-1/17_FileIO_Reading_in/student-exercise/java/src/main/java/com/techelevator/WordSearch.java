package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = getInputFileFromUser();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What is the word you are searching for?");
		String word = userInput.nextLine();
		
		System.out.println("Should the word be case sensitive? (Y/N)");
		String answer = userInput.nextLine();
		
		boolean isCaseSensitive;
		if (answer.equals("Y")) {
			isCaseSensitive = true;
		} else {
			isCaseSensitive = false;
		}
		
		
		try(Scanner fileScanner = new Scanner(inputFile)) {
			int pageCount = 1;
			int linesWithWord = 0;
			while(fileScanner.hasNextLine()) {	 
				String line = fileScanner.nextLine();
				String rtn = line.substring(0);
				if(checkForString(rtn, word, isCaseSensitive) == true) {
					System.out.println(pageCount + ") " + rtn);
					linesWithWord++;
				} pageCount++;
			} if(linesWithWord == 0) {
				System.out.println("File does not contain " + word);
			}
		}		
	}
	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner (System.in);
		System.out.println("What is the file that should be searched?");
		String fileLocation = userInput.nextLine();
		File inputFile = new File(fileLocation);
		if(inputFile.exists() == false) {
			System.out.println(fileLocation +" does not exist");
			System.exit(1);
		} else if (inputFile.isFile() == false) {
			System.out.println(fileLocation + " is not a file");
			System.exit(1);
		} return inputFile;
	}
	
	private static boolean checkForString(String line, String word, boolean answer) {
		boolean result = false;
		if (line.contains(word) && answer == true) {
			result = true;
		} else if (answer == false) {
			String newLine = line.toLowerCase();
			String newWord = word.toLowerCase();
			if (newLine.contains(newWord)) {
				result = true;
			}
		} return result;
	}
}