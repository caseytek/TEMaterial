package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBitsTest {
	
	StringBits stringBits = new StringBits();

	@Test
	public void getBits_method_hello_returns_helo() {
		assertEquals("Hlo", stringBits.getBits("Hello"));
	}

	@Test
	public void getBits_method_Hi_returns_H() {
		assertEquals("H", stringBits.getBits("Hi"));
	}
	
	@Test
	public void getBits_method_Heeololeo_returns_Hello() {
		assertEquals("Hello", stringBits.getBits("Heeololeo"));
	}


}
