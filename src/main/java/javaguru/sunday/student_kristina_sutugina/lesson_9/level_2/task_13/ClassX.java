package javaguru.sunday.student_kristina_sutugina.lesson_9.level_2.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;
//переделала
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