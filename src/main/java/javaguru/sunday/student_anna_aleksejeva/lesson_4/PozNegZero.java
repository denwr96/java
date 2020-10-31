package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_4;
/// Task_1
/// Task_2


import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Формат совсем пошел в пляс. Поправить все. Посмотрите, как я пишу if else в lessoncode")
public class PozNegZero {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print(" Enter number ");
        int number = sc.nextInt();
        if (number>0) {
            System.out.println(" Number is positive");
        }else if (number==0) {
            System.out.println(" Number is zero ");
        } else { System.out.println(" Number is negative ");


        }
    }

}
