package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonStartTest {
	
	NonStart nonStart = new NonStart();

	@Test
	public void getPartialString_method_hello_and_there_returns_ellohere() {
		assertEquals("ellohere", nonStart.getPartialString("Hello", "There"));	
	}
	
	@Test
	public void getPartialString_method_java_and_code_returns_avaode() {
		assertEquals("avaode", nonStart.getPartialString("Java", "Code"));	
	}
	
	@Test
	public void getPartialString_method_shotl_and_java_returns_hotlava() {
		assertEquals("hotlava", nonStart.getPartialString("shotl", "java"));	
	}
}
