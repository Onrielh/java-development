package com.plurasight;

import java.util.Scanner;

public class FinancialCalculator {
    //asking user which calculator they want to use
    public static void main(String[] args) {
        // newscanner
            Scanner scanner = new Scanner(System.in);
            // User selecting which calculator theyre going to use
            System.out.println("Which Calculator would you like to use?");
            System.out.println("Enter 1 for Mortgage Calculator");
            System.out.println("Enter 2 for Future Value Calculator");
            System.out.println("Enter 3 for Present Value Calculator");
            // creating if statements to call for methods
            int command = scanner.nextInt();
            if (command == 1) {
                mortgageCalculator();
            } else if (command == 2) {
                futureValueCalculator();
            } else if (command == 3) {
                presentValueCalculator();
            } else {
                System.out.println("Invalid!");
            }
        }

// mortgageCalculator
    public static void mortgageCalculator () {
        // new scanner
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
        private static void futureValueCalculator () {
        // new scanenr
        Scanner scanner = new Scanner(System.in);
            System.out.print("What is your deposit?");
            double deposit = scanner.nextDouble();
            System.out.print("What is your Interest Rate?");
            double interest2 = scanner.nextDouble();
            System.out.print("What is the number of years?");
            // defining variables and creating equation for output
            double years = scanner.nextDouble();
            double interestrate2 = interest2/100;
            double cdValue = deposit*Math.pow(1+interestrate2 /365,(365*years));
            double totalinterest= cdValue - deposit;
            System.out.println(" Your future earned value is "+ String.format("%.2f", cdValue) + " and you would have earned "
            + String.format("%.2f",totalinterest) + " in interest.");
    }

        //present value calculator
        public static void presentValueCalculator () {
        // new scanner
        Scanner scanner = new Scanner(System.in);
        // asking for user input
            System.out.println("What is your Monthly Payout?");
            double monthlyPayment = scanner.nextDouble();
            System.out.println("What is your Expected Interest rate?");
            double expectedrate = scanner.nextDouble();
            System.out.println("How many years to pay out? ");
            // defining extra variables for the annuity calculator
            double payOutYears = scanner.nextDouble();
            double payOutYears2 = payOutYears *12;
            double monthlyexpectedrate = expectedrate/1200;
            double presentValue = monthlyPayment *(1-Math.pow(1 + monthlyexpectedrate,- payOutYears2))/monthlyexpectedrate;
            System.out.printf("You would need to invest $%.2f", presentValue);

    }


        // create a scanner

        // Principal value
    }













