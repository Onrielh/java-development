package com.plurasight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    // Home:visitor|homescore:visitorscore
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the game score?");
        String input = scanner.nextLine();
        String[] score = input.split("[:|]");
        String home = score[0];
        String visitor = score[1];
        int homeScore = Integer.parseInt(score[2]);
        int visitorScore = Integer.parseInt(score[3]);
        if (homeScore > visitorScore) {
            System.out.println(" The Winner is:" + home);
        }
        if (visitorScore > homeScore) {
            System.out.println("The Winner is:" + visitor);}
            if ( visitorScore == homeScore) {
                System.out.println("Tie");
            }


        }

    }
