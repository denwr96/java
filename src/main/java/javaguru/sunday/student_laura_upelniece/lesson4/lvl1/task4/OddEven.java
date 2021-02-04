package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl1.task4;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Check whether number is odd or even: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
