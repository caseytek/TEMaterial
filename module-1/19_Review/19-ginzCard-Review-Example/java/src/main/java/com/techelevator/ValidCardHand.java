package com.techelevator;

public interface ValidCardHand {
	
	public void show();
	public void clearHand();
	public void dealHand(CardDeck aDeck);
	public void addCard(PlayingCard aCard);

}
