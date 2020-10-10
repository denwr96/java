package main.java.javaguru.sunday.student_deniss_lobacs.lesson_2.homework.level_3_junior.task9;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Все плохо с нужными пробелами. Их надо ставить вокруг ВСЕХ знаков")
public class Multi {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter number: ");
        int yourNumber=scn.nextInt();

        for(int i=1;i<=10;i++) {

            System.out.println(yourNumber*i);

        }

        /*
        Вот так должно было быть
        System.out.print("Enter number: ");
        int yourNumber = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(yourNumber * i);
        }
         */

    }
}
