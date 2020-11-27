package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_1_intern.task_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Person {
    private String fullName;
    private int age;
    private Address address;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.fullName);
        System.out.println(person.age);
        System.out.println(person.address);
    }
}
