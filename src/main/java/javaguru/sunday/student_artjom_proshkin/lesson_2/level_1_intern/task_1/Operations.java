package javaguru.sunday.student_artjom_proshkin.lesson_2.level_1_intern.task_1;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me number for calculations : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please give me another number for calculations : ");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum of your numbers is : " + (firstNumber + secondNumber));
        System.out.println("Difference of your numbers is : " + (firstNumber - secondNumber));
        System.out.println("Multiplication product of your numbers is : " + (firstNumber * secondNumber));
        System.out.println("Division of your numbers is : " + (firstNumber / secondNumber) );
    }
}
