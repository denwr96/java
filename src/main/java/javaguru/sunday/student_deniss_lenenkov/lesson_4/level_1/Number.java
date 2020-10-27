package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_4.level_1;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:  ");
        int number = scanner.nextInt();

         if (number % 2 == 0){
             System.out.println("Чётное");
         }else
             System.out.println("Нечётное");
    }

}
