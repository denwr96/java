package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl1.task1;
import java.util.Scanner;

public class PositOrNegat {
    public static void main(String[] args) {
        System.out.print("Input integer: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber > 0) {
            System.out.println("Number is positive + ");
        } else if (inputNumber < 0) {
            System.out.println("Number is negative - ");
        }
    }
}
