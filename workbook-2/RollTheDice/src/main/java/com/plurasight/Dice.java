package com.plurasight;
// This is a code to randomly roll two dice and output the results while counting the amount of times 2,4,6,7 are rolled
public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;
        int twocounter = 0;
        int fourcounter = 0;
        int sixcounter = 0;
        int sevencounter = 0;
        int sum=0;
        int count=0;
        while(count<100) {
            count++;
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.println("Roll " + (count) + " " + roll1 + " - " + roll2 + " Sum " + sum);

            if (sum == 2) {
                twocounter++;
            } else if (sum == 4) {
                fourcounter++;
            } else if (sum == 6) {
                sixcounter++;
            } else if (sum == 7) {
                sevencounter++;
            }
        }//endofloop
        System.out.println("Two counter " + twocounter);
        System.out.println("Four Counter " + fourcounter);
        System.out.println("Six Counter "+ sixcounter);
        System.out.println("Seven Counter "+ sevencounter);
    }



        public int roll () {
            int randomNumber = (int)(Math.random()*6)+1;
            return randomNumber;
        }
    }

