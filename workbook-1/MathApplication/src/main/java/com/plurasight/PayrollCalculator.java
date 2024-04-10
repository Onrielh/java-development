package com.plurasight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[]args) {
        // create scanner
        Scanner scanner= new Scanner(System.in);
                //Enter name
        System.out.print("What is your name?");
        String name= scanner.next();
        // Hours worked
        System.out.print("How many hours did you work?");
        float hours=scanner.nextFloat();
        //pay rate
        System.out.print("What is your pay rate?");
        float rate=scanner.nextFloat();
        // Gross pay
        float result = rate*hours;
        System.out.printf(name +" "+"Your Gross Pay is: $ %.2f",result);

    }
}
