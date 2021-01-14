package javaguru.sunday.student_liana_shirmane.lesson_8.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

//task3
@CodeReview(approved = true)
public class Person {
    private String fullName;
    private int age;
    private String address;

    public Person (String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }
}

