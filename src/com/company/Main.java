package com.company;

public class Main {

    public static void Mary(){
        System.out.println("Lady Mary Talbot");
    }

    public static void Edith(){
        System.out.println("Lady Edith Pelham");
        Sybil();
        Mary();
    }

    public static void Sybil(){
        Mary();
        System.out.println("Sybil Branson RIP");
    }

    public static void main(String[] args) {
	// write your code here
        Mary();
        Edith();
        Sybil();
        Edith();
    }
}
