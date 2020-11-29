package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_3_junior.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void work();

}
