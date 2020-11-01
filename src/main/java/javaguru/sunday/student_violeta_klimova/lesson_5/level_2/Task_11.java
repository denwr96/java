package main.java.javaguru.sunday.student_violeta_klimova.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter number: ");
            number[i] = scanner.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

}
