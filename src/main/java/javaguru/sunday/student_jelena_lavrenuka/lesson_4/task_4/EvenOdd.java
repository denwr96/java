package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_4;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer number ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
