package javaguru.sunday.student_liana_shirmane.lesson_12.level_3;
//task19

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String args[])
    {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number");
            int number = scanner.nextInt();
            System.out.println("Your number is " + number);
        } catch(InputMismatchException e) {
            System.out.println("It is not number");
        }
    }
}
