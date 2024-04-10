package com.plurasight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[]args){
    // create scanner
    Scanner scanner = new Scanner(System.in);
    //First number
        System.out.print("Enter the first number:");
        int num1 = scanner.nextInt();
        // second number
        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please select which calculation you would like to take");
        System.out.println(" Enter A to Add");
        System.out.println(" Enter S to subtract");
        System.out.println(" Enter M to Multiply");
        System.out.println(" Enter D to Divide");
        String action = scanner.nextLine();
        System.out.println("Preparing to do math");
        int result=0;
        if (action.equals("A")) {
            result = num1 + num2;
        } else if (action.equals("S")){
            result= num1-num2;
        } else if (action.equals("M")) {
            result=num1*num2;
        } else if (action.equals("D")) {
            result=num1/num2;
        }
        System.out.println("Your Answer is:" + " " + result);

    }
}
