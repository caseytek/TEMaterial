package com.techelevator.farm;

public class Cow extends FarmAnimal
	implements Singable{

	public Cow() {
		super("Cow", "moo!");
	}

	@Override
	public String getSoundOnce() {
		return "moo";
	}

	@Override
	public String getSoundTwice() {
		return "moo moo";
	}

}