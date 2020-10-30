package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_9;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();
        double numberThree = scanner.nextDouble();
        if (numberTwo > numberOne && numberThree > numberTwo) {
            System.out.println("Numbers are increasing");
        } else if (numberTwo < numberOne && numberThree < numberTwo) {
            System.out.println("Numbers are decreasing");
        }else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
