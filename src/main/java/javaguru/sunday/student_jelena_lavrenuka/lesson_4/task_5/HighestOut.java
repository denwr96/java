package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_5;

import java.util.Scanner;

class HighestOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integer numbers");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if (numberOne == numberTwo) {
            System.out.println("Numbers are equal");
        } else if (numberOne > numberTwo) {
            System.out.println("Highest number " + numberOne);
        } else {
            System.out.println("Highest number " + numberTwo);
        }
    }
}
