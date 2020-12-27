package javaguru.sunday.student_mihails_gutmans.lesson3.level_4.task_15;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Phone {

    private String model;

    Phone (String myModel) {
        this.model = myModel;
    }

    String getModel() {
        return this.model;
    }
}
