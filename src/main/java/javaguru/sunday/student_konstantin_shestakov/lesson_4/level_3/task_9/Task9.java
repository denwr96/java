package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_3.task_9;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter third number: ");
        double thirdNumber = scanner.nextDouble();


        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("All numbers are increasing");
        }
        else if (firstNumber > secondNumber && secondNumber > thirdNumber){
            System.out.println("All numbers are decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
