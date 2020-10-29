package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_5.level_2;

import java.util.Scanner;

public class ArrayFromUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        int [] number = new int [3];
        number[0] = scanner.nextInt();
        number[1] = scanner.nextInt();
        number[2] = scanner.nextInt();

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);



    }

}
