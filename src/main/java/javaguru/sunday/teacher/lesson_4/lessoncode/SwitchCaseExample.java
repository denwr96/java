package javaguru.sunday.teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int userInput = scanner.nextInt();
            String stringInput = "One";

            switch (stringInput) {
                case "One":
                    System.out.println("Your input is 1");
                    break;
                case "Two":
                    System.out.println("Your input is 2");
                    break;
                case "Three":
                    System.out.println("Your input is 3");
                    break;
                default:
                    System.out.println("Unknown input");
            }
        }
    }
}
