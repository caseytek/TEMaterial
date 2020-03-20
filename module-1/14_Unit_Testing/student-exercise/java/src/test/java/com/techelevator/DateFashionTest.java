package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateFashionTest {
	
	DateFashion dateFashion = new DateFashion();

	@Test
	public void getATable_method_you_are_5_and_date_is_10_return_2() {
		assertEquals(2, dateFashion.getATable(5, 10));
	}
	
	@Test
	public void getATable_method_you_are_5_and_date_is_2_return_0() {
		assertEquals(0, dateFashion.getATable(5, 2));
	}
	
	@Test
	public void getATable_method_you_are_5_and_date_is_5_return_1() {
		assertEquals(1, dateFashion.getATable(5, 5));
	}

}
