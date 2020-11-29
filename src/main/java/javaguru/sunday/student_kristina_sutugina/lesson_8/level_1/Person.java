package main.java.javaguru.sunday.student_kristina_sutugina.lesson_8.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_3
@CodeReview(approved = true)
class Person {

    private String fullName;
    private int age;
    private String address;

    Person() {
        fullName = "Kristina";
        age = 28;
        address = "Rīga";

    }

    void print() {
        System.out.println(fullName + " " + age + " " + address);
    }
}
