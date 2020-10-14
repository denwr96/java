package main.java.javaguru.sunday.student_valeri_rozov.lesson1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Плохие названия переменных")
public class Divide {
    public static void main(String[] args) {
        int x = 50;
        int y = 3;
        int z = x/y;
        System.out.println(z);
    }
}
