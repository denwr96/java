package main.java.javaguru.sunday.student_valeri_rozov.lesson1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Плохие названия переменных")
public class Task11 {
    public static void main(String[] args) {
        int x = 74;
        int y = 36;
        int z = x + y;
        System.out.println(z);
    }
}
