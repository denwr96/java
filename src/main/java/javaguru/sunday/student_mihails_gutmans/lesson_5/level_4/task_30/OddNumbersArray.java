package main.java.javaguru.sunday.student_mihails_gutmans.lesson_5.level_4.task_30;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы используете переменную arrayLength для двух, совершенно разных целей." +
        "В одном случае, это длинна масива, в другом, это итератор, который вы приравниваете к 0" +
        "лучше в таких целях использовать новую переменную int i = 0 как мы делали.")
public class OddNumbersArray {

    public static void main(String[] args) {
        System.out.println("Enter lenght of your array");

        Scanner enterArrayLength = new Scanner(System.in);
        int i = enterArrayLength.nextInt();

        int[] myArray = new int[i];

        for (i = 0; i < myArray.length; i++) {
            Random random = new Random();
            myArray[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(myArray));


        for (i= 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                int evenNumber = myArray[i];
            } else {
                int oddNumber = myArray[i];
                System.out.println("Odd number : " + oddNumber);
            }
        }
    }
}
