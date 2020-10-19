package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_2_intern.task_7;

import java.util.Scanner;

class EqualOrDifferent {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        firstNumber = scanner.nextInt();
        System.out.println("PLease enter second number");
        secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
