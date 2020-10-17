package main.java.javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_6_middle.task28;

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

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    String getModel() {
        return this.model;
    }

    void setModel(String model) {
        this.model = model;
    }


}