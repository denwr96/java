package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_2.level_3;

import main.java.javaguru.sunday.student_sergej_savkin.lesson_2.level_senior.super_task_1.SystemUnit;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Из за того, что у вас нет приведения типов в 21-ой строчке, вы потеряете в точности, если выполните такое деление. Попробуйте привести одну из переменных " +
        "к другому типу. Сделать это надо именно в ходе решения (в 21 строке")
public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        byte x = 3;
        double number = (firstNumber + secondNumber +thirdNumber) / x;
        System.out.println("Number =" + number);


    }
}
