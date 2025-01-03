package com.example;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println("Addition Result: " + add(5, 3));
        System.out.println(greet("World"));
    }
}
