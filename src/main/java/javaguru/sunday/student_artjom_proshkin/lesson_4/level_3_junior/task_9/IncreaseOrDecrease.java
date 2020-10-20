package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_3_junior.task_9;

import java.util.Scanner;

class IncreaseOrDecrease {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you be so kind and enter number: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Sorry to bother, I need another number: ");
        double numberTwo = scanner.nextDouble();
        System.out.println("I'll be gone when you enter third number: ");
        double numberThree = scanner.nextDouble();

        if (numberOne > numberTwo && numberTwo > numberThree && numberOne > numberThree){
            System.out.println("Decreasing order of numbers");
        } else if (numberOne < numberTwo && numberTwo < numberThree && numberOne < numberThree){
            System.out.println("Increasing order of numbers");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
