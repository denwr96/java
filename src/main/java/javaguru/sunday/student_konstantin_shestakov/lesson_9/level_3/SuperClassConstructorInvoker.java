package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 16
@CodeReview(approved = false)
@CodeReviewComment(comment = "Нннет, закомментировать проблемную строку, это не исправить ошибку =D")
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
//        super();
        System.out.println(2);
    }
}
