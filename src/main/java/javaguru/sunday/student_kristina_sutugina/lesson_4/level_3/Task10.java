package main.java.javaguru.sunday.student_kristina_sutugina.lesson_4.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

//Task_10
@CodeReview(approved = true)
@CodeReviewComment(comment = "Очень сложно с условиями. ")
class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int number = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите число 3: ");
        int number3 = scanner.nextInt();

        if (number > number2 && number > number3) {
            System.out.println(number);
        } else if (number2 > number && number2 > number3) {
            System.out.println(number2);
        } else if (number3 > number && number3 > number2) {
            System.out.println(number3);
        } else if ((number == number2 && number > number3) || (number == number3 && number > number2)) {
            System.out.println(number);
        } else if (number2 == number3 && number2 > number) {
            System.out.println(number2);
        } else {
            System.out.println("All are equal");
        }
    }
}