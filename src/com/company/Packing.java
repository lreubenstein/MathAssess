package com.company;

public class Packing {
	
	public static double costPerPound = 1.5;
	public static double costPerBox = 2.5;
	
	public static double totalCost(int lbPerJar, int ozPerJar, int numJars, int maxPerBox)
	{
		int totalLb = (lbPerJar*16+ozPerJar)*numJars/16 + 1;
		int numBox = numJars/maxPerBox +1;
		
		return totalLb * costPerPound + numBox * costPerBox;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(totalCost(2, 5, 15, 8));

	}

}
