package javaguru.sunday.student_laura_upelniece.lesson3.lvl4.task15;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Phone {

    String model; // -"{"

    Phone(String newModel) { //Book -> Phone
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}
