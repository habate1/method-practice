package com.pluralsight;

public class Hello {

    // create a main method where our code runs
    public static void main(String[] args) {
        sayHello();
        sayGoodbye();
        sayGoodMorning();
    }

    // make void methods that prints 3 different messages
    public static void sayHello() {
        System.out.println("Hello!");
    }
    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }
    public static void sayGoodMorning() {
        System.out.println("Good Morning!");
    }

}
