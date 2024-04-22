package com.plurasight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Quote[] quotes = new Quote[10];
        quoteInventory(quotes);
        quoteHome(quotes);
        anotherQuote(quotes);
    }

    // Inventory method to hold the array of quotes
    public static void quoteInventory(Quote[] quotes) {
        Scanner scanner = new Scanner(System.in);

        quotes[0] = new Quote(1, "\"You must be the change you wish to see in the world.\" – Mahatma Gandhi\n");
        quotes[1] = new Quote(2, "\"Spread love everywhere you go. Let no one ever come to you without leaving happier\". – Mother Teresa\n");
        quotes[2] = new Quote(3, "\"The only thing we have to fear is fear itself.\" – Franklin D. Roosevelt\n");
        quotes[3] = new Quote(4, "\"Darkness cannot drive out darkness; only light can do that. Hate cannot drive out hate: only love can do that.\" -Martin Luther King Jr.\n");
        quotes[4] = new Quote(5, "\"Do one thing every day that scares you.\" – Eleanor Roosevelt");
        quotes[5] = new Quote(6, "\"The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.\" – Helen Keller\n");
        quotes[6] = new Quote(7, "\"It is during our darkest moments that we must focus to see the light.\" – Aristotle\n");
        quotes[7] = new Quote(8, "\"Do not go where the path may lead; go instead where there is no path and leave a trail.\" – Ralph Waldo Emerson\n");
        quotes[8] = new Quote(9, "\"Be yourself; everyone else is already taken.\" – Oscar Wilde\n");
        quotes[9] = new Quote(10, "\"Well done is better than well said.” – Benjamin Franklin\n");
    }

    //  method to return user to home screen asking to choose a quote
    public static String quoteHome(Quote[] quotes) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Select a quote by entering a number 1-10!");
            int selection = scanner.nextInt();
            selection = selection - 1;
            System.out.println("Your quote is" + " " + quotes[selection].getQuoteText());
            // catch(Exception ){
            //System.out.println("Your number was out of range,");
            // e.printStackTrace();}
            anotherQuote(quotes);
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter a digit in the given range");
            int selection = scanner.nextInt();
            e.printStackTrace();
            selection = selection - 1;
            System.out.println("Your quote is" + " " + quotes[selection].getQuoteText());
            // catch(Exception ){
            //System.out.println("Your number was out of range,");
            // e.printStackTrace();}
            anotherQuote(quotes);
        }

        return null;
    }
    private static void anotherQuote(Quote[] quotes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see another quote, select (Y) for yes and (N) for no");
        String choice = scanner.nextLine();
        switch (choice) {
            case "Y":
                quoteHome(quotes);
                break;
            case "N":
                System.out.println("Thank you, have a nice day!");
                break;
        }
    }
}


