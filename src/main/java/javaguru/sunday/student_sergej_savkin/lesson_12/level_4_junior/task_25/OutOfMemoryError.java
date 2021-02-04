package javaguru.sunday.student_sergej_savkin.lesson_12.level_4_junior.task_25;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class OutOfMemoryError {

    public static void main(String[] args) {
        List<OutOfMemoryError> list = new ArrayList<>();
        for (; ; ) {
            list.add(new OutOfMemoryError());
        }
    }
}
