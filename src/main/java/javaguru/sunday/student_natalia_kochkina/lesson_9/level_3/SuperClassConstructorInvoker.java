package main.java.javaguru.sunday.student_natalia_kochkina.lesson_9.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_16
@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}