public class MathApp {
    public static void main(String[]args){
        //Question 1: Create two variables to represent the salary for Bob and Gary
        // declare variables here: bobsalary, garysalary, highestsalary
        // then code solution
        // then use System.out.println() to display results
        // ex. System.out.println ("The answer is" + answer

        // REPEAT FOR NEXT EXERCISE
        Integer bobsalary = 50000;
        Integer garysalary = 75000;
        Integer HighestSalary = Math.max(bobsalary,garysalary);
        System.out.println("The Highest Salary is"+" "+ HighestSalary);
        // Question 2:
        Integer carprice = 16000;
        Integer truckprice = 25000;
        Integer smallest = Math.min(carprice,truckprice);
        System.out.println("The smallest value is " + " "+ smallest);
        // Question 3
       double radius = 7.25;
       double Area = (Math.PI)*(radius*radius);
        System.out.println("The Area of the Circle is"+ " "+ Area);

        //Question 4
        double variable = 5.0;
        double squareroot;
        squareroot = Math.sqrt(variable);
        System.out.println("The Square Root is" + " " + squareroot);
        // Question 5
        double x1=5;
        double x2= 85;
        double y1= 10;
        double y2 = 50;
        double distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("The Distance"+ " " + distance);


        // Question 6
       double variable2 = -3.8;
       double AbsoluteValue = Math.abs(variable2);
        System.out.println("The Absolute value is"+ " " + AbsoluteValue);

        // Question 7
        double Randomnumber;
        Randomnumber = Math.random();
        System.out.println("The Random number is"+ " " + Randomnumber);






    }
}