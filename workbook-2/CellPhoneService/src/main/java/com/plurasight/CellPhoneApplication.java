package com.plurasight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[]args){
    CellPhone cp1 = new CellPhone();
       Scanner scanner = new Scanner(System.in);
        System.out.println("What is the Serial Number");
        long serialNumber= Long.parseLong(scanner.nextLine());
        cp1.setSerialNumber(serialNumber);
        System.out.println("What is the Model");
        String model =scanner.nextLine();
        cp1.setModel(model);
        System.out.println("Who is the carrier");
        String carrier=scanner.nextLine();
        cp1.setCarrier(carrier);
        System.out.println("What is the Phone Number?");
        String phoneNumber = scanner.nextLine();
        cp1.setPhoneNumber(phoneNumber);
        System.out.println("Who is the owner of the phone");
        String owner = scanner.nextLine();
        cp1.setOwner(owner);
        scanner.nextLine();
        System.out.println();
        display(cp1);
        CellPhone cp2 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
        display(cp2);

    }
   public static void display (CellPhone phone){
    System.out.println(phone.getSerialNumber());
    System.out.println(phone.getCarrier());
    System.out.println(phone.getModel());
    System.out.println(phone.getPhoneNumber());
    System.out.println(phone.getOwner());
   }
}
