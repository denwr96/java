package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_3_junior.task_10;

import java.util.Scanner;

class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you be so kind and enter number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Sorry to bother, I need another number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("I'll be gone when you enter third number: ");
        int numberThree = scanner.nextInt();

        if (numberOne >= numberTwo && numberOne >= numberThree){
            System.out.println("Maximal number is " + numberOne);
        } else if (numberOne <= numberTwo && numberTwo >= numberThree){
            System.out.println("Maximal number is " + numberTwo);
        } else {
            System.out.println("Maximal number is " + numberThree);
        }
    }
}
