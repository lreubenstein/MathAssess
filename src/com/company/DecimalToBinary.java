package com.company;

public class DecimalToBinary {

	
	public static int calcBinary(int dec)
	{
		/*
		int a = dec/8;
		int b = dec%8;
		int c = b/4;
		int d = b%4;
		int e = d/2;
		int f = d%2;
		int bin = a*1000 + c*100 + e * 10 + f;
		*/
		int a = dec/8;
		int b = dec%8/4;
		int c = dec%4/2;
		int d = dec%2;
		int bin = a*1000 + b*100 + c * 10 + d;
		return bin;
	}
	
	public static int calcDecimal(int bin)
	{
		int a = bin%10;
		int b = bin/10%10;
		int c = bin/100%10;
		int d = bin/1000;
		return d * 8 + c * 4 + b * 2 + a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calcBinary(15));
		System.out.println(calcBinary(9));
		System.out.println(calcBinary(2));
		System.out.println(calcBinary(10));
		
		System.out.println(calcDecimal(1111));
		System.out.println(calcDecimal(1001));
		System.out.println(calcDecimal(10));
		System.out.println(calcDecimal(1010));
		
		/* output
		 * 1111 1001 10 1010     
		 * 15 9 2 10 
		 */

	}

}
