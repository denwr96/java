package javaguru.sunday.student_konstantin_shestakov.lesson_1.level_4_junior.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
// 06.10.20 - Исправлено
//Я вижу изменения в версиях. Но спасибо за коммент =)

public class SumAndDivide {

    public static void main(String[] args) {
        // Sum
        byte numberOne = 74;
        byte numberTwo = 36;
        System.out.println("Test Data: ");
        System.out.println(numberOne + " + " + numberTwo);
        System.out.println("Output: ");
        System.out.println(numberOne + numberTwo);

        System.out.println("-----------------------------------------------------------------");

       // Divide
        byte numberThree = 50;
        byte numberFour = 3;
        System.out.println("Test Data: ");
        System.out.println(numberThree + " / " + numberFour);
        System.out.println("Output: ");
        System.out.print(numberThree / numberFour);
    }
}
