package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_2_intern.task13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY() {
        super(2);
        System.out.println(2);
    }
}