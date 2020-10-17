package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer() {
        return this.manufacturer;
    }

    String getModel() {
        return this.model;
    }

}
