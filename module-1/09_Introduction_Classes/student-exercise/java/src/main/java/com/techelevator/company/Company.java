package com.techelevator.company;

public class Company {

	// Data members are:
	
	private String name;
	private double revenue;
	private double expenses;
	private int numberOfEmployees;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public double getExpenses() {
		return expenses;
	}
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public String getCompanySize() {
		if (numberOfEmployees <= 50) {
			return "small";
		} else if (numberOfEmployees <= 250) {
			return "medium";
		} //else {
			return "large";
		}
	
	public double getProfit() {
		return revenue-expenses;
	}
	
	
}
