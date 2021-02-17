package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl2.task5;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        System.out.println("CHECK WHICH NUMBER IS BIGGER!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Second number: ");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo) {
            System.out.println("Biggest number is: " + numberOne);
        } else if (numberTwo > numberOne) {
            System.out.println("Biggest number is: " + numberTwo);
        } else {
            System.out.println("Numbers are the same!");
        }
    }
}
