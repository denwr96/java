package javaguru.sunday.student_deniss_lenenkov.lesson_5.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArrayRandomSum {
    public static void main(String[] args) {

        Random random = new Random();
        int[] number = new int[3];

        Random random1 = new Random();
        int sum = 0;

        for (int i = 0; i < number.length;i++){
            number[i] = random.nextInt(100);
            sum = sum + number[i];

        }
        System.out.println("Array sum = " + sum);



    }
}
