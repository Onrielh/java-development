package com.plurasight;

public class PracticeOperations {
    public static void main(String args[]) {
        String word1 = "Happy";
        String word2 = "Early";
        String word3 = "Birthday";
        String greeting;
        greeting = word1 + " " + word2 + " " + word3;
        System.out.println(greeting);
        double firstvalue = 5.23456;
        double secondvalue = 1.05334;
        double thirdvalue = .05855;
        double result = firstvalue + secondvalue + thirdvalue;
        System.out.println(result);
        result = firstvalue - secondvalue - thirdvalue;
        System.out.println(result);
        result = firstvalue * secondvalue * thirdvalue;
        System.out.println(result);
       // Division
        result = firstvalue / secondvalue / thirdvalue;
        double accumulation = result + 10;
        System.out.println(accumulation);
        accumulation = accumulation + 100;
        System.out.println(accumulation);
        accumulation = accumulation + 1000;
        System.out.println(accumulation);
                

    }
}
