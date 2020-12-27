package javaguru.sunday.student_deniss_lenenkov.lesson_5.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArrayRandom {
    public static void main(String[] args) {

        Random random = new Random();
        int [] number = new int [3];

        for (int i = 0; i < number.length;i++) {
            number[i] = random.nextInt(10);
        }
        System.out.println("First number: " + number[0]);
        System.out.println("Second number: "  + number[1]);
        System.out.println("Third number: " + number[2]);

    }
}
