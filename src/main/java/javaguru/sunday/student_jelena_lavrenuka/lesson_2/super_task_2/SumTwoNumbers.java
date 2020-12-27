package javaguru.sunday.student_jelena_lavrenuka.lesson_2.super_task_2;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Поправил вам отступы от края. Очень много лишних")
public class SumTwoNumbers {

    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 20;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        //    int numberOne = 10; - значение переменных задано выше
        //    int numberTwo = 20;

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }

}

