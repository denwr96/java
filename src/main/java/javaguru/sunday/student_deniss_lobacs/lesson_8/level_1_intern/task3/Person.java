package javaguru.sunday.student_deniss_lobacs.lesson_8.level_1_intern.task3;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Person {
    private String fullName;
    private int age;
    private Address address;

    public Person() {

    }

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


