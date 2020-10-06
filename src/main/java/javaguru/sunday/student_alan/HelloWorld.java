package main.java.javaguru.sunday.student_alan;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Молодец!")
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


}
