package com.pluralsight;


public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println("2 is even: " + IsEven(2));
        System.out.println("-2 is positive: " + IsPositive(-2));

    }

    public static boolean IsEven(int number) {

        return number % 2 == 0;
    }

    public static boolean IsPositive(double number) {

        return number > 0;
    }
}
