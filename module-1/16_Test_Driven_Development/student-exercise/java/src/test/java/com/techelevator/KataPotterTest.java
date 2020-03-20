package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataPotterTest {
	
//	@Test
//	public void getCost_method_2_2_2_1_1_returns_51dot20(){
//		int [] bookArray = {2, 2, 2, 1, 1};
//		assertEquals(51.20, KataPotter.getCost(bookArray), .001);
//	}
	
	@Test
	public void getCost_method_null_returns_0(){
		int [] bookArray = {};
		assertEquals(0.00, KataPotter.getCost(bookArray), 0.00001);
	}
	
	@Test
	public void getCost_method_1_returns_8(){
		int [] bookArray = {1};
		assertEquals(8.00, KataPotter.getCost(bookArray), .001);
	}
	
	
	@Test
	public void getCost_method_1_1_1_1_1_returns_30() {
		int [] bookArray = {1,1,1,1,1};
		assertEquals(30, KataPotter.getCost(bookArray), .001);
	}

}
