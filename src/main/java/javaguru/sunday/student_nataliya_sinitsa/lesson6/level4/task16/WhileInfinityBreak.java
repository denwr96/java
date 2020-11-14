package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson6.level4.task16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class WhileInfinityBreak {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Type a number");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
        }

    }

}
