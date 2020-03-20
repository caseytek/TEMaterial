package com.techelevator;

public class DogDemo {
//this has access to our dog file because its in the same package
	public static void main(String[] args) {
		// create a dog object
		Dog dog1 = new Dog();
//		dog1.setName("Penny");
//		dog1.setHas4Legs(true);
//		dog1.setCutenessFactor(10);
		System.out.println("Dog name: " + dog1.getName());
		System.out.println("Cuteness Factor: " + dog1.getCutenessFactor());
		System.out.println("Has 4 legs? " + dog1.getHas4Legs());
		
		Dog dog2 = new Dog();
		dog2.setName("Leila");
		dog2.setHas4Legs(true);
		dog2.setCutenessFactor(3);
		
		System.out.println("\nDog name: " + dog2.getName());
		System.out.println("Cuteness Factor: " + dog2.getCutenessFactor());
		System.out.println("Has 4 legs? " + dog2.getHas4Legs());
		dog2.printHowCute();
		
		//dog1 and dog2 point to a separate location in heap.
		Dog dog3 = new Dog("Max", 10, true); // order matters
		System.out.println(dog3.getName());

	}

}
