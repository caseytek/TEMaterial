package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxEnd3Test {

	MaxEnd3 maxEnd3 = new MaxEnd3();
	
	@Test
	public void makeArray_method_1_2_3_returns_3_3_3() {
		int[] array = new int[]{1, 2, 3};
		int[] convertedArray = new int[]{3, 3, 3};
		
		assertArrayEquals(convertedArray, maxEnd3.makeArray(array));
	}
	
	@Test
	public void makeArray_method_11_5_9_returns_11_11_11() {
		int[] array = new int[]{11, 5, 9};
		int[] convertedArray = new int[]{11, 11, 11}; 
		
		assertArrayEquals(convertedArray, maxEnd3.makeArray(array));
	}
	
	@Test
	public void makeArray_method_1_11_3_returns_3_3_3() {
		int[] array = new int[]{1, 11, 3};
		int[] convertedArray = new int[]{3, 3, 3};
		
		assertArrayEquals(convertedArray, maxEnd3.makeArray(array));
	}
}
