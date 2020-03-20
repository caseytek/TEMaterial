package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Less20Test {

	Less20 less20 = new Less20();
	@Test
	public void method_tests_if_38_is_multiple_of_20() {
		assertTrue(less20.isLessThanMultipleOf20(38));
	}
	
	@Test
	public void method_tests_if_39_is_multiple_of_20() {
		assertTrue(less20.isLessThanMultipleOf20(39));
	}
	
	@Test
	public void method_tests_if_40_is_multiple_of_20() {
		assertFalse(less20.isLessThanMultipleOf20(40));
	}

}
