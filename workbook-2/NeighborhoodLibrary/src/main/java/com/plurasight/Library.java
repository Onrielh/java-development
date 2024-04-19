package com.plurasight;

import java.util.Scanner;

public class Library {
    public static void main(String[]args) {
        Book[]books= new Book[20];

        Scanner scanner = new Scanner(System.in);
        books[0] = new Book(1,"10500","Hunger Games", false,"");
        books[1] = new Book(2,"10501","Away",false,"");
        books[2] = new Book(3,"10502","Spirited Away", false, "");
        books[3] = new Book(4,"10503","Maximus Ride", false, "");
        books[4] = new Book(5,"10504","Eclipse", false,"");
        books[5] = new Book(6,"10505","Little People",false,"");
        books[6] = new Book(7,"10506","Attack on Titans", true, "Timmy");
        books[7] = new Book(8,"10507","My Hero Academia", false, "");
        books[8] = new Book(9,"10508","FullMetal Alchemist", false,"");
        books[9] = new Book(10,"10509","Black Butler",true,"Rafael");
        books[10] = new Book(11,"10510","Sailor Moon", false, "");
        books[11] = new Book(12,"10511","Bleach", false, "");
        books[12] = new Book(13,"10512","Hunter x Hunter", false,"");
        books[13] = new Book(14,"10513","Haikyui",true,"Onriel");
        books[14] = new Book(15,"10514","Macbeth", true, "Acton");
        books[15] = new Book(16,"10515","Romeo and Juliet", true, "Charles");
        books[16] = new Book(17,"10516","Hunger Games", false,"");
        books[17] = new Book(18,"10517","Mean Girls",true,"Maddie");
        books[18] = new Book(19,"10518","The Bible", false, "");
        books[19] = new Book(20,"10519","The Da Vinci Code", false, "");

        // get user choices
        System.out.println("Welcome to the Neighborhood Library!");
        System.out.println("Please make a selection");
        System.out.println("Please type 1 to see Available books, 2 to see checkout books or 3 to return to home screen");
        System.out.println("Selection:");
       int selection = scanner.nextInt();
       switch(selection){
           case 1: showAvailable(books);
           break;
           case 2: showCheckedOut(books);
           break;
           case 3: backHome();
           break;
       }
    }
    public static void showAvailable(Book[] books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("These are the Available books");
        for (Book book : books)
        if (book.getIsCheckedOut() == false) {
            System.out.println(book);
    }
        System.out.println("Select 1 to check out a book, select 2 to go back to the home screen?");
        int selection= scanner.nextInt();
        if (selection ==1){
            System.out.println("Please enter your name");
            String name = scanner.nextLine();
            System.out.println("Provide the id of the book you wish to checkout");
            int id = scanner.nextInt();
        }
    }
    public static void backHome() {
    }

    public static void showCheckedOut( Book[] books) {
        for (Book book : books) {
            if (book.getIsCheckedOut() == true) {
                System.out.println(book);
            }
        }

                }


        }