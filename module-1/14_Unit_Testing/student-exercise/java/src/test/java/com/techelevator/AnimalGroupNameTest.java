package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalGroupNameTest {
	
	AnimalGroupName animalGroup = new AnimalGroupName();

	@Test
	public void getHerd_method_giraffe_returns_tower() {
		String expected = "Tower";
		String actual = animalGroup.getHerd("Giraffe");
		assertEquals(expected, actual);
	}
	
	@Test
	public void getHerd_method_null_returns_unknown() {
		String expected = "unknown";
		String actual = animalGroup.getHerd("");
		assertEquals(expected, actual);
	}
	
	@Test
	public void getHerd_method_walrus_returns_unknwon() {
		String expected = "unknown";
		String actual = animalGroup.getHerd("Walrus");
		assertEquals(expected, actual);
	}
	
	@Test
	public void getHerd_method_rhino_returns_crash() {
		String expected = "Crash";
		String actual = animalGroup.getHerd("Rhino");
		assertEquals(expected, actual);
	}
	
	@Test
	public void getHerd_method_lowercase_rhino_returns_crash() {
		String expected = "Crash";
		String actual = animalGroup.getHerd("rhino");
		assertEquals(expected, actual);
	}
	
	@Test
	public void getHerd_method_elephants_returns_unknown() {
		String expected = "unknown";
		String actual = animalGroup.getHerd("elephants");
		assertEquals(expected, actual);
	}

}
