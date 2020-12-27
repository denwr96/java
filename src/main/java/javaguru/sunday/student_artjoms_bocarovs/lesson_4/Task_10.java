package javaguru.sunday.student_artjoms_bocarovs.lesson_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Your first number: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        System.out.println("Your second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Your third number:");
        int numberThree = scanner.nextInt();

        if (numberOne < numberThree && numberTwo < numberThree) {
            System.out.println("The biggest number is: " + numberOne);
        } else if (numberOne < numberTwo && numberThree < numberTwo) {
            System.out.println("The biggest number is: " + numberTwo);
        } else {
            System.out.println("The biggest number is: " + numberThree);
        }
    }
}
