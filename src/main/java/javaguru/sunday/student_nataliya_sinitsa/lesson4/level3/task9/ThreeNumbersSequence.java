package javaguru.sunday.student_nataliya_sinitsa.lesson4.level3.task9;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class ThreeNumbersSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter your third number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing");
        } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("increasing");
        } else {
            System.out.println("neither increasing nor decreasing order");
        }

    }

}
