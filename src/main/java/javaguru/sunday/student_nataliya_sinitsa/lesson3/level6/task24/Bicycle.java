package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Bicycle {

    String color;
    String model;
    boolean availability;

    public void availability () {
        System.out.println(color + " " + model + " is not available.");
    }

    public boolean changeAvailability () {
        availability = true;
        System.out.println(color + " " + model + " is available now.");
        return availability;
    }

    Bicycle (String bicycleColor, String bicycleModel, boolean bicycleAvailability) {
        this.color = bicycleColor;
        this.model = bicycleModel;
    }

}
