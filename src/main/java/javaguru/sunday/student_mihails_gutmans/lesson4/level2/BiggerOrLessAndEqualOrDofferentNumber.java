package javaguru.sunday.student_mihails_gutmans.lesson4.level2;

import java.util.Scanner;

public class BiggerOrLessAndEqualOrDofferentNumber {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers");

        Scanner enterNumberOne = new Scanner(System.in);
        int consoleNumberOne = enterNumberOne.nextInt();

        Scanner enterNumberTwo = new Scanner(System.in);
        int consoleNumberTwo = enterNumberTwo.nextInt();

        if (consoleNumberOne>consoleNumberTwo){
            System.out.println("Bigger number is :" + consoleNumberOne);
            System.out.println("Less number is :" + consoleNumberTwo);
        }else {
            System.out.println("Bigger number is :" + consoleNumberTwo);
            System.out.println("Less number is :" + consoleNumberOne);
        }

        if (consoleNumberOne==consoleNumberTwo){
            System.out.println("Numbers are equal");
        }else {
            System.out.println("Numbers are different");
        }

    }
}
