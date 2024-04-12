package com.plurasight;

import java.util.Scanner;

public class PayrollCalculator2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // create scanner

        //Enter name
        System.out.print("What is your name?");
        String name= scanner.next();

        doMultiply();
    }

        public static void doMultiply() {
            System.out.print("How many hours did you work?");
            float hours = scanner.nextFloat();
            System.out.print("What is your pay rate?");
            float rate = scanner.nextFloat();
            float result = rate * hours;
            System.out.printf(" " + "Your Gross Pay is: $ %.2f", result);
        }
    }





