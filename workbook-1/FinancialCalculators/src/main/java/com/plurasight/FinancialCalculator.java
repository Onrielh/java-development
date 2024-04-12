package com.plurasight;

import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {
        mortgageCalculator();
        futureValueCalculator();
        presentValueCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Calculator would you like to use?");
        System.out.println("Enter 1 for Mortgage Calculator");
        System.out.println("Enter 2 for Future Value Calculator");
        System.out.println("Enter 3 for Present Value Calculator");
        int command = scanner.nextInt();
        if (command == 1) {
            mortgageCalculator();
        } else if (command == 2) {
            presentValueCalculator();
        } else if (command == 3) {
            futureValueCalculator();
        } else {
            System.out.println("Invalid!");
        }
    }

    public static void mortgageCalculator () {


        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your Principal ?");
        double principal = scanner.nextInt();
        // Interest Rate
        System.out.print("What is your Interest Rate?");
        double interest = scanner.nextInt();
        // Loan Length
        System.out.print("What is the Length of your Loan?");
        int time = scanner.nextInt();

    }

        private static void presentValueCalculator () {
    }


        public static void futureValueCalculator () {
    }


        // create a scanner

        // Principal value
    }













