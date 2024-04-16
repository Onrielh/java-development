package com.plurasight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        // new scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your name!");
        // defining variables
        System.out.print("First Name:");
        String firstName = scanner.nextLine();
        firstName = firstName.trim();
        System.out.print("Middle Name:");
        String middleName = scanner.nextLine();
        middleName = middleName.trim();
        System.out.print("Last Name:");
        String lastName = scanner.nextLine();
        lastName = lastName.trim();
        System.out.print("Suffix:");
        String suffix = scanner.nextLine();
        suffix = suffix.trim();
        String fullName = (firstName + " " + middleName + " " + lastName + "," + suffix);
        System.out.println(fullName);
        // if statements for missing name components
        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName;

        }
        if (!(suffix.isEmpty())) {
            fullName = fullName + ", " + suffix;

        }
    }
}
