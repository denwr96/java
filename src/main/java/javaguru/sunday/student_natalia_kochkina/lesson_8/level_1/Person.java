package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_3
@CodeReview(approved = true)
public class Person {

    private String fullName;
    private int age;
    private Address address;

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
