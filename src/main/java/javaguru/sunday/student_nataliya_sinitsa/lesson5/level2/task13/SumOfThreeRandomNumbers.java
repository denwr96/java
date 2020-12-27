package javaguru.sunday.student_nataliya_sinitsa.lesson5.level2.task13;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class SumOfThreeRandomNumbers {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        array[0] = random.nextInt(100);
        array[1] = random.nextInt(100);
        array[2] = random.nextInt(100);

        int sum = array[0] + array[1] + array[2];
        System.out.println("Sum is: " + sum);

//        int sumByCycle = 0;
//        for (int i = 0; i < 3; i++) {
//            sumByCycle = sumByCycle + array[i];
//        }
//        System.out.println("Sum using cycle is: " + sumByCycle);

    }

}
