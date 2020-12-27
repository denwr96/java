package javaguru.sunday.student_nataliya_sinitsa.lesson4.level1.task2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int userNumber = scanner.nextInt();

        if (userNumber < 0) {
            System.out.println(userNumber + " is negative");
        } else if (userNumber > 0) {
            System.out.println(userNumber + " is positive");
        } else {
            System.out.println(userNumber + " is zero");
        }

    }

}
