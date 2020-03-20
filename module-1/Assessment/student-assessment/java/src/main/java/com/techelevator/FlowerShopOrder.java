package com.techelevator;

public class FlowerShopOrder {
	
	private String bouquetType;
	private int numberOfRoses;
	
	public FlowerShopOrder(String bouqueType, int numberOfRoses) {
		this.bouquetType = bouqueType;
		this.numberOfRoses = numberOfRoses; 
	}
	
	public double getSubtotal() {
		double subtotal = 19.99 + (this.numberOfRoses*2.99);
		return subtotal;
	} 
	
	public double deliveryTotal(boolean isSameDay, String zipCode) {
		double total = getSubtotal();
		int intZipCode = Integer.parseInt(zipCode);
		if(intZipCode < 1000 || intZipCode > 3999) {
			total += 19.99;
		} if (isSameDay == true && !(intZipCode < 2000)) {
			total += 5.99;
		} if (intZipCode >= 2000 && intZipCode <= 2999) {
			total += 3.99;
		} else if (intZipCode >= 3000 && intZipCode <= 3999) {
			total += 6.99;
		} return total;
	}
	
	
	@Override
	public String toString() {
		return "ORDER - {" + this.bouquetType + "} - {" 
	+ this.numberOfRoses + "} roses - {" + getSubtotal() + "}";
	} 
		
}
