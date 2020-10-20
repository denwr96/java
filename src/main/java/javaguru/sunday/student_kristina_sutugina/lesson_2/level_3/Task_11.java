package main.java.javaguru.sunday.student_kristina_sutugina.lesson_2.level_3;

import java.util.Scanner;

class Task_11 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
       double calculation = Double.valueOf(firstNumber+secondNumber+thirdNumber)/3;
        System.out.println(calculation);
    }
}
