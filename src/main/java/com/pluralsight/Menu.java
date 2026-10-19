package com.pluralsight;

public class Menu {
    public static void main(String[] args) {

        // call display Menu
        displayMenu();
        //displayMenu();
    }

    // create void method and print to screen. no return value
    public static void displayMenu(){
        // print menu options
        System.out.println("=== MENU ===\n" +
                "\n" +
                "1. Coffee - $3.99\n" +
                "\n" +
                "2. Tea - $2.99\n" +
                "\n" +
                "3. Cookie - $1.99");
    }
}
