package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lucky13Test {

	Lucky13 lucky13 = new Lucky13();
	
	
	@Test
	public void getLucky_method_if_0_2_4_returns_true() {
		int[] array = new int[]{0, 2, 4}; 
		assertTrue(lucky13.getLucky(array));
	}
	
	@Test
	public void getLucky_method_if_1_2_3_returns_false() {
		int[] array = new int[]{1, 2, 3}; 
		assertFalse(lucky13.getLucky(array));
	}
	
	@Test
	public void getLucky_method_if_1_2_4_returns_false() {
		int[] array = new int[]{1, 2, 4}; 
		assertFalse(lucky13.getLucky(array));
	}
	
	

}
