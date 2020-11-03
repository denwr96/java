package main.java.javaguru.sunday.student_liana_shirmane.lesson_4.level_1;
//task1
//task2
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Number {
    public static void main(String[] args) {
        System.out.println("Please, enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number == 0) {
            System.out.println("Number is 0");
        } else {
            System.out.println("Number is negative");
        }
    }
}
