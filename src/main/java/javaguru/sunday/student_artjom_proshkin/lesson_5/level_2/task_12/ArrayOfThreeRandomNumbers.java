package javaguru.sunday.student_artjom_proshkin.lesson_5.level_2.task_12;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ArrayOfThreeRandomNumbers {

    public static void main(String[] args) {

        int[] arrayThree = new int[3];
        Random random = new Random();
        for (int i = 0; i < arrayThree.length; i++) {
            arrayThree[i] = random.nextInt(15);
        }
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.println("i = " + i + "; Number = " + arrayThree[i]);
        }
    }
}
