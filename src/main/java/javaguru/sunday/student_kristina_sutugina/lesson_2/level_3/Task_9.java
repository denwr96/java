package main.java.javaguru.sunday.student_kristina_sutugina.lesson_2.level_3;

//Task_9
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int number = input.nextInt();

        for (int i = 0; i < 10; i++) {
            int variable = i + 1;
            int mul = number * variable;
            System.out.println(number + "*" + variable + "=" + mul);
        }
    }
}
