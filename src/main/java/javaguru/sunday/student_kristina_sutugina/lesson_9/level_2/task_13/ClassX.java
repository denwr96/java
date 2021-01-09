package javaguru.sunday.student_kristina_sutugina.lesson_9.level_2.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;
//переделала
@CodeReview(approved = false)
@CodeReviewComment(comment = "system out должен был остаться в пределах конструктора. Важно соблюдать порядок, когда вызывается конструктор родителя")
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