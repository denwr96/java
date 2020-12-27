package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_1.task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task2 {

    public static void main(String[] args) {

        System.out.println("Enter integer: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput > 0) {
            System.out.println(userInput + " - is a positive integer.");
        }
        else if (userInput < 0) {
            System.out.println(userInput + " - is a negative integer.");
        }
        else {
            System.out.println(userInput + " - is a zero.");
        }
    }
}
