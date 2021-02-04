package javaguru.sunday.student_liana_shirmane.lesson_12.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//task26
@CodeReview(approved = true)
public class StackOverflowErrorExample {
    static int i = 0;

    public static int printNumber(int x) {
        i = i + 2;
        System.out.println(i);
        return i + printNumber(i + 2);
    }

    public static void main(String[] args) {
        StackOverflowErrorExample.printNumber(i);
    }
}
