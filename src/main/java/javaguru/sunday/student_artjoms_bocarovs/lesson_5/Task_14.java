package javaguru.sunday.student_artjoms_bocarovs.lesson_5;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class Task_14 {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        array[0] = random.nextInt(100);
        array[1] = random.nextInt(100);
        array[2] = random.nextInt(100);

        int average = (array[0] + array[1] + array[2]) / 3;

        System.out.println("Average is: " + average);

    }
}
