package javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle;

import java.util.Scanner;

public class ExceptionExample {

    int[] myArray = {10, 20, 30, 40, 50};

    public static void main(String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type your number...");
            int userInput = scanner.nextInt();


            try {
                int result = exceptionExample.getValueFromArray(userInput);
                System.out.println("Result = " + result);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Somwthing went wrong: " + e.getMessage());
            }
        }

    }

    public int getValueFromArray(int userInput) {
        return myArray[userInput];
    }
}
