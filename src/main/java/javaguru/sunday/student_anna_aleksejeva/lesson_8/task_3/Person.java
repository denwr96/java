package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_8.task_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Формат поехал - я поправил")
public class Person {
    private String fullName;
    private int age;
    private String address;

    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;

    }
}
