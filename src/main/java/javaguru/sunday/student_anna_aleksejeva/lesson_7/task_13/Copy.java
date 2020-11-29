package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_7.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно было использовать расширенный for")
public class Copy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                j++;
            }
        }
        int[] array = new int[j];
        j = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                array[j] = in[i];
                j++;
            }
        }
        return array;
    }
}
