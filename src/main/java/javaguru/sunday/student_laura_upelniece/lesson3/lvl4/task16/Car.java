package javaguru.sunday.student_laura_upelniece.lesson3.lvl4.task16;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Car {

    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {      // +"()"
        return this.model;   // + ";"
    }

}
