package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_2.task_12;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 12
@CodeReview(approved = true)
class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

