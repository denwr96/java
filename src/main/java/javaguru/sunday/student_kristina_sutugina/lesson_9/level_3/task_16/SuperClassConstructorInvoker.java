package main.java.javaguru.sunday.student_kristina_sutugina.lesson_9.level_3.task_16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Call to 'super()' must be first statement in constructor body
@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}
