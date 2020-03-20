package com.techelevator;

public class Dog {
	//data members or instance variables
	//Characteristics
	private boolean has4Legs;
	private int cutenessFactor;
	private String name;
	
	
	
	//create a constructor. the shorthand way to load in data members. a special method without a return type
	
	public Dog () { //default constructor. sets the defaults in the heap to these rather than false, 0, and null
					// this way you don't have to do the set right away and gives us something to work with.
		this.has4Legs = true;
		this.cutenessFactor = 5;
		this.name = "Spot";
	}
	
	public Dog(String name) { //overloading, same name can have two different behaviors
 		this.name = name;
	}
	//method is overloading bc two methods of the same name
	public Dog (String name, int cutenessFactor, boolean has4Legs) {
 		this.name = name;
		this.cutenessFactor = cutenessFactor;
		this.has4Legs = has4Legs;
	}
	
	
	//Getters and Setters. Behaviors (methods) for out data members
	
	public void setHas4Legs(boolean has4Legs) {
		this.has4Legs = has4Legs;
	}
	
	public boolean getHas4Legs() {
		return has4Legs;
	}
	
	public void setCutenessFactor(int cutenessFactor) {
		this.cutenessFactor = cutenessFactor;
	}
	
	public int getCutenessFactor() {
		return cutenessFactor;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void printHowCute() {
		if(cutenessFactor >= 5) {
			System.out.println("Hey, it's a cute dog");
		} else {
			System.out.println("Looks aren't everything");
		}
	}
}
