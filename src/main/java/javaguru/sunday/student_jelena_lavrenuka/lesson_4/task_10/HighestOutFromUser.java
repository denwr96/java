package javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class HighestOutFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three integer numbers");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Highest number is " + numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("Highest number is " + numberTwo);
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println("Highest number is " + numberThree);
        }
    }
}
