package javaguru.sunday.student_jelena_lavrenuka.lesson_9.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}


class ClassY extends ClassX {
    public ClassY() {
        super(1);
        System.out.println(2);
    }
}
