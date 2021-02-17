package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl1.task2;
import java.util.Scanner;

public class PositNegatZero {
    public static void main(String[] args) {
        System.out.print("Input integer: ");
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();

        if (inputInt > 0) {
            System.out.println("Number is positive + ");
        } else if (inputInt < 0) {
            System.out.println("Number is negative - ");
        } else {
            System.out.println("It is number zero 0");
        }

    }
}
