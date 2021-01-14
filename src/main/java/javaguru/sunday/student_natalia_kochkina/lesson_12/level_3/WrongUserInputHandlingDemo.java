package javaguru.sunday.student_natalia_kochkina.lesson_12.level_3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your number:");
            int number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("It is not a number! Please try again!");
        }

    }
}
