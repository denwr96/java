package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_1_intern.task_1;

import java.util.Scanner;

class PositiveOrNegative {
    public static void main(String[] args) {

        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("Number you entered is NEGATIVE");
        } else if (number > 0){
            System.out.println("Number you entered is POSITIVE");
        } else {
            System.out.println("You entered ZERO, let's try again");
        }
    }
}
