package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_2_intern.task12;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

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

public class TestClass {
    public static void main(String[] args) {
        C c = new C();
    }
}