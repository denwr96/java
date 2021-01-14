package javaguru.sunday.student_liana_shirmane.lesson_5.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
//task13
@CodeReview(approved = true)
public class SumOfRandomNumbers {
    public static void main(String[] args) {

        int[] randomNumbersSum = new int[3];
        Random randomSum = new Random();
        for (int i = 0; i < randomNumbersSum.length; i++) {
            randomNumbersSum[i] = randomSum.nextInt(100);
        }
        int Sum = randomNumbersSum[0] + randomNumbersSum[1] + randomNumbersSum[2];
        System.out.println("Sum of three random numbers is " + Sum);
    }
}
