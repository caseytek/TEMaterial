package review;

import java.util.Scanner;

public class Enums {
	
	public enum Directions{
		NORTH, SOUTH, EAST, WEST;
	}


	public static void main(String[] args) {
		Directions dir = Directions.NORTH;
		
		switch(dir) { //with a switch statement
		case NORTH:
			System.out.println("Heading North");
			break;
		case SOUTH:
			System.out.println("Heading South");
			break;
		case EAST:
			System.out.println("Heading East");
			break;
		default:
			System.out.println("Heading West");
		
		if (dir == Directions.NORTH) {   //with an if statement
			System.out.println("Head North");
		} else if(dir == Directions.SOUTH) {
			System.out.println("Head South");
		} else if (dir == Directions.EAST) {
			System.out.println("Head East");
		} else if (dir == Directions.WEST) {
		System.out.println("Heading West");
		} else {
			System.out.println("Heading East");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a direction");
		String compassDir = input.nextLine();
		
		Directions [] dirArray = Directions.values(); //returns all Direction 
													  //values into an array
		for (Directions d : dirArray) {
			if (d.toString().equals(compassDir.toUpperCase())) {
				System.out.println("Found!");
			}
		}
		
	}
		
	}
	
}
