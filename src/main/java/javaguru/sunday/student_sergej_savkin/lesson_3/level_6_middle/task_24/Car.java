package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_6_middle.task_24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Car {
    String manufacturer;
    double maxSpeed;
    int mileage;

    Car(String manufacturer, double maxSpeed, int mileage){
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    }
    void drive(){
        System.out.println(manufacturer + " car is driving " + maxSpeed + "km/h for 1 minute");
    }
    void mileageChange(){
        System.out.println("New mileage is " + (mileage + maxSpeed/60) + "km");
    }
}
