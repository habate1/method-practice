package com.pluralsight;


public class CompareNumbers {
    public static void main(String[] args) {
        // print statements + call methods created
        System.out.println("2 is even: " + IsEven(2));
        System.out.println("-2 is positive: " + IsPositive(-2));

    }

    // method to determine if argument passed is even
    // boolean methods to return t/f
    public static boolean IsEven(int number) {
        return number % 2 == 0;
    }
    // method to determine if argument passed is positive
    public static boolean IsPositive(double number) {

        return number > 0;
    }
}
