package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_3;

// Task 19

import java.util.Scanner;

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
