package main.java.javaguru.sunday.student_natalia_kochkina.lesson_3.level_6.task_24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_24
@CodeReview(approved = true)
public class Wine {

    public String colour;
    public String name;
    public double gradusi;
    public boolean isOpen;

    public Wine(String colour, String name, double gradusi) {
        this.colour = colour;
        this.name = name;
        this.gradusi = gradusi;
    }

    String getName() {
        return this.name;
    }

    public void openTheBottle() {
        isOpen = true;
        System.out.println("Have a nice evening with " + getName());
    }

}
