package main.java.javaguru.sunday.student_mihails_gutmans.lesson1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Все очень плохо с форматом в классе. Посмотрите, как у меня в классах поставлены фигурные скобки у класса, и у метода")
public class Task11

{public static void main(String[] args){
    System.out.println("SumResult = "+ (74+36));
    System.out.println("DivideResult = "+ (50/3));
}
}
