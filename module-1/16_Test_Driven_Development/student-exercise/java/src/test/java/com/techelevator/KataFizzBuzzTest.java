package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataFizzBuzzTest {
	
	@Test
	public void fizzBuzz_method_1_returns_1(){
	assertEquals("1", KataFizzBuzz.fizzBuzz(1)); 	
	}

	@Test
	public void fizzBuzz_method_3_returns_Fizz(){
	assertEquals("Fizz", KataFizzBuzz.fizzBuzz(3)); 	
	}
	
	@Test
	public void fizzBuzz_method_5_returns_Buzz(){
	assertEquals("Buzz", KataFizzBuzz.fizzBuzz(5)); 	
	}
	
	@Test
	public void fizzBuzz_method_15_returns_Buzz(){
	assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(15)); 	
	}
	
	@Test
	public void fizzBuzz_method_22_returns_22(){
	assertEquals("22", KataFizzBuzz.fizzBuzz(22)); 	
	}
	
	@Test
	public void fizzBuzz_method_0_returns_null(){
	assertEquals("", KataFizzBuzz.fizzBuzz(0)); 	
	}
	
	@Test
	public void fizzBuzz_method_13_returns_fizz(){
	assertEquals("Fizz", KataFizzBuzz.fizzBuzz(13)); 	
	}
	
	@Test
	public void fizzBuzz_method_35_returns_fizzbuzz(){
		assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(35)); 	
		}
	
	@Test
	public void fizzBuzz_method_51_returns_buzz(){
		assertEquals("Fizz", KataFizzBuzz.fizzBuzz(51)); 	
		}
	
	@Test
	public void fizzBuzz_method_53_returns_fizzbuzz(){
		assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(53)); 	
		}
}
