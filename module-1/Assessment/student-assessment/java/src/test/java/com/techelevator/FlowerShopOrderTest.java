package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlowerShopOrderTest { 

	
	@Test
	public void getSubtotal_5_roses_returns_34_point_94() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 5);
	assertEquals(2.99*5+19.99, order.getSubtotal(), .001);
	}
	
	@Test 
	public void getSubtotal_0_roses_returns_19_point_99() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 0);
	assertEquals(19.99, order.getSubtotal(), .001);
	}
	
	@Test
	public void deliveryTotal_same_day_and_1500_zipCode_returns_free_shipping() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 0);
	assertEquals(19.99, order.deliveryTotal(true, "1500"), .001);
	
	}
	
	@Test
	public void deliveryTotal_900_zipCode_returns_39_point_98() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 0);
	assertEquals(19.99 + 19.99, order.deliveryTotal(false, "900"), .001);
	}
	
	@Test
	public void deliveryTotal_sameDay_2000_zipCode_returns__point_() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 0);
	assertEquals(29.97, order.deliveryTotal(true, "2000"), .001);
	}
	
	@Test
	public void deliveryTotal__not_sameDay_2000_zipCode_returns_23_point_98() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 0);
	assertEquals(19.99 + 3.99, order.deliveryTotal(false, "2000"), .001);
	}
	
	@Test
	public void deliveryTotal_sameDay_2999_zipCode_returns__point_() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 0);
	assertEquals(19.99 + 3.99 + 5.99, order.deliveryTotal(true, "2999"), .001);
	}
	
	@Test
	public void deliveryTotal_sameDay_3000_zipCode_returns__point_() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 0);
	assertEquals(19.99 + 6.99 + 5.99, order.deliveryTotal(true, "3000"), .001);
	}
	
	@Test
	public void deliveryTotal_not_sameDay_3999_zipCode_returns__point_() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 0);
	assertEquals(19.99 + 6.99, order.deliveryTotal(false, "3999"), .001);
	}
	
	@Test
	public void toString_test() {
		FlowerShopOrder order = new FlowerShopOrder("Peonies", 0);
	assertEquals(19.99 + 6.99 + 5.99, order.deliveryTotal(true, "3500"), .001);
	}
	 

} 
