package com.techelevator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.techelevator.PlayingCard.CardSuit;
import com.techelevator.PlayingCard.CardValue;

public class CardDeck {
	
	/*
	 * class to simulate a Deck of Playing Cards
	 * Let's set this up as a queue/ LinkedList
	 */
	
	Queue <PlayingCard> deckOfCards = new LinkedList<>(); 
	

	//define number of cards in a suit
	public static final int NUMBER_OF_CARDS_FOR_SUIT = 13;

	
	
	public CardDeck() {
		resetDeck(true);
	}
	
	public CardDeck(boolean withJokers) {
		resetDeck(withJokers);
	}
	
	
	public void resetDeck(boolean withJokers) {
		deckOfCards.clear(); //removes all elements from queue;
		for (int i = 1; i <= NUMBER_OF_CARDS_FOR_SUIT; i++) {
			deckOfCards.add(new PlayingCard(i, PlayingCard.CardSuit.SPADE));
		}
		for (int i = 1; i <= NUMBER_OF_CARDS_FOR_SUIT; i++) {
			deckOfCards.add(new PlayingCard(i, PlayingCard.CardSuit.HEART));
		}
		for (int i = 1; i <= NUMBER_OF_CARDS_FOR_SUIT; i++) {
			deckOfCards.add(new PlayingCard(i, PlayingCard.CardSuit.DIAMOND));
		}
		for (int i = 1; i <= NUMBER_OF_CARDS_FOR_SUIT; i++) {
			deckOfCards.add(new PlayingCard(i, PlayingCard.CardSuit.CLUB));
		}
		if(withJokers) {
			deckOfCards.add(new PlayingCard(CardValue.JOKER, CardSuit.JOKER));
			deckOfCards.add(new PlayingCard(CardValue.JOKER, CardSuit.JOKER));
			}
	
	}
	
	public void shuffleDeck() {
		Collections.shuffle((List<?>) deckOfCards);
	}
	
	
	public PlayingCard dealCard() {
		if(deckOfCards.size() > 0) {
			return deckOfCards.remove();
			}
		return null;	
	}
	
	public void showDeck() {
		System.out.println("Number of cards in deck " + deckOfCards.size() );
		for(PlayingCard card: deckOfCards) {
			card.showCardWithHash();
		}
	}

}
