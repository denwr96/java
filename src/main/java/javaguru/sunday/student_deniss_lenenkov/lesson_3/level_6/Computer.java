package javaguru.sunday.student_deniss_lenenkov.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

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
