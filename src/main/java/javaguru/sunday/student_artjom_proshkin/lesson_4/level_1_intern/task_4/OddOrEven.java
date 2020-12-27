package javaguru.sunday.student_artjom_proshkin.lesson_4.level_1_intern.task_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class OddOrEven {
    public static void main(String[] args) {

        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number id EVEN");
        } else {
            System.out.println("Number is ODD");
        }
    }
}
