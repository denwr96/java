package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson5.level2.task14;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class AverageOfThreeRandomNumbers {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        array[0] = random.nextInt(100);
        array[1] = random.nextInt(100);
        array[2] = random.nextInt(100);

        int average = (array[0] + array[1] + array[2]) / 3;

        System.out.println("Average is: " + average);

//        int sum = 0;
//        for (int i = 0; i < 3; i++) {
//            sum = sum + array[i];
//        }
//        int averageByCycle = sum / array.length;
//        System.out.println("Average using cycle is: " + averageByCycle);

    }

}
