package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SameFirstLastTest {
	
	SameFirstLast sameFirstLast = new SameFirstLast();

	@Test
	public void isItTheSame_method_does_array_1_2_3_return_false() {
		int [] array = new int [] {1, 2, 3}; 
		assertFalse(sameFirstLast.isItTheSame(array));
	}
	
	@Test
	public void isItTheSame_method_does_array_1_2_3_1_return_true() {
		int [] array = new int [] {1, 2, 3, 1}; 
		assertTrue(sameFirstLast.isItTheSame(array));
	}
	
	@Test
	public void isItTheSame_method_does_array_1_2_1_return_true() {
		int [] array = new int [] {1, 2, 1}; 
		assertTrue(sameFirstLast.isItTheSame(array));
	}

}
