package javaguru.sunday.student_deniss_lobacs.lesson_12.level_3_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

// task18
@CodeReview(approved = true)
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        Object obj = null;
        obj.hashCode();
    }
}
