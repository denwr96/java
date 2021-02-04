package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_3;

// Task 19

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer (string for wrong input test)");

        try {
            int userInput = scanner.nextInt();
        } catch(Exception e) {
            System.out.println("InputMismatchException");
        }
    }
}
