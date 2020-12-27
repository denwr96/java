package javaguru.sunday.student_artjoms_bocarovs.lesson_5;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class Task_12 {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        array[0] = random.nextInt(1000);
        array[1] = random.nextInt(1000);
        array[2] = random.nextInt(1000);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
