package main.java.javaguru.sunday.student_sergej_savkin.lesson_2.level_1_intern.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("PLease enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("The sum of entered numbers is: " + (firstNumber + secondNumber));
        System.out.println("The difference of entered numbers is: " + (firstNumber - secondNumber));
        System.out.println("The multiplication of entered numbers is: " + (firstNumber * secondNumber));
        System.out.println("The division of entered numbers is: " + (firstNumber / secondNumber));
    }
}

    //Написать консольную программу, которая запрашивает у пользователя два целых числа и
      //  выводит на консоль результаты: сложения, вычитания, умножения и деления.

        //1. Создать класс с нужным именем;
        //2. Создать описать main метод;
        //3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
        //Scanner scanner = new Scanner(System.in);
        //int firstNumber = scanner.nextInt();
        //4. Запишите полученные результаты в переменные;
        //5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
        //(каждый результат на новой строке отдельно).