package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Map Exercises
	 */

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		Map <String, String> animalGroupMap = new HashMap <> ();
		String result = "unknown";
		 animalGroupMap.put("rhino", "Crash"); 
		 animalGroupMap.put("giraffe", "Tower"); 
		 animalGroupMap.put("elephant", "Herd"); 
		 animalGroupMap.put("lion", "Pride"); 
		 animalGroupMap.put("crow", "Murder"); 
		 animalGroupMap.put("pigeon", "Kit"); 
 		 animalGroupMap.put("flamingo", "Pat"); 
		 animalGroupMap.put("deer", "Herd"); 
		 animalGroupMap.put("dog", "Pack"); 
		 animalGroupMap.put("crocodile", "Float");
		 String animalNameSmall = animalName.toLowerCase();
		 if (animalGroupMap.containsKey(animalNameSmall)) {
			 result = animalGroupMap.get(animalNameSmall);
		 } return result;
	}
	

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public Double isItOnSale(String itemNumber) {
		Map <String, Double> discountMap = new HashMap <> ();
		Double result = 0.00;
		discountMap.put("KITCHEN4001", 0.20);
		discountMap.put("GARAGE1070", 0.15);
		discountMap.put("LIVINGROOM", 0.10);
		discountMap.put("KITCHEN6073", 0.40);
		discountMap.put("BEDROOM3434", 0.60);
		discountMap.put("BATH0073", 0.15);
		String itemNumberBig = itemNumber.toUpperCase();
		 if (discountMap.containsKey(itemNumberBig)) {
			 result = discountMap.get(itemNumberBig);
		 }

		return result;
	}

	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		Map <String, Integer> peterPayPaul = new HashMap <> ();
		if (peterPaul.get("Peter") > 0 && peterPaul.get("Paul") < 1000) {
				peterPayPaul.put("Peter", peterPaul.get("Peter")/2 + peterPaul.get("Peter")%2);
				peterPayPaul.put("Paul", peterPaul.get("Paul") + peterPaul.get("Peter")/2);
				return peterPayPaul;
				} return peterPaul; 
			}		

    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		Map <String, Integer> peterPaulPartnership = new HashMap <> ();
		Integer peterContribution = peterPaul.get("Peter")/4;
		Integer paulContribution = peterPaul.get("Paul")/4;
		if (peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000) {
			peterPaulPartnership.put("Peter", peterPaul.get("Peter")- peterContribution);
			peterPaulPartnership.put("Paul",  peterPaul.get("Paul") - paulContribution);
			peterPaulPartnership.put("PeterPaulPartnership", peterContribution + paulContribution);
			return peterPaulPartnership;
			} return peterPaul; 
		}		


	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map <String, String> stringMap = new HashMap <> ();
//		for (int i=0; i < words.length; i++) {
		for (String word: words) {
			String firstChar = "" + word.charAt(0);
			String secondChar = "" + word.charAt(word.length()-1);
			stringMap.put(firstChar, secondChar);
		}
		return stringMap;
	}
	

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the
	 * number of times that string appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map <String, Integer> charMap = new HashMap <> ();
		for(String character: words) {
			int characterCount = 0;
			for(String findCharacterCount: words) {
				if (character.equals(findCharacterCount)) {
					characterCount++;
				} charMap.put(character, characterCount);
			}
			
			 
		} return charMap;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map <Integer, Integer> integerMap = new HashMap <> ();
		for(Integer integer: ints) {
			int integerCount = 0;
			for(Integer findIntegerCount: ints) {
				if (integer == findIntegerCount) {
					integerCount++;
				} integerMap.put(integer, integerCount);
			}
			
		} return integerMap;
	}

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map <String, Boolean> characterBooleanMap = new HashMap <> ();
		Boolean twoOrMore = false;
		for(String character: words) {
			int characterCount = 0;
			for(String findCharacterCount: words) {
				if (character.equals(findCharacterCount)) {
					characterCount++;
				} if ( characterCount >= 2) {
					twoOrMore = true;
				} else {
					twoOrMore = false;
				}
			} characterBooleanMap.put(character, twoOrMore);
		} return characterBooleanMap;
			
	} 

	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2,
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 *
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
//	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
//		Map <String, Integer> consolidatedMap = new HashMap <> ();
//		for(String mainKey: mainWarehouse.keySet()) {
//			for(String remoteKey: remoteWarehouse.keySet()) {
//				if (mainKey.equals(remoteKey)) {
//					int consolidatedInt = mainWarehouse.get(mainKey) + remoteWarehouse.get(mainKey);
//					consolidatedMap.put(mainKey, consolidatedInt);
//				} else {
//					consolidatedMap.put(mainKey, mainWarehouse.get(mainKey));
//					consolidatedMap.put(remoteKey, remoteWarehouse.get(remoteKey));
//				}
//			}
//		} return consolidatedMap;
//	}
	
	//or
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		Map <String, Integer> warehouse = new HashMap <> ();
		for(String sku: mainWarehouse.keySet()) {
			int value = mainWarehouse.get(sku);
			warehouse.put(sku, value);
		} 
		for(String sku: remoteWarehouse.keySet() ) {
			int value = remoteWarehouse.get(sku);
		 if (mainWarehouse.containsKey(sku)) {
			int mainValue = warehouse.get(sku);
			warehouse.put(sku, value + mainValue);
		 } else {
				int remoteValue = remoteWarehouse.get(sku);
				warehouse.put(sku, remoteValue);
			}
		} return warehouse;
	}		

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1.
	 *
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map <String, Integer> lastTwoMap = new HashMap <> ();
		for (String word: words) {
		int count = 0;
		for (int i = 0; i < word.length()-2; i+=1) {
		String lastTwo = word.substring(word.length()-2);
		if (word.substring(i, i+2).equals(lastTwo)) {
			count++;
		} lastTwoMap.put(word, count);
			}
		} return lastTwoMap;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		Set <String> distinctSet = new LinkedHashSet <> ();
		List <String> distinctList = new ArrayList <> ();
		for (String word: stringList) {
			distinctSet.add(word);
		} 
		for (String word: distinctSet) {
			distinctList.add(word);
			} return distinctList;
		}

}
