package main.java.javaguru.sunday.student_kristina_sutugina.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_28
@CodeReview(approved = true)
class Computer {

    public String manufacturer;
    public String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
   String getManufacturer(){
        return this.manufacturer;
    }
    String getModel(){
        return this.model;
    }
}