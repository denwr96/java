package javaguru.sunday.student_liana_shirmane.lesson_4.level_1;
//task4

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please, enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

