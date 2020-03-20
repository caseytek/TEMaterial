package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) throws IOException {
		
		File originalFile = getOriginalFileFromUser();
		Scanner fileScanner = new Scanner(originalFile);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the maximum amount of lines "
				+ "that should appear in each output file?");
		int maxLines =Integer.parseInt(input.nextLine());
		
		int i = 1;
		while(fileScanner.hasNextLine()) {
			File newFile = createNewDestinationFileFromUser(i);
			PrintWriter writer = new PrintWriter(newFile);
			for(int x = 1; x < maxLines; x++) {
				String line = fileScanner.nextLine();
				writer.println(line);
			} i++;
		}
		
		

	fileScanner.close();
	input.close();
	}


	@SuppressWarnings("resource")
	private static File getOriginalFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a path to search");
		String path = userInput.nextLine();
		File inputFile = new File(path);
		if (inputFile.exists() == false) {
			System.out.println(path + " does not exist");
			System.exit(0);
		} else if (inputFile.isFile() == false) {
			System.out.println(path + " is not a valid file");
			System.exit(0);
		}
		return inputFile;
	}

	@SuppressWarnings("resource")
	private static File createNewDestinationFileFromUser(int i) {
		File file = new File("input-" + i + ".txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("That is an invalid destination");
			System.exit(0);
			e.printStackTrace();
		}
		return file;
	}
}