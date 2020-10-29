package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_5.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArrayIncrase {
    public static void main(String[] args) {

        Random random = new Random();
        int[] number = new int[3];

        for ( int i = 0; i < number.length; i++){
            number[i] = random.nextInt(100);
        }
        System.out.println("First number: " + number[0]);
        System.out.println("Second number: " + number[1]);
        System.out.println("Third number: " + number[2]);

        number[0] = number[0] + 2;
        number[1] = number[1] + 2;
        number[2] = number[2] + 2;

        System.out.println("First number: " + number[0]);
        System.out.println("Second number: " + number[1]);
        System.out.println("Third number: " + number[2]);



    }
}
