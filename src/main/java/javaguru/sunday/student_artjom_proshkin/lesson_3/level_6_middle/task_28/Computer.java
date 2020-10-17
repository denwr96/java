package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_6_middle.task_28;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Нельзя писать целые конструкции в строчку. Между конструкциями должен быть один new line")
class Computer {

    String manufacturer;
    String model;

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
