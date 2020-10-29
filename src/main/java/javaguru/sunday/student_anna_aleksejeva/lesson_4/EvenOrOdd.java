package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Формат совсем пошел в пляс. Поправить все. Посмотрите, как я пишу if else в lessoncode")
public class EvenOrOdd {
    public static void main(String[]args){
        System.out.println(" Enter number ");
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();
        if
        (number % 2 == 0 ) {
            System.out.println(" Even ");
        }
            else {

                System.out.println(" Odd ");
        }
    }
}
