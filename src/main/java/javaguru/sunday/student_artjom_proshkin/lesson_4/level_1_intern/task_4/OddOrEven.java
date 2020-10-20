package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_1_intern.task_4;

import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {

        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number id EVEN");
        } else {
            System.out.println("Number is ODD");
        }
    }
}
