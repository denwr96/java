package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_5.level_4;

import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array length: ");
        int [] number = new int [scanner.nextInt()];

        System.out.println("Array number: ");
        for (int i = 0; i < number.length; i++){
            number[i] = scanner.nextInt();

        }
        System.out.println("Array element: ");
        for (int i = 0; i < number.length;i++){
            System.out.println(number[i]);
        }
    }
}
