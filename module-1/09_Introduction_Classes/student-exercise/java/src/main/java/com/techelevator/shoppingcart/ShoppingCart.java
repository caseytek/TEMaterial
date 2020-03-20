package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	private int numberOfItems;
	
	public ShoppingCart () {
		this.totalNumberOfItems = 0;
		this.totalAmountOwed = 0.00;
		this.numberOfItems = 0;
	}
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	public double getAveragePricePerItem() {
		if (totalNumberOfItems > 0) {
		return totalAmountOwed/totalNumberOfItems;
	} else { 
		return 0;
		}
	}	
	
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems += numberOfItems;
		totalAmountOwed = pricePerItem * totalNumberOfItems;
	}
	
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0;
	}
}
