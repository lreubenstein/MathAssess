package com.company;

public class Time2 {
	private final int DAYSINYEAR = 365;
	private final int STARTYEAR = 1970;

	public int getNumYears(int days)
	{
		return days/DAYSINYEAR;
	}
	public int getYear(int days)
	{
		return getNumYears(days)+STARTYEAR;
	}
	public int getDayOfYear(int days)
	{
		//int years = getNumYears(days);
		//int day = days%(years*DAYSINYEAR);
		int day = days%DAYSINYEAR;
		return day;
	}
	public static void main(String[] args) {
		int theBigDay = 16214;
		Time2 t = new Time2();
		int y = t.getYear(theBigDay);
		int d = t.getDayOfYear(theBigDay);
		System.out.println("Day " + d + " of " + y);
	}

}
