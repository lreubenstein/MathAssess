package com.company;

public class TestQuestions {

	public static final int SQFEETPERGAL = 500;
	public static final int JARSPERBOX = 16;
	public static final int CANDYPERBAG = 24;
	public static final double CMPERINCH = 2.54;
	public static final int INCHESPERFEET = 12;
	public static final int MAXWEIGHTPERBOX = 67;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y=4, z=2;
		x+=y;
		z+=x;
		z++;	
		System.out.println(x + " " + y + " " + z);
		
		int a=3,b=4,c=5;
		System.out.println(a + b*c/a);
		System.out.println(a%b + c*a/b);
		
		int d=7, e=2;
		double f = 3.0;
		double t = d/e*f;
		System.out.println(t);
		
		d=5; e=4;
		f = d/e;
		System.out.println(f);
		
		double g = 3.0, h = 6.0, j = 4.5;
		double k = j * 2 + h / g * (g - 1);
		System.out.println(k);
		
		int m = 256;
		int n = m%10*100 + m%100/10*10 + m/100;
		System.out.println(n);
		
		int p = ((int)(Math.random() * 10) + 5) * 2;
		int q = ((int)(Math.random() * 10) * 2) + 10;
		int r = ((int)(Math.random()*20 + 10))/2*2;
		int s = ((int)(Math.random()*20/2)+10);
		System.out.println(p + " " + q + " " + r + " " +s);
		
		System.out.println("640 sg ft needs " + numGallons(640));
		System.out.println("2190 sg ft needs " + numGallons(2190));
		System.out.println("450 sg ft needs " + numGallons(450));
		
		System.out.println("17 jars leaves " + leftoverJars(17) + " jars.");
		System.out.println("8 jars leaves " + leftoverJars(8) + " jars.");
		System.out.println("34 jars leaves " + leftoverJars(34) + " jars.");
		
		System.out.println("1234 becomes " + encrypt(1234));
		System.out.println("2795 becomes " + encrypt(2795));
		System.out.println("9946 becomes " + encrypt(9946));
		
		System.out.println("1234 becomes " + encrypt2(1234));
		System.out.println("2795 becomes " + encrypt2(2795));
		System.out.println("9946 becomes " + encrypt2(9946));
		
		System.out.println("I need " + candybags(100) + " bags for 100 kids.");
		System.out.println("I need " + candybags(150) + " bags for 150 kids.");
		System.out.println("I need " + candybags(70) + " bags for 70 kids.");
		
		System.out.println("3x5 boxes in 10x22 crate " + howManyFit(3,5,10,22) );
		System.out.println("5x3 boxes in 10x22 crate " + howManyFit(5,3,10,22) );
		System.out.println("8x5 boxes in 10x22 crate " + howManyFit(8,5,10,22) );

		System.out.println("8 lb books fit " + booksperbox(8));
		System.out.println("8 lb books and 1 lb pencils fit " + howManyPencils(8,1));
		System.out.println("7 lb books fit " + booksperbox(7));
		System.out.println("7 lb books and 2 lb pencils fit " + howManyPencils(7,2));

	}
	public static int booksperbox(int lbs){
		int books = MAXWEIGHTPERBOX/lbs;
		return books;
	}

	public static int howManyPencils(int bookweight, int pencilweight){
		int wtleft = MAXWEIGHTPERBOX%bookweight;
		int numpencils = wtleft/pencilweight;
		return numpencils;
	}



	public static int numGallons(int sqFeet){
		int gallons = sqFeet/SQFEETPERGAL + 1;
		return gallons;
	}
	
	public static int leftoverJars(int jars){
		return jars%JARSPERBOX;
	}
	
	public static int candybags(int kids) {
		return kids*2/CANDYPERBAG +1;
	}
	
	public static int leftovercandy(int kids, int bags) {
		return kids*2%(CANDYPERBAG*bags);
	}
	public static int encrypt(int n) {
		// for each digit, add 7 and take the remainder when divided by 10
		int a = n/1000*7%10;
		int b = n%1000/100*7%10;
		int c = n%100/10*7%10;
		int d = n%10*7%10;
		
		return a*1000 + b * 100 + c * 10 + d;
	}
	public static int encrypt2(int n) {
		// for each digit, add 7 and take the remainder when divided by 10
		int a = n/1000*7%10;
		int b = n/100%10*7%10;
		int c = n/10%10*7%10;
		int d = n%10*7%10;
		
		return a*1000 + b * 100 + c * 10 + d;
	}
	
	public static int howManyFit(int lenbox, int widbox, int lencrate, int widcrate) {
		return (lencrate/lenbox) * (widcrate/widbox);
	}

	public static void convertToMetric(int feet, int inches){
		int totalinches = feet*INCHESPERFEET + inches;
		double totalcm = totalinches*CMPERINCH;
	}


}
