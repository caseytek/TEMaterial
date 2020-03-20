package com.techelevator;

public class LoopPrograms {

	public static void main(String[] args) {

		int[] nums = {5,7,12,1,24,3};
			int total = 0, smallest = nums[0], largest = nums[0]; //allows to declare 3 int variables
			double average = 0;
			
			for(int x=0; x < nums.length; ++x) {
				//accumulate the total of the array values
				total += nums[x];
				//find the smallest value
				if(nums[x] < smallest) {
					smallest = nums[x];
				//find the largest value
				} if (nums[x] > largest) {
					largest = nums[x];
					}
				}
			// calculate the average
			average = (double)total/nums.length; //has to be down here because it flows sequentially
			// print the results
			System.out.println("Smallest= " + smallest + " Largest= " + largest);
			System.out.println("Average= " + String.format("%.2f", average));
	
			countByFivesLoop();
		}
	
			
	public static void countByFivesLoop() {
		System.out.println("\n\nPrinting by 5s from 10 to 100 inclusive");
		for (int x = 10; x <101; x +=5) {
			System.out.println(x);
		}
	}
	
}
