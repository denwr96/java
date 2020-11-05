package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_4.task_16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class InfiniteLoopWhileWithExit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int userInput = scanner.nextInt();
            if (userInput == 0){
                break;
            }
            System.out.println("Type 0 to exit");
        }

    }
}