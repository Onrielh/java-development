package com.plurasight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String input = scanner.nextLine();
        String[] name = input.split(" ");

        if (name.length == 2) {
            System.out.println("First Name:" + " " + name[0]);
            System.out.println("Middle Name: (none)");
            System.out.println("Last Name:" + " " + name[1]);
        } else {
            System.out.println("First Name:" + " " + name[0]);
             System.out.println("Middle Name:" + " " + name[1]);
            System.out.println("Last Name:" + " " + name[2]);}
    }
}
