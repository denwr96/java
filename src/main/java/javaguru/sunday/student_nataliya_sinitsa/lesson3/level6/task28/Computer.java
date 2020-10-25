package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task28;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Computer {

    String manufacturer;
    String model;

    String getManufacturer() {
        return manufacturer;
    }

    String getModel() {
        return model;
    }

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

}