package javaguru.sunday.student_deniss_lobacs.lesson_12.level_3_junior;

import java.util.Scanner;
// task19
public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your number.. ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please input valid number.. ");
            scanner.next();
        }
    }
}
