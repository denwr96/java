package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_9;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Input a number: ");
        int Number = Scanner.nextInt();

        byte one = 1;
        byte two = 2;
        byte three = 3;
        byte four = 4;
        byte five = 5;
        byte six = 6;
        byte seven = 7;
        byte eigth = 8;
        byte nine = 9;
        byte ten = 10;

        int mult1 = Number * one;
        System.out.println(Number + "x" + one + "=" + mult1);

        int mult2 = Number * two;
        System.out.println(Number + "x" + two + "=" + mult1);

        int mult3 = Number * three;
        System.out.println(Number + "x" + three + "=" + mult3);

        int mult4 = Number * four;
        System.out.println(Number + "x" + four + "=" + mult4);

        int mult5 = Number * five;
        System.out.println(Number + "x" + five + "=" + mult5);

        int mult6 = Number * six;
        System.out.println(Number + "x" + six + "=" + mult6);

        int mult7 = Number * seven;
        System.out.println(Number + "x" + seven + "=" + mult7);

        int mult8 = Number * eigth;
        System.out.println(Number + "x" + eigth + "=" + mult8);

        int mult9 = Number * nine;
        System.out.println(Number + "x" + nine + "=" + mult9);

        int mult10 = Number * ten;
        System.out.println(Number + "x" + ten + "=" + mult10);

    }
}
