package main.java.javaguru.sunday.student_kristina_sutugina.lesson_2.level_1;

//Task_1
import java.util.Scanner;

 class CalculatorTask1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, provide the second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber+secondNumber;
        System.out.println("Sum: "+sum);

        int sub = firstNumber-secondNumber;
        System.out.println("Subtraction: "+sub);

        int multiply = firstNumber*secondNumber;
        System.out.println("Multiply: "+multiply);

        int div = firstNumber/secondNumber;
        System.out.println("Division: "+div);
    }
}
