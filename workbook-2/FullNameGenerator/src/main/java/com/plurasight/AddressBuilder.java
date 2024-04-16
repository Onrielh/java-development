package com.plurasight;

import java.util.Scanner;

public class AddressBuilder {
    public static void  main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Full name:");
        // Billing Information
        String fullName = scanner.nextLine();
        System.out.println("Please enter your Billing Address: ");
        System.out.println("Billing Street: ");
        String billingStreet= scanner.nextLine();
        System.out.println("Billing City: ");
        String billingCity= scanner.nextLine();
        System.out.println("Billing State: ");
        String billingState= scanner.nextLine();
        System.out.println("Billing Zip: ");
        String billingZip= scanner.nextLine();
        // Shipping Address
        System.out.println("Please enter your Shipping Address");
        System.out.println("Shipping Street: ");
        String shippingStreet= scanner.nextLine();
        System.out.println("Shipping City: ");
        String shippingCity= scanner.nextLine();
        System.out.println("Shipping State: ");
        String shippingState= scanner.nextLine();
        System.out.println("Shipping Zip: ");
        String shippingZip= scanner.nextLine();

        // create a stringbuilder object for billing
        StringBuilder address = new StringBuilder();
        address.append(billingStreet +"\n");
        address.append(billingCity + ",");
        address.append(billingState + " ");
        address.append(billingZip );

        //string builder for shipping address
        StringBuilder address2= new StringBuilder();
        address2.append(shippingStreet + "\n");
        address2.append(shippingCity + ",");
        address2.append(shippingState + " ");
        address2.append(shippingZip);
        String billingAddress = address.toString();
        String shippingAddress = address2.toString();
        System.out.print("Full name: " + fullName + "\n");
        System.out.println("Billing Address: " + "\n" + billingAddress +"\n");
        System.out.println("Shipping Address: " + "\n" + shippingAddress);
    }
}
