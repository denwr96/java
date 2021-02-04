package javaguru.sunday.student_artjom_proshkin.lesson_5.level_2.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayOfThreeNumbers {

    public static void main(String[] args) {
        int[] arrayOne = {-8, 5, 72};
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println("i = " + i + "; Number = " + arrayOne[i]);
        }
    }
}
