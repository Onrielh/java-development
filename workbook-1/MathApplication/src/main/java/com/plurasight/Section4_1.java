package com.plurasight;

import java.util.Scanner;

public class Section4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Yearup Imax");
        System.out.print("Please enter your age so we can determine your ticket price: ");
        int age = input.nextInt();

        double price = 0;
        if (age <= 10) {
            price = 5.00;
        } else if (age < 18) {
            price = 10.00;
        } else if (age <= 50) {
            price = 20.00;
        } else {
            price = 15.00;
        }
        System.out.println("Price of Admission:" + price);
    }
}


