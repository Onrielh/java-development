package com.plurasight;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservations {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Name: ");
        String fullName= scanner.nextLine();
        String [] name= fullName.split(" ");
        String firstName = name [0];
        String lastName = name [1];
        System.out.println("What date will you be coming (MM/dd/yyyy");
        String comingDate = scanner.nextLine();
        DateTimeFormatter
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    }
}
