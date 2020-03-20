package com.techelevator.playingcard_project;

public class PlayingCardDemo {

	public static void main(String[] args) {

		PlayingCard aceOfSpades = new PlayingCard();
		System.out.println(aceOfSpades);
	
	PlayingCard deuceOfDiamonds = 
			new PlayingCard("Diamonds", '2', 2, false);
	System.out.println(deuceOfDiamonds);
	deuceOfDiamonds.flip();
	System.out.println(deuceOfDiamonds);
	}
}
