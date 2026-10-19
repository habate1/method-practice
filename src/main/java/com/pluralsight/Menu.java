package com.pluralsight;

public class Menu {
    public static void main(String[] args) {

        displayMenu();
        displayMenu();
    }

    public static void displayMenu(){
        System.out.println("=== MENU ===\n" +
                "\n" +
                "1. Coffee - $3.99\n" +
                "\n" +
                "2. Tea - $2.99\n" +
                "\n" +
                "3. Cookie - $1.99");
    }
}
