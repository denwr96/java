package javaguru.sunday.student_liana_shirmane.lesson_5.level_2;
//task14

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class AverageOfRandomNumbers {
    public static void main(String[] args) {

        int[] randomNumbersAverage = new int[3];
        Random randomAverage = new Random();
        for (int i = 0; i < randomNumbersAverage.length; i++) {
            randomNumbersAverage[i] = randomAverage.nextInt(100);
        }
        int Average = (randomNumbersAverage[0] + randomNumbersAverage[1] + randomNumbersAverage[2])/randomNumbersAverage.length;
        System.out.println("Average of three random numbers is " + Average);
    }
}
