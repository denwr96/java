package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_2.Task_9;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int line2 = number * 2;
        int line3 = number * 3;
        int line4 = number * 4;
        int line5 = number * 5;
        int line6 = number * 6;
        int line7 = number * 7;
        int line8 = number * 8;
        int line9 = number * 9;
        int line10 = number * 10;
        System.out.println(number + " * 1 = " + number);
        System.out.println(number + " * 2 = " + line2);
        System.out.println(number + " * 3 = " + line3);
        System.out.println(number + " * 4 = " + line4);
        System.out.println(number + " * 5 = " + line5);
        System.out.println(number + " * 6 = " + line6);
        System.out.println(number + " * 7 = " + line7);
        System.out.println(number + " * 8 = " + line8);
        System.out.println(number + " * 9 = " + line9);
        System.out.println(number + " * 10 = " + line10);
    }
}
