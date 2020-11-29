package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_2_intern.task_7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ElectricCar extends Car {

    int batteryCapacity;

    ElectricCar(String manufacturer, int manufactureYear, int batteryCapacity) {
        super(manufacturer, manufactureYear);
        this.batteryCapacity = batteryCapacity;
    }
}
