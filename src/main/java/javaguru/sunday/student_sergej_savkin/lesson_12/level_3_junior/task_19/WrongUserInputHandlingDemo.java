package javaguru.sunday.student_sergej_savkin.lesson_12.level_3_junior.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter whole number");
            try {
                int wholeNumber;
                wholeNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, try again");
            } finally {
                System.out.println("Please enter again");
            }
        }
    }
}


