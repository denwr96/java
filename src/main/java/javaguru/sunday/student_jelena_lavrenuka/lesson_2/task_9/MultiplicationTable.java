package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_9;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Input a number: ");
        int number = Scanner.nextInt();

    //    byte one = 1;
    //    byte two = 2;
    //    byte three = 3;
    //    byte four = 4;
    //    byte five = 5;
    //    byte six = 6;
    //    byte seven = 7;
    //    byte eight = 8;
    //    byte nine = 9;
    //    byte ten = 10;

        int mult1 = number * 1;
        System.out.println(number + "x" + "1" + "=" + mult1);

        int mult2 = number * 2;
        System.out.println(number + "x" + "2" + "=" + mult2);

        int mult3 = number * 3;
        System.out.println(number + "x" + "3" + "=" + mult3);

        int mult4 = number * 4;
        System.out.println(number + "x" + "4" + "=" + mult4);

        int mult5 = number * 5;
        System.out.println(number + "x" + "5" + "=" + mult5);

        int mult6 = number * 6;
        System.out.println(number + "x" + "6" + "=" + mult6);

        int mult7 = number * 7;
        System.out.println(number + "x" + "7" + "=" + mult7);

        int mult8 = number * 8;
        System.out.println(number + "x" + "8" + "=" + mult8);

        int mult9 = number * 9;
        System.out.println(number + "x" + "9" + "=" + mult9);

        int mult10 = number * 10;
        System.out.println(number + "x" + "10" + "=" + mult10);

    }
}
