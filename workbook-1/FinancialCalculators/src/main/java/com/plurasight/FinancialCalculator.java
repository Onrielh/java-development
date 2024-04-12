package com.plurasight;

import java.util.Scanner;

public class FinancialCalculator {
    //asking user which calculator they want to use
    public static void main(String[] args) {
        // newscanner
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

// mortgageCalculator
    public static void mortgageCalculator () {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your Principal ?");
        double principal = scanner.nextDouble();
        // Interest Rate
        System.out.print("What is your Interest Rate?");
        double interest = scanner.nextDouble();
        // Loan Length
        System.out.print("What is the Length of your Loan?");
        // defining variables and creating an equation
        double time = scanner.nextDouble();
        double monthlyinterest = interest/1200;
        double payments = time * 12;
        double mortgage = principal*(monthlyinterest*Math.pow(1+monthlyinterest,payments))/(Math.pow(1+monthlyinterest,payments)-1);
        double totalLoan = payments*mortgage;
        double totalInterest = totalLoan -principal;
        System.out.printf("A $" + String.format("%.2f",principal) + " loan at "  + String.format("%.2f",interest) + " interest for " + time
        + " years would have a " + String.format("%.2f",mortgage) + "/mo payment with a total interest of $" + String.format("%.2f",totalInterest) + " .");

    }
// Present value calculator
        private static void presentValueCalculator () {
        Scanner scanner = new Scanner(System.in);
            System.out.print("What is your deposit?");
            double deposit = scanner.nextDouble();
            System.out.print("What is your Interest Rate?");
            double interest2 = scanner.nextDouble();
            System.out.print("What is the number of years?");
            double years = scanner.nextDouble();
            double interestrate2 = interest2/100;
            double cdValue = deposit*Math.pow(1+interestrate2 /365,(365*years));
            double totalinterest= cdValue - deposit;
            System.out.println(" Your future earned value is "+ String.format("%.2f", cdValue) + " and you would have earned "
            + String.format("%.2f",totalinterest) + " in interest.");
    }


        public static void futureValueCalculator () {
        
    }


        // create a scanner

        // Principal value
    }













