package com.pluralsight;

public class Format {
    public static void main(String[] args) {

        System.out.println(formatName("Rory", "Smith"));

        // bonus
        String fullName = formatName("Leslie", "Brown");
        System.out.println("Full name is: " + fullName);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}
