package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CigarPartyTest {
	
	CigarParty cigarParty = new CigarParty();

	@Test
	public void haveParty_method_30_cigars_and_false_return_false() {
		boolean expected = false;
		boolean actual = cigarParty.haveParty(30, false);
		assertEquals(expected, actual);
	}
	
	@Test
	public void haveParty_method_50_cigars_and_false_return_true() {
		boolean expected = true;
		boolean actual = cigarParty.haveParty(50, false);
		assertEquals(expected, actual);
	}
	
	@Test
	public void haveParty_method_70_cigars_and_true_return_true() {
		boolean expected = true;
		boolean actual = cigarParty.haveParty(70, true);
		assertEquals(expected, actual);
	}

}
