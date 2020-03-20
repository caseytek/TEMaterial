package com.techelevator.playingcard_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List <PlayingCard> listOfCards = new ArrayList<>();

	public Deck() {
		for (String suit: new String [] {"Spades", "Hearts", "Diamonds", "clubs"}) {
			for(char rank : new char[] { 'A', '2', '3', '4', '5', '6', '7', '8', '9', 
					'T', 'J', 'Q', 'K'}) {
				//create an object
				PlayingCard currentCard = new PlayingCard(suit, rank);
				//add to our list
				listOfCards.add(currentCard);			
				}
			}
		}
	//randomly shuffles a List!
	public void shuffle() {
		Collections.shuffle(listOfCards);
	}
	//deals a single card
	public PlayingCard deal() {
		if (listOfCards.size() != 0) {
			return listOfCards.remove(0);
		} else {
			return null;
		}
	}
	
	public String toString() {
		return "Deck [" + listOfCards + "]";
	}
}
	