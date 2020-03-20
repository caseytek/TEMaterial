package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPotter {
	
	public static double getCost(int[] books) {
		double price = 0.00;
		List <Integer> bookList = new ArrayList <>();
		if (books == null) {
			return 0.00;
		} while(books != null) {
			int uniqueBookCount = 0;
			for(int bookCount: books){
			if(bookCount > 0) {
				uniqueBookCount++;
				bookCount--;
				} 
			} bookList.add(uniqueBookCount);
		} if (bookList.size() == 1) {
			price = bookList.get(0)*8;
		} else if (bookList.size() == 5) {
			price = 5 * 8; 
		} return price;	 
	}		
		
	}	