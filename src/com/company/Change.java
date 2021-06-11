package com.company;

public class Change {
	public static final int DOLLAR = 100;
	public static final int QUARTER = 25;
	public static final int DIME = 10;
	public static final int NICKEL = 5;
	public static final int PENNY = 1;
	

	
	// precondition: you may assume that the amount paid is >= the cost
	public static void printChange(double cost, double amtPaid)
	{
		int change = (int)((amtPaid - cost) * 100);
		int dollars = change/DOLLAR;
		int left = change%DOLLAR;
		int quarters = left/QUARTER;
		left = left%QUARTER;
		int dimes = left/DIME;
		left = left%DIME;
		int nickels = left/NICKEL;
		int pennies = left%NICKEL;
		
		System.out.println("You get back " + dollars + " dollars " + quarters + " quarters "
				+ dimes + " dimes " + nickels  + " nickels " + pennies + " pennies.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printChange(6.25, 7.00);
		printChange(7.24, 8.03);
		printChange(2.41, 15.00);
	}

}
