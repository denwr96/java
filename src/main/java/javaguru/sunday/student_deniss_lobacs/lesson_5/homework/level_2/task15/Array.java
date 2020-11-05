package main.java.javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_2.task15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class Array  {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[3];

        myArray[0] = random.nextInt(10);
        myArray[1] = random.nextInt(10);
        myArray[2] = random.nextInt(10);
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] + 2 ;
        }

        System.out.println("====================");
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
    }
}
