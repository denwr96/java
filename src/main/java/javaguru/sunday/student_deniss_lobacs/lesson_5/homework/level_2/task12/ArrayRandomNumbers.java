package main.java.javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_2.task12;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArrayRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[3];

        myArray[0] = random.nextInt(10);
        myArray[1] = random.nextInt(10);
        myArray[2] = random.nextInt(10);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
      }
}
