package javaguru.sunday.student_sergej_savkin.lesson_9.level_2_intern.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    ClassY(int i) {
        super(i);
        System.out.println(2);
    }
}
