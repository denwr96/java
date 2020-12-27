package javaguru.sunday.student_anna_aleksejeva.lesson_5;

import javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_2.task15.Array;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArrayInt15 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(" First number " + array[0]);
        System.out.println(" Second number " + array[1]);
        System.out.println(" Third number " + array[2]);

        array[0] = array[0] + 2;
        array[1] = array[1] + 2;
        array[2] = array[2] + 2;

        System.out.println("Updated first number " + array[0]);
        System.out.println("Updated second number " + array[1]);
        System.out.println("Updated third number " + array[2]);



    }
}
