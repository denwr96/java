package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl3.task9;

import java.util.Scanner;

public class ThreeSequence {
    public static void main(String[] args) {
        System.out.println("CHECK IF NUMBERS ARE INCREASING OR DECREASING!");
        Scanner scanner = new Scanner(System.in);

        //Scanner takes input numbers
        System.out.print("First number: ");
        int first = scanner.nextInt();
        System.out.print("Second number: ");
        int second = scanner.nextInt();
        System.out.print("Third number: ");
        int third = scanner.nextInt();

        //Checks if order of input numbers is increasing, decreasing or random, prints message
        if (first > second && second > third) {
            System.out.println("Decreasing order");
        } else if (first < second && second < third) {
            System.out.println("Increasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }




    }
}

