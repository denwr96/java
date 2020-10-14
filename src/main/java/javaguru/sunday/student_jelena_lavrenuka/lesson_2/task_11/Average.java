package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Переменные не должны называться с большой буквы. Вы не делаете приведение типов в самом уравнении. Если случиться так, что выше число будет дробным" +
        "то вы потеряете все, что после запятой. Попробуйте.")
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
