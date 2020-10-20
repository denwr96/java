package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_3_junior.task_8;

import java.util.Scanner;

class DifferentOrEqualOrElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you be so kind and enter number: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Sorry to bother, I need another number: ");
        double numberTwo = scanner.nextDouble();
        System.out.println("I'll be gone when you enter third number: ");
        double numberThree = scanner.nextDouble();

        if (numberOne == numberTwo && numberOne == numberThree){
            System.out.println("All numbers are equal");
        } else if(numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

}
