package com.company;

public class Time {

	
	public Time()
	{
		
	}
	public int yearsSince1970(int sec)
	{
		return sec/secondsInAYear();
	}
	public int secondsInAYear()
	{
		return 365*24*3600;
	}
	public int secondsInADay()
	{
		return 24*3600;
	}
	public int makeSeconds(int years, int days, int hours, int minutes, int sec)
	{
		return years*secondsInAYear() + days*secondsInADay() + hours*3600 + minutes*60 + sec;
	}
	public void printDate(int sec)
	{
		int years = yearsSince1970(sec);
		int currYear = years + 1970;
		int days = (sec%secondsInAYear())/secondsInADay();
		
		System.out.println("Day " + days + " of " + currYear);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		int s = t.makeSeconds(44,154,18,30,0);
		System.out.println(s);
		
		t.printDate(s);

	}

}
