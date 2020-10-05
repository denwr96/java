package main.java.javaguru.sunday.student_natalia_kochkina.lesson2.level3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        System.out.println(number + " x 1 = " + number);
        int result = number * 2;
        System.out.println(number + " x 2 = " + result);
        result = number * 3;
        System.out.println(number + " x 3 = " + result);
        result = number * 4;
        System.out.println(number + " x 4 = " + result);
        result = number * 5;
        System.out.println(number + " x 5 = " + result);
        result = number * 6;
        System.out.println(number + " x 6 = " + result);
        result = number * 7;
        System.out.println(number + " x 7 = " + result);
        result = number * 8;
        System.out.println(number + " x 8 = " + result);
        result = number * 9;
        System.out.println(number + " x 9 = " + result);
        result = number * 10;
        System.out.println(number + " x 10 = " + result);
    }
}
