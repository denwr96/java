package javaguru.sunday.student_sergej_savkin.lesson_4.level_1_intern.task_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class EvenOrOddNumber {
    public static void main(String[] args) {
        int enteredNumber;

        System.out.println("PLease enter your number");

        Scanner scanner = new Scanner(System.in);
        enteredNumber = scanner.nextInt();

        if (enteredNumber % 2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
