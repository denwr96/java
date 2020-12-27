package javaguru.sunday.student_deniss_lenenkov.lesson_3.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Car {

    public String model;

    Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}
