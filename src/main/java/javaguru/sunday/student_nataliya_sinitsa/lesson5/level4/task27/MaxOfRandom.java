package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson5.level4.task27;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class MaxOfRandom {

    public static void main(String[] args) {

        int[] arrayForMaxTest = new int[5];

        for (int i = 0; i < arrayForMaxTest.length; i++) {
            Random random = new Random();
            arrayForMaxTest[i] = random.nextInt(50);
        }

        for (int i = 0; i < arrayForMaxTest.length; i++) {
            System.out.println(i + " item is " + arrayForMaxTest[i]);
        }

        int maxNumber = arrayForMaxTest[0];
        for (int i = 1; i < arrayForMaxTest.length; i++) {
            if (arrayForMaxTest[i] > maxNumber) {
                maxNumber = arrayForMaxTest[i];
            }
        }
        System.out.println("Max number is: " + maxNumber);

    }

}
