package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrontTimesTest {
	
	FrontTimes frontTimes = new FrontTimes();

	@Test
	public void generateString_method_chocolate_and_2_returns_chocho() {
		assertEquals("ChoCho", frontTimes.generateString("Chocolate", 2));
	}
	@Test
	public void generateString_method_chocolate_and_3_returns_chochocho() {
		assertEquals("ChoChoCho", frontTimes.generateString("Chocolate", 3));
	}
	@Test
	public void generateString_method_abc_and_3_returns_abcabcabc() {
		assertEquals("AbcAbcAbc", frontTimes.generateString("Abc", 3));
	}

}
