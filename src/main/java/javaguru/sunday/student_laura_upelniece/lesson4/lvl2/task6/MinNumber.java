package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl2.task6;
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        System.out.println("CHECK WHICH NUMBER IR SMALLER!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int inputOne = scanner.nextInt();

        System.out.print("Second number: ");
        int inputTwo = scanner.nextInt();

        if (inputOne == inputTwo) {
            System.out.println("Numbers are the same!");

        } else {
            System.out.println("Smallest number is " + Math.min(inputOne, inputTwo));
        }



    }
}
