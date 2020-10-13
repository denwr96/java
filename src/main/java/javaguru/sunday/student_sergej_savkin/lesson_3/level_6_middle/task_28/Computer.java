package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_6_middle.task_28;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getManufacturer() {
        return this.manufacturer;
    }
    String getModel(){
        return this.model;
    }
}
