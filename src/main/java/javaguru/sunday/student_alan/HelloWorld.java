package javaguru.sunday.student_alan;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Молодец!")
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


}