package main.java.javaguru.sunday.student_artjom_proshkin.lesson_8.level_2_intern.task_7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class MobilePhone extends Phone {

    int batteryCapacity;

    MobilePhone (String manufacturer, String OS,int batteryCapacity){
        super(manufacturer, OS);
        this.batteryCapacity = batteryCapacity;
    }
}
