package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_1.task_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task4 {

    public static void main(String[] args) {

        System.out.println("Enter integer: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput %2 == 0) {
            System.out.println("Your chosen integer is even");
        }
        else {
            System.out.println("Your chosen integer is uneven");
        }
    }
}
