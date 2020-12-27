package javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_4.task15;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class InfiniteLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type your number");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
        }
    }
}
