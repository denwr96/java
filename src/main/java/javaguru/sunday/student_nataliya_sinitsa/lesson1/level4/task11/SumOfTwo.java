package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson1.level4.task11;


import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Объявлять переменные в одну строку, это плохой стиль кода. Не надо так делать. Не хватает пробелов между математическими знаками")
public class SumOfTwo {
    public static void main(String[] args) {
        int addend1 = 74;
        int addend2 = 36;
        int sum = addend1 + addend2;
        System.out.println(sum);
    }
}
