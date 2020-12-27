package javaguru.sunday.student_nataliya_sinitsa.lesson5.level4.task29;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class EvenNumbersFromRandom {

    public static void main(String[] args) {

        int[] arrayForEvenTest = new int[5];

        for (int i = 0; i < arrayForEvenTest.length; i++) {
            Random random = new Random();
            arrayForEvenTest[i] = random.nextInt(50);
        }

        for (int i = 0; i < arrayForEvenTest.length; i++) {
            System.out.println(i + " item is " + arrayForEvenTest[i]);
        }

        System.out.println("Even numbers are:");
        for (int number : arrayForEvenTest) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }

}
