package main.java.javaguru.sunday.student_deniss_lobacs;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Перменные необходимо называть правильно." +
        "Необходимо ставить знаки пробела между математическими операциями.")
public class Summ {

    public static void main(String[] args) {

        // First part

        int a=74, b=36, y=10;
        int c=a+b;

        System.out.println("Test Data: 74+36");
        System.out.print("Expected Output: ");
        System.out.println(c);

        System.out.println(); // разделение двух заданий

        // Second part

        int d=50,e=3;
        int f=d/e;

        System.out.println("Test Data: 50/3");
        System.out.print("Expected Output: ");
        System.out.print(f);

    }
}

