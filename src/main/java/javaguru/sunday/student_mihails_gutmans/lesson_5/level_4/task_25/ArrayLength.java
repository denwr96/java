package main.java.javaguru.sunday.student_mihails_gutmans.lesson_5.level_4.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы используете переменную arrayLength для двух, совершенно разных целей." +
        "В одном случае, это длинна масива, в другом, это итератор, который вы приравниваете к 0" +
        "лучше в таких целях использовать новую переменную int i = 0 как мы делали.")
public class ArrayLength {

    public static void main(String[] args) {

        System.out.println("Enter lenght of your array");

        Scanner enterArrayLength = new Scanner(System.in);
        int arrayLength = enterArrayLength.nextInt();

        int [] myArray = new int [arrayLength];

        for (arrayLength =0 ; arrayLength < myArray.length ; arrayLength++){
            Scanner enterNumber = new Scanner(System.in);
            int yourNumber = enterNumber.nextInt();
            myArray [arrayLength] = yourNumber;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
