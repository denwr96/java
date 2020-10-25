package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_3.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Phone {

    public String model;

    Phone(String newModel){
        this.model = newModel;
    }

    public String getModel(){
        return this.model;
    }

}

