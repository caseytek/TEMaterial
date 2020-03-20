package com.techelevator;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountTest {
	
	WordCount wordCount = new WordCount();

	@Test
	public void getCount_method_array_of_ba_ba_black_sheep_returns_map_with_elements_and_count() {
		String[] array = new String [] {"ba", "ba", "black", "sheep"};
		Map <String, Integer> map = new HashMap<>();
		map.put("ba", 2);
		map.put("black", 1);
		map.put("sheep", 1);
		assertTrue(map.equals(wordCount.getCount(array)));
	} 
	
	@Test
	public void getCount_method_array_of_a_b_a_c_b_returns_map_with_elements_and_count() {
		String[] array = new String [] {"a", "b", "a", "c", "b"};
		Map <String, Integer> map = new HashMap<>();
		map.put("b", 2);
		map.put("c", 1);
		map.put("a", 2);
		assertTrue(map.equals(wordCount.getCount(array)));
	}
	
	@Test
	public void getCount_method_array_of_c_b_a_returns_map_with_elements_and_count() {
		String[] array = new String [] {"c", "b", "a"};
		Map <String, Integer> map = new HashMap<>();
		map.put("b", 1);
		map.put("c", 1);
		map.put("a", 1);
		assertTrue(map.equals(wordCount.getCount(array)));
	}
	


}


/* getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep":1 }
*  getCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
* getCount([]) → {} getCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
*
**/