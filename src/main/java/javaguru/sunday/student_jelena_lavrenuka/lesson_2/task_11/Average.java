package javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
public class Average {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Input three numbers: ");
        double number1 = Scanner.nextDouble();
        double number2 = Scanner.nextDouble();
        double number3 = Scanner.nextDouble();

    //    byte three = 3;

        double average = (number1 + number2 + number3) / 3;
        System.out.println("Average = " + average);
    }
}
