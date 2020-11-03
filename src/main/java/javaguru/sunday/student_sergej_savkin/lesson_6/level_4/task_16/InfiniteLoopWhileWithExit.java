package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_4.task_16;

import java.util.Scanner;

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