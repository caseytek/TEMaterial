package com.techelevator;

public class Airplane {
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
		this.availableCoachSeats = totalCoachSeats;
		this.availableFirstClassSeats = totalFirstClassSeats;
	}
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getAvailableFirstClassSeats() {
		return availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getAvailableCoachSeats() {
		return availableCoachSeats = totalCoachSeats - bookedCoachSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		boolean result = false;
		if (forFirstClass && availableFirstClassSeats >= totalNumberOfSeats) {
			bookedFirstClassSeats += totalNumberOfSeats;
 			result = true;
		} else if (forFirstClass == false && availableCoachSeats >= totalNumberOfSeats) {
			bookedCoachSeats += totalNumberOfSeats;
			result = true;
		} 
		return result;
	}
}
