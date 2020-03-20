package com.techelevator.farm;

public class Sheep extends FarmAnimal
	implements Singable{

	public Sheep() {
		super("Sheep", "baa");
	}

	@Override
	public String getSoundOnce() {
		return "baa";
	}

	@Override
	public String getSoundTwice() {
		return "baa baa";
	}
}
