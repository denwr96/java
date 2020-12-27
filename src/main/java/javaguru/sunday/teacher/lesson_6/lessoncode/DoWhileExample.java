package javaguru.sunday.teacher.lesson_6.lessoncode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Enter your number");
            userInput = scanner.nextInt();
            System.out.println("Your number is:" + userInput);
            System.out.println("Enter 0 to exit");
        } while (userInput != 0);
    }
}
