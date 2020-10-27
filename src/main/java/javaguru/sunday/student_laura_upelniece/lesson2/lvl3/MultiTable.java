package main.java.javaguru.sunday.student_laura_upelniece.lesson2.lvl3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class MultiTable {
    public static void main(String[] args) {

        //Adds new Scanner and prints input message
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input: ");
        int number = input.nextInt();

        //Prints multiplication table for given number
        System.out.println("Multiplication table of number " + number);
        System.out.println(number + " * 1" + " = " + (number * 1));
        System.out.println(number + " * 2" + " = " + (number * 2));
        System.out.println(number + " * 3" + " = " + (number * 3));
        System.out.println(number + " * 4" + " = " + (number * 4));
        System.out.println(number + " * 5" + " = " + (number * 5));
        System.out.println(number + " * 6" + " = " + (number * 6));
        System.out.println(number + " * 7" + " = " + (number * 7));
        System.out.println(number + " * 8" + " = " + (number * 8));
        System.out.println(number + " * 9" + " = " + (number * 9));
        System.out.println(number + " * 10" + " = " + (number * 10));

    }
}
