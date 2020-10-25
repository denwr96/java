package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_6_middle.task_24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Refrigerator {

    String brand;
    String colour;
    boolean doorState;
    boolean lightState;

    Refrigerator(String brand, String colour){
        this.brand = brand;
        this.colour = colour;
    }
    void doorOpen(){
        doorState = true;
        lightState = true;
        System.out.println("Door is open, light is ON");

    }
    void doorClose(){
        doorState = false;
        lightState = false;
        System.out.println("Door is close, light is OFF");
    }



}
