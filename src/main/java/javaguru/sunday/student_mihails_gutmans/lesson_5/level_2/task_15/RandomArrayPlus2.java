package main.java.javaguru.sunday.student_mihails_gutmans.lesson_5.level_2.task_15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class RandomArrayPlus2 {

    public static void main(String[] args) {
        int[] myRandomArray = new int[3];


        for (int i = 0 ; i< myRandomArray.length ; i++ ){
            Random randomNumber = new Random();
            myRandomArray [i] =randomNumber.nextInt(100);
            System.out.println(myRandomArray[i]);
        }
        System.out.println("Same numbers +2 ");
        for (int i = 0 ; i< myRandomArray.length ; i++ ){
            System.out.println(myRandomArray[i]+2);
        }
    }
}
