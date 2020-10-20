package main.java.javaguru.sunday.student_kristina_sutugina.lesson_2.level_1;

import java.util.Scanner;

//Task_2
class CalculatorTask2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide the first number: ");
        double firstNumber = scanner.nextInt();
        System.out.println("Please, provide the second number: ");
        double secondNumber = scanner.nextInt();
        double sum = firstNumber+secondNumber;
        System.out.println("Sum: "+sum);

        double sub = firstNumber-secondNumber;
        System.out.println("Subtraction: "+sub);

        double multiply = firstNumber*secondNumber;
        System.out.println("Multiply: "+multiply);

        double div = firstNumber/secondNumber;
        System.out.println("Division: "+div);
    }
}
