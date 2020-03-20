package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();

		/* Map is an interface and HashMap is a class that implements Map */
		Map <String, Integer> myMap = new HashMap <> ();

		/* The "put" method is used to add elements to a Map */
		myMap.put("Andorra", 42);
		myMap.put("James", 24);
		myMap.put("Seth", 7);
		myMap.put("Norm", 23);
		myMap.put("Kevin", 11);
		myMap.put("Margaret", 42);
		
		/* The "get" method is used to retrieve elements from a Map */
	System.out.println("Seth's favorite number is " + myMap.get("Seth"));
	
	int favNumber = myMap.get("Norm"); //Integer to int???? This is from boxing. Compiler automatically does this.
	System.out.println("Norm's favorite number is " + favNumber);
		/* keySet returns a Set of all of the keys in the Map */
		Set <String> keys = myMap.keySet();
		System.out.println("************Printing all Values **********");
		for (String name: keys) {
			System.out.println(name + "'s favorite number is " + myMap.get(name));
		}
		/* If the key already exists, put will overwrite the existing value with the new value */
		myMap.put("Margaret", 13 );
		System.out.println("Maggies favorite number is " + myMap.get("Margaret")); // overwrites margarets number

		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();

		Set <String> names = new HashSet <> ();
		

		System.out.println("####################");
		System.out.println("Sets cannot contain duplicates");
		System.out.println("####################");
		System.out.println();
		
		names.add("Scott");
		names.add("Greg");
		names.add("Casey");
		names.add("Mike");
		names.add("Son");
		names.add("Tim");
		
		names.add("Scott"); // this gets ignored
		System.out.println("####################");
		System.out.println("Sets do not guarantee ordering");
		System.out.println("####################");
		System.out.println();

		for (String name: names) {
			System.out.println(name + " Hash Value = " + name.hashCode());
		}

	}
	

}
