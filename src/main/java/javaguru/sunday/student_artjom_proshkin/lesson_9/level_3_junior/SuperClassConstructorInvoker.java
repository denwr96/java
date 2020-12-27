package javaguru.sunday.student_artjom_proshkin.lesson_9.level_3_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {

    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}
