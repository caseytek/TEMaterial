package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {
	
	public static void main(String[] args) throws IOException {
		//java.io.File class fives us file information and directory path info
		//we can use methods to inspect and modify file system objects
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the path of a file or directory");
		String path = input.nextLine();
		// use path from user input to create a new File object
		
		File file = new File(path);
		
		//some methods we can use
		if(file.exists()) {
			System.out.println("File Information");
			System.out.println("\tName: " + file.getName());
			System.out.println("\tAbsolute Path: " + file.getAbsolutePath());
			System.out.println("\tSize: " + file.length());
		
		if(file.isDirectory()) {
			System.out.println("\ttype: directory");
			System.out.println("\ttype: file");
			} if (file.isFile()) {
				System.out.println("\ttype: file");
			}
		} else {
			System.out.println("File does not exist");
		}
		
		System.out.println();
		System.out.println("Enter the name of a new directory: ");
		String pathName = input.nextLine();
		File newDirectory = new File(pathName);
		if(newDirectory.exists()) {
			System.out.println("Sorry, directory already exists");
			System.exit(0);
		} else {
			if(newDirectory.mkdir()) {
				System.out.println("New directory created at " + newDirectory.getAbsolutePath());
			} else {
				System.out.println("Could not create the directory");
				System.exit(0);
			}
			
		System.out.println();
		System.out.println("Let's create a new file");
		System.out.println("Enter a name for a file");
		String fileName = input.nextLine();
		File newFile = new File (newDirectory, fileName);
		
		newFile.createNewFile();
		
		System.out.println("File Information");
		System.out.println("\tName: " + newFile.getName());
		System.out.println("\tAbsolute Path: " + newFile.getAbsolutePath());
		System.out.println("\tSize: " + newFile.length());
		
		
		System.out.println();
		System.out.println("Writing to a file");
		System.out.println("Enter some text to be written to the file");
		String message = input.nextLine();
		
		PrintWriter writer = new PrintWriter(newFile);
		writer.println(message);
		writer.close();

		System.out.println("File Information");
		System.out.println("\tName: " + newFile.getName());
		System.out.println("\tAbsolute Path: " + newFile.getAbsolutePath());
		System.out.println("\tSize: " + newFile.length());
		
		
		}
	}	
}
