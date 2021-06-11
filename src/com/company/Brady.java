package com.company;

public class Brady {
    public static void Greg(){
        System.out.println("Groovy Greg");
    }
    public static void Marsha(){
        System.out.println("Marsha Marsha Marsha");
        Greg();
        System.out.println("Hair of gold");
    }
    public static void Jan(){
        Greg();
        System.out.println("The middle girl");
        Marsha();
    }
    public static void main(String [] args){
        Marsha();
        Greg();
        System.out.println("Somehow forms a family");
        Jan();
    }
}
