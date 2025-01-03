package com.example;

public class Main {

    /**
     * Simulates a login process by validating the username and password.
     * 
     * @param username the username entered
     * @param password the password entered
     * @return true if the credentials are valid, false otherwise
     */
    public static boolean login(String username, String password) {
        // Mock validation logic
        return "student".equals(username) && "Password123".equals(password);
    }

    public static void main(String[] args) {
        System.out.println("Main application logic here.");
    }
}

// package com.example;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello world!");
//     }
// }
