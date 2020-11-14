package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_4.task16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class InfiniteLoopWhileWithBreak {

    public static void main(String[] args) {

        while (true) {
            System.out.println("INFINITE LOOP");
            break;
        }
    }
}

