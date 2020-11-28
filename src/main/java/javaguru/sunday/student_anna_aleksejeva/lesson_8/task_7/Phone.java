package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_8.task_7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Phone {
    String model;
    String color;
    int price;

    public Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
