package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_3.task_10;

//Task_10

import java.util.Scanner;

public class TheBiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("The second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("The third number: ");
        int numberThree = scanner.nextInt();

        if ((numberOne > numberTwo) && (numberOne > numberThree)) {
            System.out.println(numberOne);
        } else if ((numberTwo > numberOne) && (numberTwo > numberThree)) {
            System.out.println(numberTwo);
        } else {
            System.out.println(numberThree);
        }
    }
}
