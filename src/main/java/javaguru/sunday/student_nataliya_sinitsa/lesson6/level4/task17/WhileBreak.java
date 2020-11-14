package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson6.level4.task17;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class WhileBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number");
        int userInput = scanner.nextInt();

        int i = 0;
        while (i < userInput) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }

}
