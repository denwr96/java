package javaguru.sunday.student_glebs_surtajevs.lesson_5.level_4.task_30;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class Task_30 {
    public static void main(String[] args) {
        int[] arrayLength = new int[9];
        Random random = new Random();

        for (int i = 0; i < arrayLength.length; i++) {
            arrayLength[i] = random.nextInt(100);
        }
        for (int k : arrayLength) {
            System.out.println(k);
        }
        int oddNumber = arrayLength[0];
        for (int j : arrayLength) {
            if (j % 2 != 0) {
                oddNumber = j;
            }
        }
        System.out.println("Odd number is: " + oddNumber);

    }
}
